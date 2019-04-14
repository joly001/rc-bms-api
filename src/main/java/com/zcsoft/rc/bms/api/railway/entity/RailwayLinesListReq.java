package com.zcsoft.rc.bms.api.railway.entity;

public class RailwayLinesListReq {

    /**
     * 站点名称
     */
    private String railwayLinesName;
    /**
     * 类型(00:站点)
     */
    private String type;

    public String getRailwayLinesName() {
        return railwayLinesName;
    }

    public void setRailwayLinesName(String railwayLinesName) {
        this.railwayLinesName = railwayLinesName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RailwayLinesListReq{");
        sb.append("railwayLinesName='").append(railwayLinesName).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
