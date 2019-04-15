package com.zcsoft.rc.bms.api.warning.entity;

public class TrainWarningListReq {

    /**
     * 作业面id
     */
    private String workSegmentId;

    public String getWorkSegmentId() {
        return workSegmentId;
    }

    public void setWorkSegmentId(String workSegmentId) {
        this.workSegmentId = workSegmentId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TrainWarningListReq{");
        sb.append("workSegmentId='").append(workSegmentId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
