package com.zcsoft.rc.bms.api.user.entity;

import javax.validation.constraints.Pattern;

public class UserListReq {

    /**
     * 姓名
     */
    private String nick;
    /**
     * 手机
     */
    @Pattern(regexp="^13[0-9]{9}$|14[0-9]{9}|15[0-9]{9}$|18[0-9]{9}$", message = "003003")
    private String mobile;
    /**
     * 手环编码
     */
    private String wristStrapCode;
    /**
     * 组织id
     */
    private String organizationId;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWristStrapCode() {
        return wristStrapCode;
    }

    public void setWristStrapCode(String wristStrapCode) {
        this.wristStrapCode = wristStrapCode;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserListReq{");
        sb.append("nick='").append(nick).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", wristStrapCode='").append(wristStrapCode).append('\'');
        sb.append(", organizationId='").append(organizationId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
