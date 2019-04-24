package com.zcsoft.rc.bms.api.user.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class UserAddReq {

    /**
     * 姓名
     */
    @NotEmpty
    @Length(max = 10)
    private String nick;
    /**
     * 手机
     */
    @NotEmpty
    @Pattern(regexp="^[1](([3][0-9])|([4][5,7,9])|([5][^4,6,9])|([6][6])|([7][3,5,6,7,8])|([8][0-9])|([9][8,9]))[0-9]{8}$", message = "003003")
    private String mobile;
    /**
     * 角色(00:机车、01:列车、02:施工人员、03:安全防护员、04:作业负责人、05:监理、06:其它人员)
     */
    @NotEmpty
    private String builderUserType;
    /**
     * 状态(00:入场、01:出场)
     */
    @NotEmpty
    private String builderStatus;
    /**
     * 入场/离场时间
     */
    @NotNull
    private Date admissionLeaveDate;
    /**
     * 手环编码
     */
    private String wristStrapCode;
    /**
     * 组织id
     */
    @NotEmpty
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

    @JsonFormat(pattern="yyyy-MM-dd")
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
        final StringBuilder sb = new StringBuilder("UserAddReq{");
        sb.append("nick='").append(nick).append('\'');
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
