package com.zcsoft.rc.bms.api.mileage.entity;

import java.util.List;

public class WorkSegmentListListRsp {

    private List<WorkSegmentListRsp> list;

    public List<WorkSegmentListRsp> getList() {
        return list;
    }

    public void setList(List<WorkSegmentListRsp> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkSegmentListListRsp{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
