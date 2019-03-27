package com.zcsoft.rc.bms.api.user.entity;

import java.util.Date;

public class UserListRsp {

    /**
     * id
     */
    public String id;
    /**
     * 姓名
     */
    private String nick;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 角色(00:机车、01:列车、02:施工人员、03:安全防护员、04:作业负责人、05:监理、06:其它人员)
     */
    private String builderUserType;
    /**
     * 状态(00:入场、01:出场)
     */
    private String builderStatus;
    /**
     * 入场时间
     */
    private Date admissionDate;
    /**
     * 离场时间
     */
    private Date leaveDate;
    /**
     * 手环编码
     */
    private String wristStrapCode;

}
