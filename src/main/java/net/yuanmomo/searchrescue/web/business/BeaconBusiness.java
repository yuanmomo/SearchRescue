package net.yuanmomo.searchrescue.web.business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.yuanmomo.searchrescue.web.bean.BeaconInfo;
import net.yuanmomo.searchrescue.web.bean.BeaconInfoCriteria;
import net.yuanmomo.searchrescue.web.bean.BoughtBeacon;
import net.yuanmomo.searchrescue.web.bean.BoughtBeaconCriteria;
import net.yuanmomo.searchrescue.web.bean.IdInfo;
import net.yuanmomo.searchrescue.web.bean.IdInfoCriteria;
import net.yuanmomo.searchrescue.web.bean.PassportInfo;
import net.yuanmomo.searchrescue.web.bean.PassportInfoCriteria;
import net.yuanmomo.searchrescue.web.bean.UserInfo;
import net.yuanmomo.searchrescue.web.util.BasicBusiness;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BeaconBusiness extends BasicBusiness {

	public boolean isBeaconNoExist(String beaconNo) {
		// 判断BeaconNo是不是已经存在
		BeaconInfoCriteria param = new BeaconInfoCriteria();
		param.createCriteria().andBeaconNoEqualTo(beaconNo);
		int count = this.beaconInfoMapper.countByExample(param);
		if (count > 0) {
			return true;// BeaconNo已经存在，不能使用
		}
		return false;
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public boolean insert(BeaconInfo beacon) {
		return this.beaconInfoMapper.insert(beacon) > 0 ? true : false;
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public boolean insert(String beaconNo, UserInfo user) {
		BeaconInfo beacon = new BeaconInfo();
		beacon.setBeaconNo(beaconNo);
		beacon.setLastUpdateByUserId(user.getId());
		beacon.setLastUpdateByUserStyle(user.getUserStyle());
		beacon.setLastUpdateTime(new Date());
		beacon.setState((byte) 1);
		return this.beaconInfoMapper.insert(beacon) > 0 ? true : false;
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public boolean deleteBeaconNos(String beaconNoIds, UserInfo user)
			throws Exception {
		String[] ids = beaconNoIds.split(",");
		long[] longIds = new long[ids.length];
		try {
			for (int i = 0; i < ids.length; i++) {
				longIds[i] = Long.parseLong(ids[i]);
			}
		} catch (Exception e) {
			throw e;
		}
		for (int i = 0; i < longIds.length; i++) {
			BeaconInfo beacon = this.beaconInfoMapper
					.selectByPrimaryKey(longIds[i]);
			if (beacon != null) {
				beacon.setLastUpdateByUserId(user.getId());
				beacon.setLastUpdateByUserStyle(user.getUserStyle());
				beacon.setLastUpdateTime(new Date());
				beacon.setState((byte) 4);
				this.beaconInfoMapper.updateByPrimaryKey(beacon);
			}
		}
		return true;
	}

	public BeaconInfo getOneBeacon(String beaconNo) {
		BeaconInfoCriteria param = new BeaconInfoCriteria();
		param.createCriteria().andBeaconNoEqualTo(beaconNo)
				.andStateEqualTo((byte) 1);
		List<BeaconInfo> li = this.beaconInfoMapper.selectByExample(param);
		if (li != null && li.size() > 0) {
			return li.get(0);
		}
		return null;
	}

	public BeaconInfo getOneBeacon(long id) {
		return this.beaconInfoMapper.selectByPrimaryKey(id);
	}

	public BeaconInfo getOneRandomBeacon() {
		BeaconInfoCriteria param = new BeaconInfoCriteria();
		param.createCriteria().andStateEqualTo((byte) 1);
		param.setOrderByClause(" Rand() ");
		param.setLimitStartAndEnd(" 0,1 ");
		List<BeaconInfo> li = this.beaconInfoMapper.selectByExample(param);
		if (li != null && li.size() > 0) {
			return li.get(0);
		}
		return null;
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public boolean doBuyBeaconByRegisterUser(long beaconId, UserInfo user,
			Date buyBeaconDate) throws Exception {
		// 查询出当前的信标
		BeaconInfoCriteria param = new BeaconInfoCriteria();
		param.createCriteria().andIdEqualTo(beaconId).andStateEqualTo((byte) 1);
		List<BeaconInfo> beaconList = this.beaconInfoMapper
				.selectByExample(param);
		if (beaconList != null && beaconList.size() > 0) {
			BeaconInfo beacon = beaconList.get(0);
			if (beacon != null) {
				beacon.setState((byte) 3);
				beacon.setLastUpdateByUserId(user.getId());
				beacon.setLastUpdateTime(buyBeaconDate);
				beacon.setLastUpdateByUserStyle(user.getUserStyle());
				return this.beaconInfoMapper.updateByPrimaryKey(beacon) > 0 ? true
						: false;
			}
		}
		return false;
	}

	// 查询该用户的购买信标情况
	public List<BoughtBeacon> queryBoughtBeacon(UserInfo user) {
		BeaconInfoCriteria param = new BeaconInfoCriteria();
		param.createCriteria().andLastUpdateByUserIdEqualTo(user.getId())
				.andStateEqualTo((byte) 3);
		List<BeaconInfo> beaconList = this.beaconInfoMapper
				.selectByExample(param);
		List<BoughtBeacon> boughtBeacon = null;
		IdInfo idInfo = null;
		PassportInfo passportInfo = null;
		if (user.getCerStyle() == 1) {
			IdInfoCriteria idParam = new IdInfoCriteria();
			idParam.createCriteria().andUserInfoIdEqualTo(user.getId());
			List<IdInfo> idInfoList = this.idInfoMapper
					.selectByExample(idParam);
			idInfo = idInfoList.get(0);
		} else {
			PassportInfoCriteria passParam = new PassportInfoCriteria();
			passParam.createCriteria().andUserinfoIdEqualTo(user.getId());
			List<PassportInfo> passInfoList = this.passportInfoMapper
					.selectByExample(passParam);
			passportInfo = passInfoList.get(0);
		}
		if (beaconList != null && beaconList.size() > 0) {
			boughtBeacon = new ArrayList<BoughtBeacon>();
			BoughtBeacon bought = null;
			for (BeaconInfo b : beaconList) {
				if (b != null) {
					bought = new BoughtBeacon();
					bought.setBeaconNo(b.getBeaconNo());
					bought.setBoughtDate((new SimpleDateFormat("yyyy-MM-dd")
							.format(b.getLastUpdateTime())));
					bought.setUserName(user.getRealName());
					if (idInfo != null) {
						bought.setCerNo(idInfo.getCerNo());
					} else if (passportInfo != null) {
						bought.setPassportNo(passportInfo.getPassportNo());
					}
					boughtBeacon.add(bought);
				}
			}
		}
		return boughtBeacon;
	}

	// 查询该用户的购买信标情况
	public List<BoughtBeacon> queryBoughtBeacon(String userName,
			String beaconNo, String passportNo, String cerNo) {
		if (userName == null && beaconNo == null && passportNo == null
				&& cerNo == null) {
			return this.boughtBeaconMapper.selectByExample(null);
		}
		// 搜索视图 BoughtBeacon
		BoughtBeaconCriteria param = new BoughtBeaconCriteria();
		BoughtBeaconCriteria.Criteria criteria =param.createCriteria();
		if (userName != null && !"".equals(userName)) {
			criteria=criteria.andUserNameLike("%" + userName + "%");
		}
		if (beaconNo != null && !"".equals(beaconNo)) {
			criteria=criteria.andBeaconNoLike("%" + beaconNo + "%");
		}
		if (passportNo != null && !"".equals(passportNo)) {
			criteria=criteria.andPassportNoLike("%" + passportNo + "%");
		}
		if (cerNo != null && !"".equals(cerNo)) {
			criteria=criteria.andCerNoLike("%" + cerNo + "%");
		}
		criteria=criteria.andStateEqualTo((byte)3);
		return this.boughtBeaconMapper.selectByExample(param);
	}
}
