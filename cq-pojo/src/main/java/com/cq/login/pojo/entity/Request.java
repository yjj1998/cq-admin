package com.cq.login.pojo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * request
 * @author 
 */
@Data
public class Request implements Serializable {
    /**
     * 操作员id
     */
    private Integer optid;

    /**
     * 操作员密码MD5加密
     */
    private String password;

    /**
     * 0:下班,1：白班,2:夜班
     */
    private String lanehex;

    /**
     * 工作日期
     */
    private Date workdate;

    private static final long serialVersionUID = 1L;
}