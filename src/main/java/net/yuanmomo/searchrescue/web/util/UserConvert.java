package net.yuanmomo.searchrescue.web.util;

import net.yuanmomo.searchrescue.web.bean.IdInfo;
import net.yuanmomo.searchrescue.web.bean.UserInfo;
import net.yuanmomo.searchrescue.web.bean.UserInfoID;

public class UserConvert {
	public static UserInfo convertUserInfoIDToUserInfo(UserInfoID userInfoId){
		if(userInfoId!=null){
			UserInfo userInfo=new UserInfo();
			userInfo.setId(userInfoId.getUserInfoId());
			userInfo.setUserName(userInfoId.getUserName());
			userInfo.setPassword(userInfoId.getPassword());
			userInfo.setRealName(userInfoId.getRealName());
			userInfo.setCerStyle(userInfoId.getCerStyle());
			userInfo.setUserStyle(userInfoId.getUserStyle());
			userInfo.setCipher(userInfoId.getCipher());
			userInfo.setVersion(userInfoId.getUserInfoVersion());
			userInfo.setIsDeleted(userInfoId.getUserInfoIsDeleted());
			return userInfo;
		}
		return null;
	}
	public static IdInfo convertUserInfoIDToIdInfo(UserInfoID userInfoId){
		if(userInfoId!=null){
			IdInfo idInfo=new IdInfo();
			idInfo.setId(userInfoId.getIdInfoId());
			idInfo.setUserInfoId(userInfoId.getUserInfoId());
			idInfo.setSex(userInfoId.getSex());
			idInfo.setNation(userInfoId.getNation());
			idInfo.setBirthday(userInfoId.getBirthday());
			idInfo.setAddress(userInfoId.getAddress());
			idInfo.setPhone(userInfoId.getPhone());
			idInfo.setCerNo(userInfoId.getCerNo());
			idInfo.setAuthority(userInfoId.getAuthority());
			idInfo.setEffecDuration(userInfoId.getEffecDuration());
			idInfo.setStartTime(userInfoId.getStartTime());
			idInfo.setEndTime(userInfoId.getEndTime());
			idInfo.setPhoto(userInfoId.getPhoto());
			idInfo.setPhotoPath(userInfoId.getPhotoPath());
			idInfo.setRegisterTime(userInfoId.getRegisterTime());
			idInfo.setRegisterIp(userInfoId.getRegisterIp());
			idInfo.setLastLoginIp(userInfoId.getLastLoginIp());
			idInfo.setLastLoginTime(userInfoId.getLastLoginTime());
			idInfo.setVersion(userInfoId.getIdInfoVersion());
			idInfo.setIsDeleted(userInfoId.getIdInfoIsDeleted());
			idInfo.setRemark(userInfoId.getRemark());
			return idInfo;
		}
		return null;
	}
	public static UserInfoID convertUserInfoToUserInfoID(UserInfo userInfo){
		if(userInfo!=null){
			UserInfoID userInfoId=new UserInfoID();
			userInfoId.setUserInfoId(userInfo.getId());
			userInfoId.setUserName(userInfo.getUserName());
			userInfoId.setPassword(userInfo.getPassword());
			userInfoId.setRealName(userInfo.getRealName());
			userInfoId.setCerStyle(userInfo.getCerStyle());
			userInfoId.setUserStyle(userInfo.getUserStyle());
			userInfoId.setCipher(userInfo.getCipher());
			userInfoId.setUserInfoVersion(userInfo.getVersion());
			userInfoId.setUserInfoIsDeleted(userInfo.getIsDeleted());
			return userInfoId;
		}
		return null;
	}
	public static UserInfoID convertIdInfoToUserInfoID(IdInfo idInfo){
		if(idInfo!=null){
			UserInfoID userInfoId=new UserInfoID();
			userInfoId.setIdInfoId(idInfo.getId());
			userInfoId.setUserInfoId(idInfo.getUserInfoId());
			userInfoId.setSex(idInfo.getSex());
			userInfoId.setNation(idInfo.getNation());
			userInfoId.setBirthday(idInfo.getBirthday());
			userInfoId.setAddress(idInfo.getAddress());
			userInfoId.setPhone(idInfo.getPhone());
			userInfoId.setCerNo(idInfo.getCerNo());
			userInfoId.setAuthority(idInfo.getAuthority());
			userInfoId.setEffecDuration(idInfo.getEffecDuration());
			userInfoId.setStartTime(idInfo.getStartTime());
			userInfoId.setEndTime(idInfo.getEndTime());
			userInfoId.setPhoto(idInfo.getPhoto());
			userInfoId.setPhotoPath(idInfo.getPhotoPath());
			userInfoId.setRegisterTime(idInfo.getRegisterTime());
			userInfoId.setRegisterIp(idInfo.getRegisterIp());
			userInfoId.setLastLoginIp(idInfo.getLastLoginIp());
			userInfoId.setLastLoginTime(idInfo.getLastLoginTime());
			userInfoId.setIdInfoVersion(idInfo.getVersion());
			userInfoId.setIdInfoIsDeleted(idInfo.getIsDeleted());
			userInfoId.setRemark(idInfo.getRemark());
			return userInfoId;
		}
		return null;
	}
}
