package com.zcsoft.rc.bms.api.machinery.entity;

public class MachineryListReq {

    /**
     * 手环编码
     */
    private String wristStrapCode;
    /**
     * 机械类型(SMALL:小型、MEDIUM:中型、LARGE:大型)
     */
    private String machineryType;
    /**
     * 司机
     */
    private String nick;

    public String getWristStrapCode() {
        return wristStrapCode;
    }

    public void setWristStrapCode(String wristStrapCode) {
        this.wristStrapCode = wristStrapCode;
    }

    public String getMachineryType() {
        return machineryType;
    }

    public void setMachineryType(String machineryType) {
        this.machineryType = machineryType;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MachineryListReq{");
        sb.append("wristStrapCode='").append(wristStrapCode).append('\'');
        sb.append(", machineryType='").append(machineryType).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
