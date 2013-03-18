package net.yuanmomo.searchrescue.web.bean;

import java.io.Serializable;

import com.spagettikod.optimist.OptimisticLocking;
@OptimisticLocking("userinfo")
public class UserInfo extends BaseBean implements Serializable {
    private String userName;
    private String password;
    private String realName;
    private Byte cerStyle=0;
    private Byte userStyle=0;
    private String cipher;
    private Byte isDeleted=0;
    private static final long serialVersionUID = 1L;
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
        UserInfo other = (UserInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getCerStyle() == null ? other.getCerStyle() == null : this.getCerStyle().equals(other.getCerStyle()))
            && (this.getUserStyle() == null ? other.getUserStyle() == null : this.getUserStyle().equals(other.getUserStyle()))
            && (this.getCipher() == null ? other.getCipher() == null : this.getCipher().equals(other.getCipher()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getCerStyle() == null) ? 0 : getCerStyle().hashCode());
        result = prime * result + ((getUserStyle() == null) ? 0 : getUserStyle().hashCode());
        result = prime * result + ((getCipher() == null) ? 0 : getCipher().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }
}