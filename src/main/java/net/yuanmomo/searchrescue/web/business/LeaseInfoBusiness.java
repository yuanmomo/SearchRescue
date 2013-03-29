package net.yuanmomo.searchrescue.web.business;

import net.yuanmomo.searchrescue.web.bean.BeaconInfo;
import net.yuanmomo.searchrescue.web.bean.LeaseInfo;
import net.yuanmomo.searchrescue.web.bean.UserInfoID;
import net.yuanmomo.searchrescue.web.bean.UserInfoPassport;
import net.yuanmomo.searchrescue.web.util.BasicBusiness;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LeaseInfoBusiness extends BasicBusiness {
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public boolean insert(LeaseInfo lease){
		return this.leaseInfoMapper.insert(lease)>0?true:false;
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public boolean insert(UserInfoID userInfoId,BeaconInfo beacon){
		LeaseInfo lease=new LeaseInfo();
		lease.setBeaconId(beacon.getId());
		lease.setStartDate(userInfoId.getBuyBeaconDate());
		lease.setUserId(userInfoId.getUserInfoId());
		lease.setIsReturned((byte)0);
		return this.leaseInfoMapper.insert(lease)>0?true:false;
	}
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public boolean insert(UserInfoPassport userPassportId,BeaconInfo beacon){
		LeaseInfo lease=new LeaseInfo();
		lease.setBeaconId(beacon.getId());
		lease.setStartDate(userPassportId.getBuyBeaconDate());
		lease.setUserId(userPassportId.getUserInfoId());
		lease.setIsReturned((byte)0);
		return this.leaseInfoMapper.insert(lease)>0?true:false;
	}
}
