package com.zcsoft.rc.bms.api.railway.entity;

import java.util.List;

public class SafetyZoneAddReq {

    private List<List<Double>> safetyZone;

    public List<List<Double>> getSafetyZone() {
        return safetyZone;
    }

    public void setSafetyZone(List<List<Double>> safetyZone) {
        this.safetyZone = safetyZone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SafetyZoneAddReq{");
        sb.append("safetyZone=").append(safetyZone);
        sb.append('}');
        return sb.toString();
    }
}
