package net.yuanmomo.searchrescue.web.bean;

import java.io.Serializable;
import java.util.Date;

import com.spagettikod.optimist.OptimisticLocking;

@OptimisticLocking("idinfo")
public class IdInfo extends BaseBean implements Serializable {
	private Long userInfoId=0L;
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
	private Byte isDeleted=0;
	private String remark;
	private static final long serialVersionUID = 1L;

	public Long getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(Long userInfoId) {
		this.userInfoId = userInfoId;
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

	public Byte getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		IdInfo other = (IdInfo) that;
		return (this.getId() == null ? other.getId() == null : this.getId()
				.equals(other.getId()))
				&& (this.getUserInfoId() == null ? other.getUserInfoId() == null
						: this.getUserInfoId().equals(other.getUserInfoId()))
				&& (this.getSex() == null ? other.getSex() == null : this
						.getSex().equals(other.getSex()))
				&& (this.getNation() == null ? other.getNation() == null : this
						.getNation().equals(other.getNation()))
				&& (this.getNationId() == null ? other.getNationId() == null
						: this.getNationId().equals(other.getNationId()))
				&& (this.getBirthday() == null ? other.getBirthday() == null
						: this.getBirthday().equals(other.getBirthday()))
				&& (this.getAddress() == null ? other.getAddress() == null
						: this.getAddress().equals(other.getAddress()))
				&& (this.getPhone() == null ? other.getPhone() == null : this
						.getPhone().equals(other.getPhone()))
				&& (this.getCerNo() == null ? other.getCerNo() == null : this
						.getCerNo().equals(other.getCerNo()))
				&& (this.getAuthority() == null ? other.getAuthority() == null
						: this.getAuthority().equals(other.getAuthority()))
				&& (this.getEffecDuration() == null ? other.getEffecDuration() == null
						: this.getEffecDuration().equals(
								other.getEffecDuration()))
				&& (this.getStartTime() == null ? other.getStartTime() == null
						: this.getStartTime().equals(other.getStartTime()))
				&& (this.getEndTime() == null ? other.getEndTime() == null
						: this.getEndTime().equals(other.getEndTime()))
				&& (this.getPhoto() == null ? other.getPhoto() == null : this
						.getPhoto().equals(other.getPhoto()))
				&& (this.getPhotoPath() == null ? other.getPhotoPath() == null
						: this.getPhotoPath().equals(other.getPhotoPath()))
				&& (this.getRegisterTime() == null ? other.getRegisterTime() == null
						: this.getRegisterTime()
								.equals(other.getRegisterTime()))
				&& (this.getRegisterIp() == null ? other.getRegisterIp() == null
						: this.getRegisterIp().equals(other.getRegisterIp()))
				&& (this.getLastLoginIp() == null ? other.getLastLoginIp() == null
						: this.getLastLoginIp().equals(other.getLastLoginIp()))
				&& (this.getLastLoginTime() == null ? other.getLastLoginTime() == null
						: this.getLastLoginTime().equals(
								other.getLastLoginTime()))
				&& (this.getVersion() == null ? other.getVersion() == null
						: this.getVersion().equals(other.getVersion()))
				&& (this.getIsDeleted() == null ? other.getIsDeleted() == null
						: this.getIsDeleted().equals(other.getIsDeleted()))
				&& (this.getRemark() == null ? other.getRemark() == null : this
						.getRemark().equals(other.getRemark()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result
				+ ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
		result = prime * result
				+ ((getSex() == null) ? 0 : getSex().hashCode());
		result = prime * result
				+ ((getNation() == null) ? 0 : getNation().hashCode());
		result = prime * result
				+ ((getNationId() == null) ? 0 : getNationId().hashCode());
		result = prime * result
				+ ((getBirthday() == null) ? 0 : getBirthday().hashCode());
		result = prime * result
				+ ((getAddress() == null) ? 0 : getAddress().hashCode());
		result = prime * result
				+ ((getPhone() == null) ? 0 : getPhone().hashCode());
		result = prime * result
				+ ((getCerNo() == null) ? 0 : getCerNo().hashCode());
		result = prime * result
				+ ((getAuthority() == null) ? 0 : getAuthority().hashCode());
		result = prime
				* result
				+ ((getEffecDuration() == null) ? 0 : getEffecDuration()
						.hashCode());
		result = prime * result
				+ ((getStartTime() == null) ? 0 : getStartTime().hashCode());
		result = prime * result
				+ ((getEndTime() == null) ? 0 : getEndTime().hashCode());
		result = prime * result
				+ ((getPhoto() == null) ? 0 : getPhoto().hashCode());
		result = prime * result
				+ ((getPhotoPath() == null) ? 0 : getPhotoPath().hashCode());
		result = prime
				* result
				+ ((getRegisterTime() == null) ? 0 : getRegisterTime()
						.hashCode());
		result = prime * result
				+ ((getRegisterIp() == null) ? 0 : getRegisterIp().hashCode());
		result = prime
				* result
				+ ((getLastLoginIp() == null) ? 0 : getLastLoginIp().hashCode());
		result = prime
				* result
				+ ((getLastLoginTime() == null) ? 0 : getLastLoginTime()
						.hashCode());
		result = prime * result
				+ ((getVersion() == null) ? 0 : getVersion().hashCode());
		result = prime * result
				+ ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
		result = prime * result
				+ ((getRemark() == null) ? 0 : getRemark().hashCode());
		return result;
	}
}