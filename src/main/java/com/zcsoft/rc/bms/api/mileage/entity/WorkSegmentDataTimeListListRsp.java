package com.zcsoft.rc.bms.api.mileage.entity;

import java.util.List;

public class WorkSegmentDataTimeListListRsp {

    /**
     * 作业时间列表
     */
    private List<WorkSegmentDataTimeListRsp> list;

    public List<WorkSegmentDataTimeListRsp> getList() {
        return list;
    }

    public void setList(List<WorkSegmentDataTimeListRsp> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkSegmentDataTimeListListRsp{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
