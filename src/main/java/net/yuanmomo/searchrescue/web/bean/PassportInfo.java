package net.yuanmomo.searchrescue.web.bean;

import java.io.Serializable;
import java.util.Date;

public class PassportInfo implements Serializable {
    private Long id;

    private Long userinfoId;

    private String authority;

    private Integer authorityid;

    private String passportno;

    private String nationality;

    private Integer nationid;

    private Date birthday;

    private Byte sex;

    private String address;

    private String phone;

    private Date issuedate;

    private Date effecDuration;

    private String signature;

    private Integer photo;

    private Integer photopath;

    private Integer remark;

    private String registerip;

    private Date registertime;

    private String lastloginip;

    private Date lastlogintime;

    private Long version;

    private Byte isdeleted;

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

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Integer getAuthorityid() {
        return authorityid;
    }

    public void setAuthorityid(Integer authorityid) {
        this.authorityid = authorityid;
    }

    public String getPassportno() {
        return passportno;
    }

    public void setPassportno(String passportno) {
        this.passportno = passportno;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
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

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public Date getEffecDuration() {
        return effecDuration;
    }

    public void setEffecDuration(Date effecDuration) {
        this.effecDuration = effecDuration;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getPhoto() {
        return photo;
    }

    public void setPhoto(Integer photo) {
        this.photo = photo;
    }

    public Integer getPhotopath() {
        return photopath;
    }

    public void setPhotopath(Integer photopath) {
        this.photopath = photopath;
    }

    public Integer getRemark() {
        return remark;
    }

    public void setRemark(Integer remark) {
        this.remark = remark;
    }

    public String getRegisterip() {
        return registerip;
    }

    public void setRegisterip(String registerip) {
        this.registerip = registerip;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
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
        PassportInfo other = (PassportInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserinfoId() == null ? other.getUserinfoId() == null : this.getUserinfoId().equals(other.getUserinfoId()))
            && (this.getAuthority() == null ? other.getAuthority() == null : this.getAuthority().equals(other.getAuthority()))
            && (this.getAuthorityid() == null ? other.getAuthorityid() == null : this.getAuthorityid().equals(other.getAuthorityid()))
            && (this.getPassportno() == null ? other.getPassportno() == null : this.getPassportno().equals(other.getPassportno()))
            && (this.getNationality() == null ? other.getNationality() == null : this.getNationality().equals(other.getNationality()))
            && (this.getNationid() == null ? other.getNationid() == null : this.getNationid().equals(other.getNationid()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getIssuedate() == null ? other.getIssuedate() == null : this.getIssuedate().equals(other.getIssuedate()))
            && (this.getEffecDuration() == null ? other.getEffecDuration() == null : this.getEffecDuration().equals(other.getEffecDuration()))
            && (this.getSignature() == null ? other.getSignature() == null : this.getSignature().equals(other.getSignature()))
            && (this.getPhoto() == null ? other.getPhoto() == null : this.getPhoto().equals(other.getPhoto()))
            && (this.getPhotopath() == null ? other.getPhotopath() == null : this.getPhotopath().equals(other.getPhotopath()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getRegisterip() == null ? other.getRegisterip() == null : this.getRegisterip().equals(other.getRegisterip()))
            && (this.getRegistertime() == null ? other.getRegistertime() == null : this.getRegistertime().equals(other.getRegistertime()))
            && (this.getLastloginip() == null ? other.getLastloginip() == null : this.getLastloginip().equals(other.getLastloginip()))
            && (this.getLastlogintime() == null ? other.getLastlogintime() == null : this.getLastlogintime().equals(other.getLastlogintime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserinfoId() == null) ? 0 : getUserinfoId().hashCode());
        result = prime * result + ((getAuthority() == null) ? 0 : getAuthority().hashCode());
        result = prime * result + ((getAuthorityid() == null) ? 0 : getAuthorityid().hashCode());
        result = prime * result + ((getPassportno() == null) ? 0 : getPassportno().hashCode());
        result = prime * result + ((getNationality() == null) ? 0 : getNationality().hashCode());
        result = prime * result + ((getNationid() == null) ? 0 : getNationid().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getIssuedate() == null) ? 0 : getIssuedate().hashCode());
        result = prime * result + ((getEffecDuration() == null) ? 0 : getEffecDuration().hashCode());
        result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
        result = prime * result + ((getPhoto() == null) ? 0 : getPhoto().hashCode());
        result = prime * result + ((getPhotopath() == null) ? 0 : getPhotopath().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getRegisterip() == null) ? 0 : getRegisterip().hashCode());
        result = prime * result + ((getRegistertime() == null) ? 0 : getRegistertime().hashCode());
        result = prime * result + ((getLastloginip() == null) ? 0 : getLastloginip().hashCode());
        result = prime * result + ((getLastlogintime() == null) ? 0 : getLastlogintime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        return result;
    }
}