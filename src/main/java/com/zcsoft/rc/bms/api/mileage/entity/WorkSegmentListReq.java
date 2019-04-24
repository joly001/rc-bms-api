package com.zcsoft.rc.bms.api.mileage.entity;

public class WorkSegmentListReq {

    /**
     * 条件
     */
    private String condition;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkSegmentListReq{");
        sb.append("condition='").append(condition).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
