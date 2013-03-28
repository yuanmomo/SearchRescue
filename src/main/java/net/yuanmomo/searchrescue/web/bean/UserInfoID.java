package net.yuanmomo.searchrescue.web.bean;

import java.util.Date;

public class UserInfoID{
	private Long userInfoId=0l;
	private String userName;
	private String password;
	private String realName;
	private Byte cerStyle=0;
	private Byte userStyle=0;
	private String cipher;
	private Long userInfoVersion;
	private Byte userInfoIsDeleted=0;

	private Long idInfoId=0L;
	private Byte sex=0;
	private String nation;
	private Integer nationId=0;
	private Date birthday;
	private String address;
	private String phone;
	private String cerNo;
	private String authority;
	private String effecDuration;
	private Date startTime;
	private Date endTime;
	private String photo;
	private String photoPath;
	private Date registerTime;
	private String registerIp;
	private String lastLoginIp;
	private Date lastLoginTime;
	private String remark;
	private Long idInfoVersion=0L;
	private Byte idInfoIsDeleted=0;

	   
    //管理员设置购买用户
    private Long buyBeaconId=0L;
    private Date buyBeaconDate;
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

	public String getCipher() {
		return cipher;
	}

	public void setCipher(String cipher) {
		this.cipher = cipher;
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

	public Long getIdInfoId() {
		return idInfoId;
	}

	public void setIdInfoId(Long idInfoId) {
		this.idInfoId = idInfoId;
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
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

	public String getCerNo() {
		return cerNo;
	}

	public void setCerNo(String cerNo) {
		this.cerNo = cerNo;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getEffecDuration() {
		return effecDuration;
	}

	public void setEffecDuration(String effecDuration) {
		this.effecDuration = effecDuration;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getRegisterIp() {
		return registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getIdInfoVersion() {
		return idInfoVersion;
	}

	public void setIdInfoVersion(Long idInfoVersion) {
		this.idInfoVersion = idInfoVersion;
	}

	public Byte getIdInfoIsDeleted() {
		return idInfoIsDeleted;
	}

	public void setIdInfoIsDeleted(Byte idInfoIsDeleted) {
		this.idInfoIsDeleted = idInfoIsDeleted;
	}

	@Override
	public String toString() {
		return "UserInfoID [userInfoId=" + userInfoId + ", userName="
				+ userName + ", password=" + password + ", realName="
				+ realName + ", cerStyle=" + cerStyle + ", userStyle="
				+ userStyle + ", cipher=" + cipher + ", userInfoVersion="
				+ userInfoVersion + ", userInfoIsDeleted=" + userInfoIsDeleted
				+ ", idInfoId=" + idInfoId + ", sex=" + sex + ", nation="
				+ nation + ", nationId=" + nationId + ", birthday=" + birthday
				+ ", address=" + address + ", phone=" + phone + ", cerNo="
				+ cerNo + ", authority=" + authority + ", effecDuration="
				+ effecDuration + ", startTime=" + startTime + ", endTime="
				+ endTime + ", photo=" + photo + ", photoPath=" + photoPath
				+ ", registerTime=" + registerTime + ", registerIp="
				+ registerIp + ", lastLoginIp=" + lastLoginIp
				+ ", lastLoginTime=" + lastLoginTime + ", remark=" + remark
				+ ", idInfoVersion=" + idInfoVersion + ", idInfoIsDeleted="
				+ idInfoIsDeleted + "]";
	}
}
