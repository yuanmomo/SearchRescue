package net.yuanmomo.searchrescue.web.bean;

import java.io.Serializable;
import java.util.Date;

public class IdInfo implements Serializable {
    private Long id;

    private Long userinfoId;

    private Byte sex;

    private String nation;

    private Integer nationid;

    private Date birthday;

    private String address;

    private String phone;

    private String cerNo;

    private String authority;

    private Date effecDuration;

    private Date starttime;

    private Date endtime;

    private String photo;

    private String photopath;

    private Date registertime;

    private String registerip;

    private String lastloginip;

    private Date lastlogintime;

    private Long version;

    private Byte isdeleted;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Long userinfoId) {
        this.userinfoId = userinfoId;
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

    public Integer getNationid() {
        return nationid;
    }

    public void setNationid(Integer nationid) {
        this.nationid = nationid;
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

    public Date getEffecDuration() {
        return effecDuration;
    }

    public void setEffecDuration(Date effecDuration) {
        this.effecDuration = effecDuration;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getRegisterip() {
        return registerip;
    }

    public void setRegisterip(String registerip) {
        this.registerip = registerip;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Byte getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Byte isdeleted) {
        this.isdeleted = isdeleted;
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
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserinfoId() == null ? other.getUserinfoId() == null : this.getUserinfoId().equals(other.getUserinfoId()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getNationid() == null ? other.getNationid() == null : this.getNationid().equals(other.getNationid()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getCerNo() == null ? other.getCerNo() == null : this.getCerNo().equals(other.getCerNo()))
            && (this.getAuthority() == null ? other.getAuthority() == null : this.getAuthority().equals(other.getAuthority()))
            && (this.getEffecDuration() == null ? other.getEffecDuration() == null : this.getEffecDuration().equals(other.getEffecDuration()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getPhoto() == null ? other.getPhoto() == null : this.getPhoto().equals(other.getPhoto()))
            && (this.getPhotopath() == null ? other.getPhotopath() == null : this.getPhotopath().equals(other.getPhotopath()))
            && (this.getRegistertime() == null ? other.getRegistertime() == null : this.getRegistertime().equals(other.getRegistertime()))
            && (this.getRegisterip() == null ? other.getRegisterip() == null : this.getRegisterip().equals(other.getRegisterip()))
            && (this.getLastloginip() == null ? other.getLastloginip() == null : this.getLastloginip().equals(other.getLastloginip()))
            && (this.getLastlogintime() == null ? other.getLastlogintime() == null : this.getLastlogintime().equals(other.getLastlogintime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserinfoId() == null) ? 0 : getUserinfoId().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getNationid() == null) ? 0 : getNationid().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getCerNo() == null) ? 0 : getCerNo().hashCode());
        result = prime * result + ((getAuthority() == null) ? 0 : getAuthority().hashCode());
        result = prime * result + ((getEffecDuration() == null) ? 0 : getEffecDuration().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getPhoto() == null) ? 0 : getPhoto().hashCode());
        result = prime * result + ((getPhotopath() == null) ? 0 : getPhotopath().hashCode());
        result = prime * result + ((getRegistertime() == null) ? 0 : getRegistertime().hashCode());
        result = prime * result + ((getRegisterip() == null) ? 0 : getRegisterip().hashCode());
        result = prime * result + ((getLastloginip() == null) ? 0 : getLastloginip().hashCode());
        result = prime * result + ((getLastlogintime() == null) ? 0 : getLastlogintime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}