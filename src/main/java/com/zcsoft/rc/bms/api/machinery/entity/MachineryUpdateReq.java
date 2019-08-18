package com.zcsoft.rc.bms.api.machinery.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;

public class MachineryUpdateReq {

    /**
     * id
     */
    @NotEmpty
    private String id;
    /**
     * 车牌号
     */
    @NotEmpty
    private String plateNumber;
    /**
     * 机械名称
     */
    @NotEmpty
    private String machineryName;
    /**
     * 机械类型(SMALL:小型、MEDIUM:中型、LARGE:大型)
     */
    @NotEmpty
    private String machineryType;
    /**
     * 用户id
     */
    @NotEmpty
    private String userId;
    /**
     * 司机
     */
    @NotEmpty
    private String nick;
    /**
     * 手机
     */
    @NotEmpty
    @Pattern(regexp="^[1](([3][0-9])|([4][5,7,9])|([5][0-9])|([6][6])|([7][3,5,6,7,8])|([8][0-9])|([9][8,9]))[0-9]{8}$", message = "003003")
    private String mobile;
    /**
     * 作业半径
     */
    private Integer workRadius;
    /**
     * 手环编码
     */
    @NotEmpty
    private String wristStrapCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getMachineryName() {
        return machineryName;
    }

    public void setMachineryName(String machineryName) {
        this.machineryName = machineryName;
    }

    public String getMachineryType() {
        return machineryType;
    }

    public void setMachineryType(String machineryType) {
        this.machineryType = machineryType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public Integer getWorkRadius() {
        return workRadius;
    }

    public void setWorkRadius(Integer workRadius) {
        this.workRadius = workRadius;
    }

    public String getWristStrapCode() {
        return wristStrapCode;
    }

    public void setWristStrapCode(String wristStrapCode) {
        this.wristStrapCode = wristStrapCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MachineryUpdateReq{");
        sb.append("id='").append(id).append('\'');
        sb.append(", plateNumber='").append(plateNumber).append('\'');
        sb.append(", machineryName='").append(machineryName).append('\'');
        sb.append(", machineryType='").append(machineryType).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", workRadius=").append(workRadius);
        sb.append(", wristStrapCode='").append(wristStrapCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
