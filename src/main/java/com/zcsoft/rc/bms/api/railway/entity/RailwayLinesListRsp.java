package com.zcsoft.rc.bms.api.railway.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class RailwayLinesListRsp {

    /**
     * id
     */
    private String id;
    /**
     * 站点名称
     */
    private String railwayLinesName;
    /**
     * 类型(00:站点)
     */
    @NotEmpty
    private String type;
    /**
     * 开始里程点
     */
    @NotEmpty
    private String startMileageName;
    /**
     * 结束里程点
     */
    @NotEmpty
    private String endMileageName;
    /**
     * 上一站站点名称
     */
    private String previousStationName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getStartMileageName() {
        return startMileageName;
    }

    public void setStartMileageName(String startMileageName) {
        this.startMileageName = startMileageName;
    }

    public String getEndMileageName() {
        return endMileageName;
    }

    public void setEndMileageName(String endMileageName) {
        this.endMileageName = endMileageName;
    }

    public String getPreviousStationName() {
        return previousStationName;
    }

    public void setPreviousStationName(String previousStationName) {
        this.previousStationName = previousStationName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RailwayLinesListRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", railwayLinesName='").append(railwayLinesName).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", startMileageName='").append(startMileageName).append('\'');
        sb.append(", endMileageName='").append(endMileageName).append('\'');
        sb.append(", previousStationName='").append(previousStationName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
