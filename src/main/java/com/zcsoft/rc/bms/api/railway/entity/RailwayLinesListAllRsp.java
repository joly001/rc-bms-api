package com.zcsoft.rc.bms.api.railway.entity;

import java.util.List;

public class RailwayLinesListAllRsp {

    private List<RailwayLinesAllRsp> list;

    public List<RailwayLinesAllRsp> getList() {
        return list;
    }

    public void setList(List<RailwayLinesAllRsp> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RailwayLinesListAllRsp{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
