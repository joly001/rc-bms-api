package com.zcsoft.rc.bms.api.mileage.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class MileageAddReq {

    /**
     * 里程点
     */
    @NotEmpty
    private String mileageName;
    /**
     * 里程类型(00:百米标、01:公里标)
     */
    @NotEmpty
    private String mileageType;
    /**
     * 开始位置经度
     */
    @NotNull
    private Double startLongitude;
    /**
     * 开始位置纬度
     */
    @NotNull
    private Double startLatitude;
    /**
     * 结束位置经度
     */
    @NotNull
    private Double endLongitude;
    /**
     * 结束位置纬度
     */
    @NotNull
    private Double endLatitude;
    /**
     * 作业周期
     */
    @NotNull
    private Integer workingCycle;

    public String getMileageName() {
        return mileageName;
    }

    public void setMileageName(String mileageName) {
        this.mileageName = mileageName;
    }

    public String getMileageType() {
        return mileageType;
    }

    public void setMileageType(String mileageType) {
        this.mileageType = mileageType;
    }

    public Double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(Double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public Double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Double endLongitude) {
        this.endLongitude = endLongitude;
    }

    public Double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Double endLatitude) {
        this.endLatitude = endLatitude;
    }

    public Integer getWorkingCycle() {
        return workingCycle;
    }

    public void setWorkingCycle(Integer workingCycle) {
        this.workingCycle = workingCycle;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MileageAddReq{");
        sb.append("mileageName='").append(mileageName).append('\'');
        sb.append(", mileageType='").append(mileageType).append('\'');
        sb.append(", startLongitude=").append(startLongitude);
        sb.append(", startLatitude=").append(startLatitude);
        sb.append(", endLongitude=").append(endLongitude);
        sb.append(", endLatitude=").append(endLatitude);
        sb.append(", workingCycle=").append(workingCycle);
        sb.append('}');
        return sb.toString();
    }
}
