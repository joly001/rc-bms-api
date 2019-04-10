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
     * 里程区间id
     */
    private String mileageSegmentId;
    /**
     * 里程区间名称
     */
    private String mileageSegmentName;
    /**
     * 作业面id
     */
    private String workSegmentId;
    /**
     * 作业面名称
     */
    private String workSegmentName;
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
     * 施工人员类型(00:机车、01:列车、02:作业人员、03:作业负责人、04:安全员、05:防护员、06:监理、07:其它人员)			db_column: BUILDER_USER_TYPE
     */
    private String builderUserType;
    /**
     * 部门id
     */
    private String depId;
    /**
     * 部门名称
     */
    private String depName;
    /**
     * 组织id
     */
    private String orgId;
    /**
     * 组织名称
     */
    private String orgName;
    /**
     * 昵称
     */
    private String nick;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 状态(CREATE:创建、FINISH:结束)
     */
    private String status;
    /**
     * 类型(00:接近警告线)
     */
    private String type;
    /**
     * 警告位置经度
     */
    private Double longitude;
    /**
     * 警告位置纬度
     */
    private Double latitude;
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

    public String getMileageSegmentId() {
        return mileageSegmentId;
    }

    public void setMileageSegmentId(String mileageSegmentId) {
        this.mileageSegmentId = mileageSegmentId;
    }

    public String getMileageSegmentName() {
        return mileageSegmentName;
    }

    public void setMileageSegmentName(String mileageSegmentName) {
        this.mileageSegmentName = mileageSegmentName;
    }

    public String getWorkSegmentId() {
        return workSegmentId;
    }

    public void setWorkSegmentId(String workSegmentId) {
        this.workSegmentId = workSegmentId;
    }

    public String getWorkSegmentName() {
        return workSegmentName;
    }

    public void setWorkSegmentName(String workSegmentName) {
        this.workSegmentName = workSegmentName;
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

    public String getBuilderUserType() {
        return builderUserType;
    }

    public void setBuilderUserType(String builderUserType) {
        this.builderUserType = builderUserType;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
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
        sb.append(", mileageSegmentId='").append(mileageSegmentId).append('\'');
        sb.append(", mileageSegmentName='").append(mileageSegmentName).append('\'');
        sb.append(", workSegmentId='").append(workSegmentId).append('\'');
        sb.append(", workSegmentName='").append(workSegmentName).append('\'');
        sb.append(", workSegmentStartLongitude=").append(workSegmentStartLongitude);
        sb.append(", workSegmentStartLatitude=").append(workSegmentStartLatitude);
        sb.append(", workSegmentEndLongitude=").append(workSegmentEndLongitude);
        sb.append(", workSegmentEndLatitude=").append(workSegmentEndLatitude);
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", builderUserType='").append(builderUserType).append('\'');
        sb.append(", depId='").append(depId).append('\'');
        sb.append(", depName='").append(depName).append('\'');
        sb.append(", orgId='").append(orgId).append('\'');
        sb.append(", orgName='").append(orgName).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
