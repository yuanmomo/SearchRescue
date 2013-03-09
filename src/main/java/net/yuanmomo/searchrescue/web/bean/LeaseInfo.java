package net.yuanmomo.searchrescue.web.bean;

import java.io.Serializable;
import java.util.Date;

public class LeaseInfo implements Serializable {
    private Long id;

    private Long userid;

    private Long beaconid;

    private Date startdate;

    private Date returndate;

    private Long version;

    private Byte isreturned;

    private Byte isdeleted;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getBeaconid() {
        return beaconid;
    }

    public void setBeaconid(Long beaconid) {
        this.beaconid = beaconid;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Byte getIsreturned() {
        return isreturned;
    }

    public void setIsreturned(Byte isreturned) {
        this.isreturned = isreturned;
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
        LeaseInfo other = (LeaseInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getBeaconid() == null ? other.getBeaconid() == null : this.getBeaconid().equals(other.getBeaconid()))
            && (this.getStartdate() == null ? other.getStartdate() == null : this.getStartdate().equals(other.getStartdate()))
            && (this.getReturndate() == null ? other.getReturndate() == null : this.getReturndate().equals(other.getReturndate()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getIsreturned() == null ? other.getIsreturned() == null : this.getIsreturned().equals(other.getIsreturned()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getBeaconid() == null) ? 0 : getBeaconid().hashCode());
        result = prime * result + ((getStartdate() == null) ? 0 : getStartdate().hashCode());
        result = prime * result + ((getReturndate() == null) ? 0 : getReturndate().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getIsreturned() == null) ? 0 : getIsreturned().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}