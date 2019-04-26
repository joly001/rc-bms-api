package com.zcsoft.rc.bms.api.warning.entity;

public class WorkWarningListReq {

    /**
     * 作业面id
     */
    private String workSegmentId;
    /**
     * 警告id
     */
    private String workWarningId;

    public String getWorkSegmentId() {
        return workSegmentId;
    }

    public void setWorkSegmentId(String workSegmentId) {
        this.workSegmentId = workSegmentId;
    }

    public String getWorkWarningId() {
        return workWarningId;
    }

    public void setWorkWarningId(String workWarningId) {
        this.workWarningId = workWarningId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkWarningListReq{");
        sb.append("workSegmentId='").append(workSegmentId).append('\'');
        sb.append(", workWarningId='").append(workWarningId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
