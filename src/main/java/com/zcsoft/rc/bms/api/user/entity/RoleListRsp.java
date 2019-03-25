package com.zcsoft.rc.bms.api.user.entity;

import java.util.Date;

public class RoleListRsp {

    /**
     * id
     */
    private String id;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色描述
     */
    private String roleDesc;
    /**
     * 00:默认、01:自定义
     */
    private String roleType;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifyTime;

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

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RoleListRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", roleName='").append(roleName).append('\'');
        sb.append(", roleDesc='").append(roleDesc).append('\'');
        sb.append(", roleType='").append(roleType).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append('}');
        return sb.toString();
    }
}
