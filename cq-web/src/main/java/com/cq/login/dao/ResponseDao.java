package com.cq.login.dao;

import com.cq.login.pojo.entity.Response;
import org.springframework.stereotype.Component;


public interface ResponseDao {
    int deleteByPrimaryKey(Byte transcode);

    int insert(Response record);

    int insertSelective(Response record);

    Response selectByPrimaryKey(Byte transcode);

    int updateByPrimaryKeySelective(Response record);

    int updateByPrimaryKey(Response record);
}