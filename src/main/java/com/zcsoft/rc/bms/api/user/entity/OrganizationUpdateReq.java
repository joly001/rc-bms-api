package com.zcsoft.rc.bms.api.user.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class OrganizationUpdateReq {

    /**
     * id
     */
    @NotEmpty
    private String id;
    /**
     * 组织名称
     */
    @NotEmpty
    @Length(max = 50)
    private String orgName;
    /**
     * 组织描述
     */
    @Length(max = 200)
    private String orgDesc;
    /**
     * 排序号
     */
    private Integer sequenceNumber;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OrganizationUpdateReq{");
        sb.append("id='").append(id).append('\'');
        sb.append(", orgName='").append(orgName).append('\'');
        sb.append(", orgDesc='").append(orgDesc).append('\'');
        sb.append(", sequenceNumber=").append(sequenceNumber);
        sb.append('}');
        return sb.toString();
    }
}
