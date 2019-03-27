package com.zcsoft.rc.bms.api.user.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import java.util.Date;

public class UserUpdateReq {

    /**
     * id
     */
    @NotEmpty
    public String id;
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
     * 角色(00:机车、01:列车、02:施工人员、03:安全防护员、04:作业负责人、05:监理、06:其它人员)
     */
    private String builderUserType;
    /**
     * 状态(00:入场、01:出场)
     */
    private String builderStatus;
    /**
     * 入场/离场时间
     */
    private Date admissionLeaveDate;
    /**
     * 手环编码
     */
    private String wristStrapCode;
    /**
     * 组织id
     */
    private String organizationId;

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

    public Date getAdmissionLeaveDate() {
        return admissionLeaveDate;
    }

    public void setAdmissionLeaveDate(Date admissionLeaveDate) {
        this.admissionLeaveDate = admissionLeaveDate;
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
        final StringBuilder sb = new StringBuilder("UserUpdateReq{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", builderUserType='").append(builderUserType).append('\'');
        sb.append(", builderStatus='").append(builderStatus).append('\'');
        sb.append(", admissionLeaveDate=").append(admissionLeaveDate);
        sb.append(", wristStrapCode='").append(wristStrapCode).append('\'');
        sb.append(", organizationId='").append(organizationId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
