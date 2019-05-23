package com.zcsoft.rc.bms.api.warning.entity;

import java.util.Date;

public class UserWarningListListRsp {

    /**
     * 作业面名称
     */
    private String workSegmentName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 类型(00:接近警告线、01:碾压光缆、02:线缆附近动土)
     */
    private String type;

    public String getWorkSegmentName() {
        return workSegmentName;
    }

    public void setWorkSegmentName(String workSegmentName) {
        this.workSegmentName = workSegmentName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserWarningListListRsp{");
        sb.append("workSegmentName='").append(workSegmentName).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
