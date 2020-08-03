package com.cq.login.pojo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * response
 * @author 
 */
@Data
public class Response implements Serializable {
    /**
     * 0:成功1：失败
     */
    private Byte transcode;

    /**
     * 错误信息，成功时为''
     */
    private String errormsg;

    /**
     * 操作员最近登陆时间
     */
    private String intime;

    /**
     * 操作员最近登出时间
     */
    private String outtime;

    /**
     * 操作员最近工班状况
     */
    private Integer shift;

    /**
     * 操作员权限
     */
    private Integer rules;

    /**
     * 操作员最近工班时间
     */
    private Date workdate;

    /**
     * 操作员姓名
     */
    private String name;

    private static final long serialVersionUID = 1L;
}