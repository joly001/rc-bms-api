package com.zcsoft.rc.bms.api.mileage.entity;

import java.util.Date;

public class WorkSegmentDataTimeListRsp {

    /**
     * id
     */
    private String id;
    /**
     * 作业面id
     */
    private String workSegmentId;
    /**
     * 开始作业时间
     */
    private Date startworkTime;
    /**
     * 结束作业时间
     */
    private Date endWorkTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkSegmentId() {
        return workSegmentId;
    }

    public void setWorkSegmentId(String workSegmentId) {
        this.workSegmentId = workSegmentId;
    }

    public Date getStartworkTime() {
        return startworkTime;
    }

    public void setStartworkTime(Date startworkTime) {
        this.startworkTime = startworkTime;
    }

    public Date getEndWorkTime() {
        return endWorkTime;
    }

    public void setEndWorkTime(Date endWorkTime) {
        this.endWorkTime = endWorkTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkSegmentDataTimeListRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", workSegmentId='").append(workSegmentId).append('\'');
        sb.append(", startworkTime=").append(startworkTime);
        sb.append(", endWorkTime=").append(endWorkTime);
        sb.append('}');
        return sb.toString();
    }
}
