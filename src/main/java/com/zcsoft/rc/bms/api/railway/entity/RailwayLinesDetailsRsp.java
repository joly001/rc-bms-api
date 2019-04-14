package com.zcsoft.rc.bms.api.railway.entity;

public class RailwayLinesDetailsRsp {

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
    private String type;
    /**
     * 开始里程点
     */
    private String startMileageName;
    /**
     * 结束里程点id
     */
    private String endMileageId;
    /**
     * 结束里程点
     */
    private String endMileageName;
    /**
     * 上一站站点
     */
    private RailwayLinesDetailsRsp previousStation;

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

    public String getEndMileageId() {
        return endMileageId;
    }

    public void setEndMileageId(String endMileageId) {
        this.endMileageId = endMileageId;
    }

    public String getEndMileageName() {
        return endMileageName;
    }

    public void setEndMileageName(String endMileageName) {
        this.endMileageName = endMileageName;
    }

    public RailwayLinesDetailsRsp getPreviousStation() {
        return previousStation;
    }

    public void setPreviousStation(RailwayLinesDetailsRsp previousStation) {
        this.previousStation = previousStation;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RailwayLinesDetailsRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", railwayLinesName='").append(railwayLinesName).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", startMileageName='").append(startMileageName).append('\'');
        sb.append(", endMileageId='").append(endMileageId).append('\'');
        sb.append(", endMileageName='").append(endMileageName).append('\'');
        sb.append(", previousStation=").append(previousStation);
        sb.append('}');
        return sb.toString();
    }
}
