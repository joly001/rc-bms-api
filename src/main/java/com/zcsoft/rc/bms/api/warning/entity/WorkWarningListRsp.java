package com.zcsoft.rc.bms.api.warning.entity;

import java.util.Date;

public class WorkWarningListRsp {

    /**
     * id
     */
    private String id;
    /**
     * 警告id
     */
    private String workWarningId;
    /**
     * 里程区间名称
     */
    private String mileageSegmentName;
    /**
     * 作业面名称
     */
    private String workSegmentName;
    /**
     * 施工人员类型(00:机车、01:列车、02:作业人员、03:作业负责人、04:安全员、05:防护员、06:监理、07:其它人员)			db_column: BUILDER_USER_TYPE
     */
    private String builderUserType;
    /**
     * 部门名称
     */
    private String depName;
    /**
     * 组织名称
     */
    private String orgName;
    /**
     * 昵称
     */
    private String nick;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 类型(00:接近警告线)
     */
    private String type;
    /**
     * 创建时间
     */
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkWarningId() {
        return workWarningId;
    }

    public void setWorkWarningId(String workWarningId) {
        this.workWarningId = workWarningId;
    }

    public String getMileageSegmentName() {
        return mileageSegmentName;
    }

    public void setMileageSegmentName(String mileageSegmentName) {
        this.mileageSegmentName = mileageSegmentName;
    }

    public String getWorkSegmentName() {
        return workSegmentName;
    }

    public void setWorkSegmentName(String workSegmentName) {
        this.workSegmentName = workSegmentName;
    }

    public String getBuilderUserType() {
        return builderUserType;
    }

    public void setBuilderUserType(String builderUserType) {
        this.builderUserType = builderUserType;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WorkWarningListRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", workWarningId='").append(workWarningId).append('\'');
        sb.append(", mileageSegmentName='").append(mileageSegmentName).append('\'');
        sb.append(", workSegmentName='").append(workSegmentName).append('\'');
        sb.append(", builderUserType='").append(builderUserType).append('\'');
        sb.append(", depName='").append(depName).append('\'');
        sb.append(", orgName='").append(orgName).append('\'');
        sb.append(", nick='").append(nick).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}
