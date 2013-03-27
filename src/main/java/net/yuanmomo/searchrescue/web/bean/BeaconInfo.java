package net.yuanmomo.searchrescue.web.bean;

import java.io.Serializable;
import java.util.Date;

public class BeaconInfo extends BaseBean implements Serializable {
    private String beaconNo;
    private Byte state=0;
    private Date lastUpdateTime;
    private Byte lastUpdateByUserStyle=0;
    private Long lastUpdateByUserId=0l;
    private Byte isDeleted=0;
    private static final long serialVersionUID = 1L;
    public String getBeaconNo() {
        return beaconNo;
    }
    public void setBeaconNo(String beaconNo) {
        this.beaconNo = beaconNo;
    }
    public Byte getState() {
        return state;
    }
    public void setState(Byte state) {
        this.state = state;
    }
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Byte getLastUpdateByUserStyle() {
        return lastUpdateByUserStyle;
    }

    public void setLastUpdateByUserStyle(Byte lastUpdateByUserStyle) {
        this.lastUpdateByUserStyle = lastUpdateByUserStyle;
    }

    public Long getLastUpdateByUserId() {
        return lastUpdateByUserId;
    }

    public void setLastUpdateByUserId(Long lastUpdateByUserId) {
        this.lastUpdateByUserId = lastUpdateByUserId;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
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
        BeaconInfo other = (BeaconInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBeaconNo() == null ? other.getBeaconNo() == null : this.getBeaconNo().equals(other.getBeaconNo()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getLastUpdateByUserStyle() == null ? other.getLastUpdateByUserStyle() == null : this.getLastUpdateByUserStyle().equals(other.getLastUpdateByUserStyle()))
            && (this.getLastUpdateByUserId() == null ? other.getLastUpdateByUserId() == null : this.getLastUpdateByUserId().equals(other.getLastUpdateByUserId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBeaconNo() == null) ? 0 : getBeaconNo().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getLastUpdateByUserStyle() == null) ? 0 : getLastUpdateByUserStyle().hashCode());
        result = prime * result + ((getLastUpdateByUserId() == null) ? 0 : getLastUpdateByUserId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }
}