package com.zcsoft.rc.bms.api.mileage.entity;

public class MileageListReq {


    /**
     * 里程点
     */
    private String mileageName;

    public String getMileageName() {
        return mileageName;
    }

    public void setMileageName(String mileageName) {
        this.mileageName = mileageName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MileageListReq{");
        sb.append("mileageName='").append(mileageName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
