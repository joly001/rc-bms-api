package com.zcsoft.rc.bms.api.machinery.entity;

public class MachineryListReq {

    /**
     * 手环编码
     */
    private String wristStrapCode;
    /**
     * 机械名称
     */
    private String machineryName;
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

    public String getMachineryName() {
        return machineryName;
    }

    public void setMachineryName(String machineryName) {
        this.machineryName = machineryName;
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
        sb.append(", machineryName='").append(machineryName).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
