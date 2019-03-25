package com.zcsoft.rc.bms.api.user.entity;

import java.util.List;
import java.util.Objects;

public class AuthoritiesAllRsp {

    /**
     * id
     */
    private java.lang.String id;
    /**
     * 权限名称
     */
    private java.lang.String name;
    /**
     * 排序号
     */
    private java.lang.Integer sequenceNumber;

    private List<AuthoritiesAllRsp> authorities;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public List<AuthoritiesAllRsp> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<AuthoritiesAllRsp> authorities) {
        this.authorities = authorities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthoritiesAllRsp that = (AuthoritiesAllRsp) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AuthoritiesAllRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", sequenceNumber=").append(sequenceNumber);
        sb.append(", authorities=").append(authorities);
        sb.append('}');
        return sb.toString();
    }
}
