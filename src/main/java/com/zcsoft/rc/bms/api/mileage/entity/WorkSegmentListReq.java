package com.zcsoft.rc.bms.api.mileage.entity;

import java.util.Date;

public class WorkSegmentListReq {

    /**
     * 作业面名称
     */
    private String workSegmentName;
    /**
     * 里程区间名称
     */
    private String mileageSegmentName;
    /**
     * 作业时间
     */
    private Date workDate;

    public String getWorkSegmentName() {
        return workSegmentName;
    }

    public void setWorkSegmentName(String workSegmentName) {
        this.workSegmentName = workSegmentName;
    }

    public String getMileageSegmentName() {
        return mileageSegmentName;
    }

    public void setMileageSegmentName(String mileageSegmentName) {
        this.mileageSegmentName = mileageSegmentName;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkSegmentListReq{");
        sb.append("workSegmentName='").append(workSegmentName).append('\'');
        sb.append(", mileageSegmentName='").append(mileageSegmentName).append('\'');
        sb.append(", workDate=").append(workDate);
        sb.append('}');
        return sb.toString();
    }
}
