package com.zcsoft.rc.bms.api.user.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class OrganizationAddReq {

    /**
     * 组织名称
     */
    @NotEmpty
    private String orgName;
    /**
     * 组织描述
     */
    private String orgDesc;
    /**
     * 排序号
     */
    private Integer sequenceNumber;
    /**
     * 上级id
     */
    private String parentId;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgDesc() {
        return orgDesc;
    }

    public void setOrgDesc(String orgDesc) {
        this.orgDesc = orgDesc;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OrganizationAddReq{");
        sb.append("orgName='").append(orgName).append('\'');
        sb.append(", orgDesc='").append(orgDesc).append('\'');
        sb.append(", sequenceNumber=").append(sequenceNumber);
        sb.append(", parentId='").append(parentId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
