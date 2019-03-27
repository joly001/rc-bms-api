package com.zcsoft.rc.bms.api.mileage.entity;

public class MileageSegmentListRsp {

    /**
     * id
     */
    private String id;
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
     * 作业周期
     */
    private Integer workingCycle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getWorkingCycle() {
        return workingCycle;
    }

    public void setWorkingCycle(Integer workingCycle) {
        this.workingCycle = workingCycle;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MileageSegmentListRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", mileageSegmentName='").append(mileageSegmentName).append('\'');
        sb.append(", startMileageName='").append(startMileageName).append('\'');
        sb.append(", endMileageName='").append(endMileageName).append('\'');
        sb.append(", workingCycle=").append(workingCycle);
        sb.append('}');
        return sb.toString();
    }
}