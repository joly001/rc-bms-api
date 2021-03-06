package com.zcsoft.rc.bms.api.sys.entity;

public class SysParameterReq {

    /**
     * id
     */
    private String id;
    /**
     * 参数值
     */
    private String parameterValue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SysParameterReq{");
        sb.append("id='").append(id).append('\'');
        sb.append(", parameterValue='").append(parameterValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
