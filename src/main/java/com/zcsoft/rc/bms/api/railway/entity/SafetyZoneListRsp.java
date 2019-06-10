package com.zcsoft.rc.bms.api.railway.entity;

import java.util.List;

public class SafetyZoneListRsp {

    private List<List<List<Double>>> safetyZoneList;

    public List<List<List<Double>>> getSafetyZoneList() {
        return safetyZoneList;
    }

    public void setSafetyZoneList(List<List<List<Double>>> safetyZoneList) {
        this.safetyZoneList = safetyZoneList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SafetyZoneListRsp{");
        sb.append("safetyZoneList=").append(safetyZoneList);
        sb.append('}');
        return sb.toString();
    }
}
