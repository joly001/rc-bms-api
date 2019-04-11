package com.zcsoft.rc.bms.api.sys.entity;

import java.util.List;

public class SysParameterAllRsp {

    private List<SysParameterRsp> list;

    public List<SysParameterRsp> getList() {
        return list;
    }

    public void setList(List<SysParameterRsp> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SysParameterAllRsp{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
