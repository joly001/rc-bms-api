package com.zcsoft.rc.bms.api.user.entity;

import java.util.TreeMap;

public class UserAuthoritiesRsp {

    /**
     * 用户名
     */
    private String username;
    /**
     * 权限列表
     */
    private TreeMap<String, String> authorities;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public TreeMap<String, String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(TreeMap<String, String> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserAuthoritiesRsp{");
        sb.append("username='").append(username).append('\'');
        sb.append(", authorities=").append(authorities);
        sb.append('}');
        return sb.toString();
    }
}
