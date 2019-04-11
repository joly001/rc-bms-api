package com.zcsoft.rc.bms.api.sys.entity;

public class SysParameterRsp {

    /**
     * id
     */
    private String id;
    /**
     * 参数名称
     */
    private String parameterName;
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

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SysParameterRsp{");
        sb.append("id='").append(id).append('\'');
        sb.append(", parameterName='").append(parameterName).append('\'');
        sb.append(", parameterValue='").append(parameterValue).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
