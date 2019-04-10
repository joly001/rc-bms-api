package com.zcsoft.rc.bms.api.mileage.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class WorkSegmentAddReq {

    /**
     * 作业面名称
     */
    @NotEmpty
    private String workSegmentName;
    /**
     * 里程区间id
     */
    @NotEmpty
    private String mileageSegmentId;
    /**
     * 里程区间名称
     */
    @NotEmpty
    private String mileageSegmentName;
    /**
     * 开始里程点
     */
    @NotEmpty
    private String startMileageName;
    /**
     * 结束里程点
     */
    @NotEmpty
    private String endMileageName;
    /**
     * 作业类型(00:上行、01:下行)
     */
    @NotEmpty
    private String workType;
    /**
     * 作业时间
     */
    @NotNull
    private Date workDate;
    /**
     * 安全防护人员数
     */
    @NotNull
    private Integer safetyProtectionPersonnel;
    /**
     * 现场人员数
     */
    @NotNull
    private Integer workPersonnel;

    /**
     * 作业时间段
     */
    @NotNull
    private List<WorkSegmentDateTimeReq> workDateTimeList;

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

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public Date getWorkDate() {
        return workDate;
    }

    @JsonFormat(pattern="yyyy-MM-dd")
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

    public List<WorkSegmentDateTimeReq> getWorkDateTimeList() {
        return workDateTimeList;
    }

    public void setWorkDateTimeList(List<WorkSegmentDateTimeReq> workDateTimeList) {
        this.workDateTimeList = workDateTimeList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkSegmentAddReq{");
        sb.append("workSegmentName='").append(workSegmentName).append('\'');
        sb.append(", mileageSegmentId='").append(mileageSegmentId).append('\'');
        sb.append(", mileageSegmentName='").append(mileageSegmentName).append('\'');
        sb.append(", startMileageName='").append(startMileageName).append('\'');
        sb.append(", endMileageName='").append(endMileageName).append('\'');
        sb.append(", workType='").append(workType).append('\'');
        sb.append(", workDate=").append(workDate);
        sb.append(", safetyProtectionPersonnel=").append(safetyProtectionPersonnel);
        sb.append(", workPersonnel=").append(workPersonnel);
        sb.append(", workDateTimeList=").append(workDateTimeList);
        sb.append('}');
        return sb.toString();
    }
}
