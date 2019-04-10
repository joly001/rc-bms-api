package com.zcsoft.rc.bms.api.warning.entity;

import java.util.List;

public class WorkWarningWarningListRsp {

    private List<WorkWarningWarningRsp> list;

    public List<WorkWarningWarningRsp> getList() {
        return list;
    }

    public void setList(List<WorkWarningWarningRsp> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkWarningWarningListRsp{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
