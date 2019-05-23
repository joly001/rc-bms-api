package com.zcsoft.rc.bms.api.warning.entity;

import java.util.List;

public class UserWarningListRsp {

    /**
     * 昵称
     */
    private String nick;
    /**
     * 部门名称
     */
    private String depName;
    /**
     * 组织名称
     */
    private String roleName;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 警告列表
     */
    private List<UserWarningListListRsp> list;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<UserWarningListListRsp> getList() {
        return list;
    }

    public void setList(List<UserWarningListListRsp> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserWarningListRsp{");
        sb.append("nick='").append(nick).append('\'');
        sb.append(", depName='").append(depName).append('\'');
        sb.append(", roleName='").append(roleName).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", list=").append(list);
        sb.append('}');
        return sb.toString();
    }
}
