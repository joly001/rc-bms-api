package com.zcsoft.rc.bms.api.user.entity;

public class RoleListReq {

    /**
     * 权限名称
     */
    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RoleListReq{");
        sb.append("roleName='").append(roleName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
