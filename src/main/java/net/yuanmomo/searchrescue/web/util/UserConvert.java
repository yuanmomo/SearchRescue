package net.yuanmomo.searchrescue.web.util;

import net.yuanmomo.searchrescue.web.bean.IdInfo;
import net.yuanmomo.searchrescue.web.bean.PassportInfo;
import net.yuanmomo.searchrescue.web.bean.UserInfo;
import net.yuanmomo.searchrescue.web.bean.UserInfoID;
import net.yuanmomo.searchrescue.web.bean.UserInfoPassport;

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
	public static UserInfoID mergeUserInfoAndIdInfo(UserInfo userInfo,IdInfo idInfo){
		UserInfoID userInfoId=new UserInfoID();
		if(userInfo!=null){
			userInfoId.setUserInfoId(userInfo.getId());
			userInfoId.setUserName(userInfo.getUserName());
			userInfoId.setPassword(userInfo.getPassword());
			userInfoId.setRealName(userInfo.getRealName());
			userInfoId.setCerStyle(userInfo.getCerStyle());
			userInfoId.setUserStyle(userInfo.getUserStyle());
			userInfoId.setCipher(userInfo.getCipher());
			userInfoId.setUserInfoVersion(userInfo.getVersion());
			userInfoId.setUserInfoIsDeleted(userInfo.getIsDeleted());
		}
		if(idInfo!=null){
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
		}
		return userInfoId;
	}
	
	public static UserInfo convertUserInfoPassportToUserInfo(UserInfoPassport userInfoPassport){
		if(userInfoPassport!=null){
			UserInfo userInfo=new UserInfo();
			userInfo.setId(userInfoPassport.getUserInfoId());
			userInfo.setUserName(userInfoPassport.getUserName());
			userInfo.setPassword(userInfoPassport.getPassword());
			userInfo.setRealName(userInfoPassport.getRealName());
			userInfo.setCerStyle(userInfoPassport.getCerStyle());
			userInfo.setUserStyle(userInfoPassport.getUserStyle());
			userInfo.setCipher(userInfoPassport.getCipher());
			userInfo.setVersion(userInfoPassport.getUserInfoVersion());
			userInfo.setIsDeleted(userInfoPassport.getUserInfoIsDeleted());
			return userInfo;
		}
		return null;
	}
	public static PassportInfo convertUserInfoPassportToPassportInfo(UserInfoPassport userInfoPassport){
		if(userInfoPassport!=null){
			PassportInfo passportInfo=new PassportInfo();
			passportInfo.setUserinfoId(userInfoPassport.getUserInfoId());
			passportInfo.setAuthority(userInfoPassport.getAuthority());
			passportInfo.setAuthorityId(userInfoPassport.getAuthorityId());
			passportInfo.setPassportNo(userInfoPassport.getPassportNo());
			passportInfo.setNationality(userInfoPassport.getNationality());
			passportInfo.setNationId(userInfoPassport.getNationId());
			passportInfo.setBirthday(userInfoPassport.getBirthday());
			passportInfo.setSex(userInfoPassport.getSex());
			passportInfo.setAddress(userInfoPassport.getAddress());
			passportInfo.setPhone(userInfoPassport.getPhone());
			passportInfo.setIssueDate(userInfoPassport.getIssueDate());
			passportInfo.setEffecDuration(userInfoPassport.getEffecDuration());
			passportInfo.setSignature(userInfoPassport.getSignature());
			passportInfo.setPhoto(userInfoPassport.getPhoto());
			passportInfo.setPhotoPath(userInfoPassport.getPhotoPath());
			passportInfo.setRemark(userInfoPassport.getRemark());
			passportInfo.setRegisterIp(userInfoPassport.getRegisterIp());
			passportInfo.setRegisterTime(userInfoPassport.getRegisterTime());
			passportInfo.setLastLoginIp(userInfoPassport.getLastLoginIp());
			passportInfo.setLastLoginTime(userInfoPassport.getLastLoginTime());
			passportInfo.setVersion(userInfoPassport.getPassportInfoVersion());
			passportInfo.setIsDeleted(userInfoPassport.getPassportInfoIsDeleted());
			return passportInfo;
		}
		return null;
	}
	public static UserInfoPassport convertUserInfoToUserInfoPassport(UserInfo userInfo){
		if(userInfo!=null){
			UserInfoPassport userInfoPassport=new UserInfoPassport();
			userInfoPassport.setUserInfoId(userInfo.getId());
			userInfoPassport.setUserName(userInfo.getUserName());
			userInfoPassport.setPassword(userInfo.getPassword());
			userInfoPassport.setRealName(userInfo.getRealName());
			userInfoPassport.setCerStyle(userInfo.getCerStyle());
			userInfoPassport.setUserStyle(userInfo.getUserStyle());
			userInfoPassport.setCipher(userInfo.getCipher());
			userInfoPassport.setUserInfoVersion(userInfo.getVersion());
			userInfoPassport.setUserInfoIsDeleted(userInfo.getIsDeleted());
			return userInfoPassport;
		}
		return null;
	}
	public static UserInfoPassport convertPassportInfoToUserInfoPassport(PassportInfo passportInfo){
		if(passportInfo!=null){
			UserInfoPassport userInfoPassport=new UserInfoPassport();
			userInfoPassport.setUserInfoId(passportInfo.getUserinfoId());
			userInfoPassport.setAuthority(passportInfo.getAuthority());
			userInfoPassport.setAuthorityId(passportInfo.getAuthorityId());
			userInfoPassport.setPassportNo(passportInfo.getPassportNo());
			userInfoPassport.setNationality(passportInfo.getNationality());
			userInfoPassport.setNationId(passportInfo.getNationId());
			userInfoPassport.setBirthday(passportInfo.getBirthday());
			userInfoPassport.setSex(passportInfo.getSex());
			userInfoPassport.setAddress(passportInfo.getAddress());
			userInfoPassport.setPhone(passportInfo.getPhone());
			userInfoPassport.setIssueDate(passportInfo.getIssueDate());
			userInfoPassport.setEffecDuration(passportInfo.getEffecDuration());
			userInfoPassport.setSignature(passportInfo.getSignature());
			userInfoPassport.setPhoto(passportInfo.getPhoto());
			userInfoPassport.setPhotoPath(passportInfo.getPhotoPath());
			userInfoPassport.setRemark(passportInfo.getRemark());
			userInfoPassport.setRegisterIp(passportInfo.getRegisterIp());
			userInfoPassport.setRegisterTime(passportInfo.getRegisterTime());
			userInfoPassport.setLastLoginIp(passportInfo.getLastLoginIp());
			userInfoPassport.setLastLoginTime(passportInfo.getLastLoginTime());
			userInfoPassport.setPassportInfoVersion(passportInfo.getVersion());
			userInfoPassport.setPassportInfoIsDeleted(passportInfo.getIsDeleted());
			return userInfoPassport;
		}
		return null;
	}
	public static UserInfoPassport mergeUserInfoAndPassportInfo(UserInfo userInfo,PassportInfo passportInfo){
		UserInfoPassport userInfoPassport=new UserInfoPassport();
		if(userInfo!=null){
			userInfoPassport.setUserInfoId(userInfo.getId());
			userInfoPassport.setUserName(userInfo.getUserName());
			userInfoPassport.setPassword(userInfo.getPassword());
			userInfoPassport.setRealName(userInfo.getRealName());
			userInfoPassport.setCerStyle(userInfo.getCerStyle());
			userInfoPassport.setUserStyle(userInfo.getUserStyle());
			userInfoPassport.setCipher(userInfo.getCipher());
			userInfoPassport.setUserInfoVersion(userInfo.getVersion());
			userInfoPassport.setUserInfoIsDeleted(userInfo.getIsDeleted());
		}
		if(passportInfo!=null){
			userInfoPassport.setUserInfoId(passportInfo.getUserinfoId());
			userInfoPassport.setAuthority(passportInfo.getAuthority());
			userInfoPassport.setAuthorityId(passportInfo.getAuthorityId());
			userInfoPassport.setPassportNo(passportInfo.getPassportNo());
			userInfoPassport.setNationality(passportInfo.getNationality());
			userInfoPassport.setNationId(passportInfo.getNationId());
			userInfoPassport.setBirthday(passportInfo.getBirthday());
			userInfoPassport.setSex(passportInfo.getSex());
			userInfoPassport.setAddress(passportInfo.getAddress());
			userInfoPassport.setPhone(passportInfo.getPhone());
			userInfoPassport.setIssueDate(passportInfo.getIssueDate());
			userInfoPassport.setEffecDuration(passportInfo.getEffecDuration());
			userInfoPassport.setSignature(passportInfo.getSignature());
			userInfoPassport.setPhoto(passportInfo.getPhoto());
			userInfoPassport.setPhotoPath(passportInfo.getPhotoPath());
			userInfoPassport.setRemark(passportInfo.getRemark());
			userInfoPassport.setRegisterIp(passportInfo.getRegisterIp());
			userInfoPassport.setRegisterTime(passportInfo.getRegisterTime());
			userInfoPassport.setLastLoginIp(passportInfo.getLastLoginIp());
			userInfoPassport.setLastLoginTime(passportInfo.getLastLoginTime());
			userInfoPassport.setPassportInfoVersion(passportInfo.getVersion());
			userInfoPassport.setPassportInfoIsDeleted(passportInfo.getIsDeleted());
		}
		return userInfoPassport;
	}
}
