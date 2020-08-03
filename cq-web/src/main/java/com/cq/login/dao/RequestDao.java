package com.cq.login.dao;

import com.cq.login.pojo.entity.Request;
import org.springframework.stereotype.Component;


public interface RequestDao {
    int deleteByPrimaryKey(Integer optid);

    int insert(Request record);

    int insertSelective(Request record);

    Request selectByPrimaryKey(Integer optid);

    int updateByPrimaryKeySelective(Request record);

    int updateByPrimaryKey(Request record);

    int loginCheck(Request request);
}