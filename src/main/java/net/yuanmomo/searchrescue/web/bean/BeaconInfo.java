package net.yuanmomo.searchrescue.web.bean;

import java.io.Serializable;
import java.util.Date;

public class BeaconInfo extends BeaconInfoKey implements Serializable {
    private String beaconNo;

    private Byte state;

    private Date lastupdatetime;

    private Byte lastupdatebyuserstyle;

    private Long lastupdatebyuserid;

    private Byte isdeleted;

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

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Byte getLastupdatebyuserstyle() {
        return lastupdatebyuserstyle;
    }

    public void setLastupdatebyuserstyle(Byte lastupdatebyuserstyle) {
        this.lastupdatebyuserstyle = lastupdatebyuserstyle;
    }

    public Long getLastupdatebyuserid() {
        return lastupdatebyuserid;
    }

    public void setLastupdatebyuserid(Long lastupdatebyuserid) {
        this.lastupdatebyuserid = lastupdatebyuserid;
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
        BeaconInfo other = (BeaconInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getBeaconNo() == null ? other.getBeaconNo() == null : this.getBeaconNo().equals(other.getBeaconNo()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getLastupdatetime() == null ? other.getLastupdatetime() == null : this.getLastupdatetime().equals(other.getLastupdatetime()))
            && (this.getLastupdatebyuserstyle() == null ? other.getLastupdatebyuserstyle() == null : this.getLastupdatebyuserstyle().equals(other.getLastupdatebyuserstyle()))
            && (this.getLastupdatebyuserid() == null ? other.getLastupdatebyuserid() == null : this.getLastupdatebyuserid().equals(other.getLastupdatebyuserid()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getBeaconNo() == null) ? 0 : getBeaconNo().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getLastupdatetime() == null) ? 0 : getLastupdatetime().hashCode());
        result = prime * result + ((getLastupdatebyuserstyle() == null) ? 0 : getLastupdatebyuserstyle().hashCode());
        result = prime * result + ((getLastupdatebyuserid() == null) ? 0 : getLastupdatebyuserid().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        return result;
    }
}