package net.yuanmomo.searchrescue.web.business;

import java.util.Date;
import java.util.List;

import net.yuanmomo.searchrescue.web.bean.BeaconInfo;
import net.yuanmomo.searchrescue.web.bean.BeaconInfoCriteria;
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
		BeaconInfoCriteria param=new BeaconInfoCriteria();
		param.createCriteria().andBeaconNoEqualTo(beaconNo);
		int count = this.beaconInfoMapper.countByExample(param);
		if (count > 0) {
			return true;// BeaconNo已经存在，不能使用
		}
		return false;
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public boolean insert(BeaconInfo beacon){
		return this.beaconInfoMapper.insert(beacon)>0?true:false;
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public boolean insert(String beaconNo,UserInfo user){
		BeaconInfo beacon=new BeaconInfo();
		beacon.setBeaconNo(beaconNo);
		beacon.setLastUpdateByUserId(user.getId());
		beacon.setLastUpdateByUserStyle(user.getUserStyle());
		beacon.setLastUpdateTime(new Date());
		beacon.setState((byte)1);
		return this.beaconInfoMapper.insert(beacon)>0?true:false;
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public boolean deleteBeaconNos(String beaconNoIds,UserInfo user) throws Exception{
		String[] ids=beaconNoIds.split(",");
		long[] longIds=new long[ids.length];
		try {
			for(int i=0;i<ids.length;i++){
				longIds[i]=Long.parseLong(ids[i]);
			}
		} catch (Exception e) {
			throw e;
		}
		for(int i=0;i<longIds.length;i++){
			BeaconInfo beacon=this.beaconInfoMapper.selectByPrimaryKey(longIds[i]);
			if(beacon!=null){
				beacon.setLastUpdateByUserId(user.getId());
				beacon.setLastUpdateByUserStyle(user.getUserStyle());
				beacon.setLastUpdateTime(new Date());
				beacon.setState((byte)4);
				this.beaconInfoMapper.updateByPrimaryKey(beacon);
			}
		}
		return true;
	}
	public BeaconInfo getOneBeacon(String beaconNo){
		BeaconInfoCriteria param=new BeaconInfoCriteria();
		param.createCriteria().andBeaconNoEqualTo(beaconNo).andStateEqualTo((byte)1);
		List<BeaconInfo> li=this.beaconInfoMapper.selectByExample(param);
		if(li!=null && li.size()>0){
			return li.get(0);
		}
		return null;
	}
	public BeaconInfo getOneBeacon(long id){
		return this.beaconInfoMapper.selectByPrimaryKey(id);
	}
}
