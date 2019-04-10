package com.zcsoft.rc.bms.api.warning.entity;

import java.util.Date;

public class WorkWarningWarningRsp {

    /**
     * id
     */
    private String id;
    /**
     * 警告id
     */
    private String workWarningId;
    /**
     * 作业面开始位置经度
     */
    private Double workSegmentStartLongitude;
    /**
     * 作业面开始位置纬度
     */
    private Double workSegmentStartLatitude;
    /**
     * 作业面结束位置经度
     */
    private Double workSegmentEndLongitude;
    /**
     * 作业面结束位置纬度
     */
    private Double workSegmentEndLatitude;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 昵称
     */
    private String nick;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 类型(00:接近警告线)
     */
    private String type;
    /**
     * 创建时间
     */
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkWarningId() {
        return workWarningId;
    }

    public void setWorkWarningId(String workWarningId) {
        this.workWarningId = workWarningId;
    }

    public Double getWorkSegmentStartLongitude() {
        return workSegmentStartLongitude;
    }

    public void setWorkSegmentStartLongitude(Double workSegmentStartLongitude) {
        this.workSegmentStartLongitude = workSegmentStartLongitude;
    }

    public Double getWorkSegmentStartLatitude() {
        return workSegmentStartLatitude;
    }

    public void setWorkSegmentStartLatitude(Double workSegmentStartLatitude) {
        this.workSegmentStartLatitude = workSegmentStartLatitude;
    }

    public Double getWorkSegmentEndLongitude() {
        return workSegmentEndLongitude;
    }

    public void setWorkSegmentEndLongitude(Double workSegmentEndLongitude) {
        this.workSegmentEndLongitude = workSegmentEndLongitude;
    }

    public Double getWorkSegmentEndLatitude() {
        return workSegmentEndLatitude;
    }

    public void setWorkSegmentEndLatitude(Double workSegmentEndLatitude) {
        this.workSegmentEndLatitude = workSegmentEndLatitude;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkWarningWarningRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", workWarningId='").append(workWarningId).append('\'');
        sb.append(", workSegmentStartLongitude=").append(workSegmentStartLongitude);
        sb.append(", workSegmentStartLatitude=").append(workSegmentStartLatitude);
        sb.append(", workSegmentEndLongitude=").append(workSegmentEndLongitude);
        sb.append(", workSegmentEndLatitude=").append(workSegmentEndLatitude);
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
