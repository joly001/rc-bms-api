package com.zcsoft.rc.bms.api.mileage.entity;

public class MileageSegmentListReq {

    /**
     * 里程区间名称
     */
    private String mileageSegmentName;

    public String getMileageSegmentName() {
        return mileageSegmentName;
    }

    public void setMileageSegmentName(String mileageSegmentName) {
        this.mileageSegmentName = mileageSegmentName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MileageSegmentListReq{");
        sb.append("mileageSegmentName='").append(mileageSegmentName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
