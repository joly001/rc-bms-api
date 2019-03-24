package com.zcsoft.rc.bms.api.user.entity;

import java.util.List;
import java.util.Objects;

public class OrganizationAllRsp {

    /**
     * id
     */
    private String id;
    /**
     * 组织名称
     */
    private String orgName;
    /**
     * 排序号
     */
    private Integer sequenceNumber;
    /**
     * 子组织列表
     */
    private List<OrganizationAllRsp> childOrgList;

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
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public List<OrganizationAllRsp> getChildOrgList() {
        return childOrgList;
    }

    public void setChildOrgList(List<OrganizationAllRsp> childOrgList) {
        this.childOrgList = childOrgList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganizationAllRsp that = (OrganizationAllRsp) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OrganizationAllRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", orgName='").append(orgName).append('\'');
        sb.append(", sequenceNumber=").append(sequenceNumber);
        sb.append(", childOrgList=").append(childOrgList);
        sb.append('}');
        return sb.toString();
    }
}
