package net.yuanmomo.searchrescue.web.bean;

import java.io.Serializable;

public class BoughtBeacon implements Serializable {
    private String userName;

    private String cerNo;

    private String passportNo;

    private String beaconNo;

    private Byte state=0;

    private String boughtDate;

    private static final long serialVersionUID = 1L;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCerNo() {
        return cerNo;
    }

    public void setCerNo(String cerNo) {
        this.cerNo = cerNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

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

    public String getBoughtDate() {
        return boughtDate;
    }

    public void setBoughtDate(String boughtDate) {
        this.boughtDate = boughtDate;
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
        BoughtBeacon other = (BoughtBeacon) that;
        return (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getCerNo() == null ? other.getCerNo() == null : this.getCerNo().equals(other.getCerNo()))
            && (this.getPassportNo() == null ? other.getPassportNo() == null : this.getPassportNo().equals(other.getPassportNo()))
            && (this.getBeaconNo() == null ? other.getBeaconNo() == null : this.getBeaconNo().equals(other.getBeaconNo()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getBoughtDate() == null ? other.getBoughtDate() == null : this.getBoughtDate().equals(other.getBoughtDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getCerNo() == null) ? 0 : getCerNo().hashCode());
        result = prime * result + ((getPassportNo() == null) ? 0 : getPassportNo().hashCode());
        result = prime * result + ((getBeaconNo() == null) ? 0 : getBeaconNo().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getBoughtDate() == null) ? 0 : getBoughtDate().hashCode());
        return result;
    }
}