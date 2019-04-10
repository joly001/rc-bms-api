package com.zcsoft.rc.bms.api.mileage.entity;

import java.util.Date;

public class WorkSegmentDateTimeReq {

    /**
     * 开始作业时间
     */
    private Date startworkTime;
    /**
     * 结束作业时间
     */
    private Date endWorkTime;

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
        final StringBuilder sb = new StringBuilder("WorkSegmentAddDateTimeReq{");
        sb.append("startworkTime=").append(startworkTime);
        sb.append(", endWorkTime=").append(endWorkTime);
        sb.append('}');
        return sb.toString();
    }
}
