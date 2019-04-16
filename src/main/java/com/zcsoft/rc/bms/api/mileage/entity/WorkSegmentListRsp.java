package com.zcsoft.rc.bms.api.mileage.entity;

import java.util.Date;

public class WorkSegmentListRsp {

    /**
     * id
     */
    private String id;
    /**
     * 作业面名称
     */
    private String workSegmentName;
    /**
     * 里程区间id
     */
    private String mileageSegmentId;
    /**
     * 里程区间名称
     */
    private String mileageSegmentName;
    /**
     * 开始里程点
     */
    private String startMileageName;
    /**
     * 结束里程点
     */
    private String endMileageName;
    /**
     * 开始位置经度
     */
    private Double startLongitude;
    /**
     * 开始位置纬度
     */
    private Double startLatitude;
    /**
     * 结束位置经度
     */
    private Double endLongitude;
    /**
     * 结束位置纬度
     */
    private Double endLatitude;
    /**
     * 作业类型(00:上行、01:下行)
     */
    private String workType;
    /**
     * 作业时间
     */
    private Date workDate;
    /**
     * 安全防护人员数
     */
    private Integer safetyProtectionPersonnel;
    /**
     * 现场人员数
     */
    private Integer workPersonnel;
    /**
     * 提交人员名称
     */
    private String submitUserName;
    /**
     * 提交时间
     */
    private Date submitTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkSegmentName() {
        return workSegmentName;
    }

    public void setWorkSegmentName(String workSegmentName) {
        this.workSegmentName = workSegmentName;
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

    public String getStartMileageName() {
        return startMileageName;
    }

    public void setStartMileageName(String startMileageName) {
        this.startMileageName = startMileageName;
    }

    public String getEndMileageName() {
        return endMileageName;
    }

    public void setEndMileageName(String endMileageName) {
        this.endMileageName = endMileageName;
    }

    public Double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(Double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public Double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Double endLongitude) {
        this.endLongitude = endLongitude;
    }

    public Double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Double endLatitude) {
        this.endLatitude = endLatitude;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public Integer getSafetyProtectionPersonnel() {
        return safetyProtectionPersonnel;
    }

    public void setSafetyProtectionPersonnel(Integer safetyProtectionPersonnel) {
        this.safetyProtectionPersonnel = safetyProtectionPersonnel;
    }

    public Integer getWorkPersonnel() {
        return workPersonnel;
    }

    public void setWorkPersonnel(Integer workPersonnel) {
        this.workPersonnel = workPersonnel;
    }

    public String getSubmitUserName() {
        return submitUserName;
    }

    public void setSubmitUserName(String submitUserName) {
        this.submitUserName = submitUserName;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkSegmentListRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", workSegmentName='").append(workSegmentName).append('\'');
        sb.append(", mileageSegmentId='").append(mileageSegmentId).append('\'');
        sb.append(", mileageSegmentName='").append(mileageSegmentName).append('\'');
        sb.append(", startMileageName='").append(startMileageName).append('\'');
        sb.append(", endMileageName='").append(endMileageName).append('\'');
        sb.append(", startLongitude=").append(startLongitude);
        sb.append(", startLatitude=").append(startLatitude);
        sb.append(", endLongitude=").append(endLongitude);
        sb.append(", endLatitude=").append(endLatitude);
        sb.append(", workType='").append(workType).append('\'');
        sb.append(", workDate=").append(workDate);
        sb.append(", safetyProtectionPersonnel=").append(safetyProtectionPersonnel);
        sb.append(", workPersonnel=").append(workPersonnel);
        sb.append(", submitUserName='").append(submitUserName).append('\'');
        sb.append(", submitTime=").append(submitTime);
        sb.append('}');
        return sb.toString();
    }
}
