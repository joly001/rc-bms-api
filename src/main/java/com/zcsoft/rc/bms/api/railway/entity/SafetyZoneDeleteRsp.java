package com.zcsoft.rc.bms.api.railway.entity;

public class SafetyZoneDeleteRsp {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SafetyZoneDeleteRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
