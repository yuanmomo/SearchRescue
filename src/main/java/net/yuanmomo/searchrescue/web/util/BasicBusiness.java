package net.yuanmomo.searchrescue.web.util;

import javax.annotation.Resource;

import net.yuanmomo.searchrescue.web.mapper.BeaconInfoMapper;
import net.yuanmomo.searchrescue.web.mapper.IdInfoMapper;
import net.yuanmomo.searchrescue.web.mapper.LeaseInfoMapper;
import net.yuanmomo.searchrescue.web.mapper.PassportInfoMapper;
import net.yuanmomo.searchrescue.web.mapper.UserInfoMapper;

public class BasicBusiness {
	// 将spring 配置文件中的bean 通过setter注入进来
	@Resource(name = "beaconInfoMapper")
	protected BeaconInfoMapper beaconInfoMapper;
	@Resource(name = "idInfoMapper")
	protected IdInfoMapper idInfoMapper;
	@Resource(name = "leaseInfoMapper")
	protected LeaseInfoMapper leaseInfoMapper;
	@Resource(name = "passportInfoMapper")
	protected PassportInfoMapper passportInfoMapper;
	@Resource(name = "userInfoMapper")
	protected UserInfoMapper userInfoMapper;
	public BeaconInfoMapper getBeaconInfoMapper() {
		return beaconInfoMapper;
	}
	public void setBeaconInfoMapper(BeaconInfoMapper beaconInfoMapper) {
		this.beaconInfoMapper = beaconInfoMapper;
	}
	public IdInfoMapper getIdInfoMapper() {
		return idInfoMapper;
	}
	public void setIdInfoMapper(IdInfoMapper idInfoMapper) {
		this.idInfoMapper = idInfoMapper;
	}
	public LeaseInfoMapper getLeaseInfoMapper() {
		return leaseInfoMapper;
	}
	public void setLeaseInfoMapper(LeaseInfoMapper leaseInfoMapper) {
		this.leaseInfoMapper = leaseInfoMapper;
	}
	public UserInfoMapper getUserInfoMapper() {
		return userInfoMapper;
	}
	public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
		this.userInfoMapper = userInfoMapper;
	}
	public PassportInfoMapper getPassportInfoMapper() {
		return passportInfoMapper;
	}
	public void setPassportInfoMapper(PassportInfoMapper passportInfoMapper) {
		this.passportInfoMapper = passportInfoMapper;
	}
}
