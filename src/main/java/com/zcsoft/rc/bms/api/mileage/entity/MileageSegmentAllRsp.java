package com.zcsoft.rc.bms.api.mileage.entity;

import java.util.List;

public class MileageSegmentAllRsp {

    private List<MileageSegmentListRsp> list;

    public List<MileageSegmentListRsp> getList() {
        return list;
    }

    public void setList(List<MileageSegmentListRsp> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MileageSegmentAllRsp{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
