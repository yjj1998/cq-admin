package com.cq.login.controller;

import com.cq.login.pojo.dto.ResponseDTO;
import com.cq.login.pojo.entity.Request;
import com.cq.login.service.RequestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * creator:于竞杰
 * date:2020/7/30
 * time:20:51
 */
@Controller
@RequestMapping("/Test")
public class TestController {
    @Resource
    RequestService requestService;

    public ResponseDTO checkLogin(Request request){
        return requestService.LoginCheck(request);
    }

    public ResponseDTO insert(Request request){
        return requestService.insert(request);
    }
}
