package com.zcsoft.rc.bms.api.sys.entity;

import java.util.List;

public class SysParameterUpdateReq {

    private List<SysParameterReq> list;

    public List<SysParameterReq> getList() {
        return list;
    }

    public void setList(List<SysParameterReq> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SysParameterUpdateReq{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
