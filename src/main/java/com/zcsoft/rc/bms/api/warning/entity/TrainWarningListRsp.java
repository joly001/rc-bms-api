package com.zcsoft.rc.bms.api.warning.entity;

public class TrainWarningListRsp {

    /**
     * id
     */
    private String id;
    /**
     * 司机
     */
    private String nick;
    /**
     * 类型(00:列车临站、01:列车接近)
     */
    private String type;
    /**
     * 上/下行(0:上行、1:下行)
     */
    private String direction;
    /**
     * 告警内容
     */
    private String warningContent;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getWarningContent() {
        return warningContent;
    }

    public void setWarningContent(String warningContent) {
        this.warningContent = warningContent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TrainWarningListRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", direction='").append(direction).append('\'');
        sb.append(", warningContent='").append(warningContent).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
