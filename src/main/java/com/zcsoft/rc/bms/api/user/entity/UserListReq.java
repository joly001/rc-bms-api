package com.zcsoft.rc.bms.api.user.entity;

public class UserListReq {

    /**
     * 条件
     */
    private String condition;
    /**
     * 组织id
     */
    private String organizationId;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserListReq{");
        sb.append("condition='").append(condition).append('\'');
        sb.append(", organizationId='").append(organizationId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
