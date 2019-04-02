package com.zcsoft.rc.bms.api.mileage.entity;

public class MileageWorkSegmentReq {

    /**
     * 里程id
     */
    public String mileageSegmentId;

    public String getMileageSegmentId() {
        return mileageSegmentId;
    }

    public void setMileageSegmentId(String mileageSegmentId) {
        this.mileageSegmentId = mileageSegmentId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MileageWorkSegmentReq{");
        sb.append("mileageSegmentId='").append(mileageSegmentId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
