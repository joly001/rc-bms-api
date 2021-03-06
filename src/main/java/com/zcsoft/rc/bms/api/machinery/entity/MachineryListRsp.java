package com.zcsoft.rc.bms.api.machinery.entity;

public class MachineryListRsp {

    /**
     * id
     */
    private String id;
    /**
     * 车牌号
     */
    private String plateNumber;
    /**
     * 机械名称
     */
    private String machineryName;
    /**
     * 机械类型(SMALL:小型、MEDIUM:中型、LARGE:大型)
     */
    private String machineryType;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 司机
     */
    private String nick;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 作业半径
     */
    private Integer workRadius;
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
        final StringBuilder sb = new StringBuilder("MachineryListRsp{");
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
