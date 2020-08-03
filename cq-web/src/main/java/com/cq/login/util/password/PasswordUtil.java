package com.cq.login.util.password;

import org.springframework.web.servlet.HandlerInterceptor;

/**
 * creator:于竞杰
 * date:2020/7/28
 * time:0:50
 * 测试用1
 */
public class PasswordUtil {
    private static final String SALT="cq-login";
    public static String encodePassword(String password){
        String salt="{{"+SALT+"}}";//"盐值准备好"
        MD5Code md5Code=new MD5Code();
        String md5ofstr=md5Code.getMD5ofStr(salt+password);
        for (int i = 0; i <3 ; i++) {
            md5ofstr=md5Code.getMD5ofStr(md5ofstr);
        }
        return md5ofstr;
    }



}
