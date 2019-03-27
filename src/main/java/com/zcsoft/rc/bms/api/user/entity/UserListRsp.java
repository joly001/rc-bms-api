package com.zcsoft.rc.bms.api.user.entity;

import java.util.Date;

public class UserListRsp {

    /**
     * id
     */
    public String id;
    /**
     * 姓名
     */
    private String nick;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 角色(00:机车、01:列车、02:施工人员、03:安全防护员、04:作业负责人、05:监理、06:其它人员)
     */
    private String builderUserType;
    /**
     * 状态(00:入场、01:出场)
     */
    private String builderStatus;
    /**
     * 入场时间
     */
    private Date admissionDate;
    /**
     * 离场时间
     */
    private Date leaveDate;
    /**
     * 手环编码
     */
    private String wristStrapCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getBuilderUserType() {
        return builderUserType;
    }

    public void setBuilderUserType(String builderUserType) {
        this.builderUserType = builderUserType;
    }

    public String getBuilderStatus() {
        return builderStatus;
    }

    public void setBuilderStatus(String builderStatus) {
        this.builderStatus = builderStatus;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getWristStrapCode() {
        return wristStrapCode;
    }

    public void setWristStrapCode(String wristStrapCode) {
        this.wristStrapCode = wristStrapCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserListRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", builderUserType='").append(builderUserType).append('\'');
        sb.append(", builderStatus='").append(builderStatus).append('\'');
        sb.append(", admissionDate=").append(admissionDate);
        sb.append(", leaveDate=").append(leaveDate);
        sb.append(", wristStrapCode='").append(wristStrapCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
