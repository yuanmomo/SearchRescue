package net.yuanmomo.searchrescue.web.bean;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private Long id;

    private String name;

    private Byte cerStyle;

    private Byte userStyle;

    private String cipher;

    private Long version;

    private Byte isdeleted;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        UserInfo other = (UserInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCerStyle() == null ? other.getCerStyle() == null : this.getCerStyle().equals(other.getCerStyle()))
            && (this.getUserStyle() == null ? other.getUserStyle() == null : this.getUserStyle().equals(other.getUserStyle()))
            && (this.getCipher() == null ? other.getCipher() == null : this.getCipher().equals(other.getCipher()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCerStyle() == null) ? 0 : getCerStyle().hashCode());
        result = prime * result + ((getUserStyle() == null) ? 0 : getUserStyle().hashCode());
        result = prime * result + ((getCipher() == null) ? 0 : getCipher().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        return result;
    }
}