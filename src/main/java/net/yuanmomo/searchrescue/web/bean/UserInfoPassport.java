package net.yuanmomo.searchrescue.web.bean;

import java.util.Date;

public class UserInfoPassport {
	private Long userInfoId=0l;
	private String userName;
	private String password;
	private String realName;
	private Byte cerStyle = 0;
	private Byte userStyle = 0;
	private String cipher;
	private Long userInfoVersion=0L;
	private Byte userInfoIsDeleted=0;
	
	private Long passportInfoId=0L;
    private String authority;
    private Integer authorityId=0;
    private String passportNo;
    private String nationality;
    private Integer nationId=0;
    private Date birthday;
    private Byte sex=0;
    private String address;
    private String phone;
    private Date issueDate;
    private String effecDuration;
    private String signature;
    private String photo;
    private String photoPath;
    private String remark;
    private String registerIp;
    private Date registerTime;
    private String lastLoginIp;
    private Date lastLoginTime;
    private Long passportInfoVersion=0L;
    private Byte passportInfoIsDeleted=0;
    
  //管理员设置购买用户
    private Long buyBeaconId=0L;
    private Date buyBeaconDate;//租赁或者购买日期
	public Long getBuyBeaconId() {
		return buyBeaconId;
	}

	public void setBuyBeaconId(Long buyBeaconId) {
		this.buyBeaconId = buyBeaconId;
	}

	public Date getBuyBeaconDate() {
		return buyBeaconDate;
	}

	public void setBuyBeaconDate(Date buyBeaconDate) {
		this.buyBeaconDate = buyBeaconDate;
	}
	public Long getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Long userInfoId) {
		this.userInfoId = userInfoId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Byte getCerStyle() {
		return cerStyle;
	}
	public void setCerStyle(Byte cerStyle) {
		this.cerStyle = cerStyle;
	}
	public Byte getUserStyle() {
		return userStyle;
	}
	public void setUserStyle(Byte userStyle) {
		this.userStyle = userStyle;
	}
	public Long getUserInfoVersion() {
		return userInfoVersion;
	}
	public void setUserInfoVersion(Long userInfoVersion) {
		this.userInfoVersion = userInfoVersion;
	}
	public Byte getUserInfoIsDeleted() {
		return userInfoIsDeleted;
	}
	public void setUserInfoIsDeleted(Byte userInfoIsDeleted) {
		this.userInfoIsDeleted = userInfoIsDeleted;
	}
	public Long getPassportInfoId() {
		return passportInfoId;
	}
	public void setPassportInfoId(Long passportInfoId) {
		this.passportInfoId = passportInfoId;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public Integer getAuthorityId() {
		return authorityId;
	}
	public void setAuthorityId(Integer authorityId) {
		this.authorityId = authorityId;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Integer getNationId() {
		return nationId;
	}
	public void setNationId(Integer nationId) {
		this.nationId = nationId;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Byte getSex() {
		return sex;
	}
	public void setSex(Byte sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public String getEffecDuration() {
		return effecDuration;
	}
	public void setEffecDuration(String effecDuration) {
		this.effecDuration = effecDuration;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRegisterIp() {
		return registerIp;
	}
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public String getLastLoginIp() {
		return lastLoginIp;
	}
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public Long getPassportInfoVersion() {
		return passportInfoVersion;
	}
	public void setPassportInfoVersion(Long passportInfoVersion) {
		this.passportInfoVersion = passportInfoVersion;
	}
	public Byte getPassportInfoIsDeleted() {
		return passportInfoIsDeleted;
	}
	public void setPassportInfoIsDeleted(Byte passportInfoIsDeleted) {
		this.passportInfoIsDeleted = passportInfoIsDeleted;
	}
	public String getCipher() {
		return cipher;
	}
	public void setCipher(String cipher) {
		this.cipher = cipher;
	}
}
