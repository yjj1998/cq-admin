package com.cq.login.service;

import com.cq.login.pojo.dto.ResponseDTO;
import com.cq.login.pojo.entity.Request;
import org.springframework.stereotype.Service;

/**
 * creator:于竞杰
 * date:2020/7/30
 * time:20:13
 */

public interface RequestService {
    ResponseDTO LoginCheck(Request request);

    ResponseDTO insert(Request request);
}
