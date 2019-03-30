package com.zcsoft.rc.bms.api.user.entity;

import org.hibernate.validator.constraints.NotEmpty;

import java.util.Map;

public class RoleDetailsRsp {

    /**
     * id
     */
    @NotEmpty
    private String id;
    /**
     * 角色名称
     */
    @NotEmpty
    private String roleName;
    /**
     * 角色描述
     */
    private String roleDesc;
    /**
     * 权限列表
     */
    private Map<String, String> authorities;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Map<String, String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Map<String, String> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RoleDetailsRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", roleName='").append(roleName).append('\'');
        sb.append(", roleDesc='").append(roleDesc).append('\'');
        sb.append(", authorities=").append(authorities);
        sb.append('}');
        return sb.toString();
    }
}
