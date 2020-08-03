package com.cq.login.service.impl;

import com.cq.login.dao.RequestDao;
import com.cq.login.pojo.dto.ResponseDTO;
import com.cq.login.pojo.entity.Request;
import com.cq.login.service.RequestService;
import com.cq.login.util.password.PasswordUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * creator:于竞杰
 * date:2020/7/30
 * time:20:14
 */
@Service
public class RequestServiceImpl implements RequestService {
    @Resource
    RequestDao requestDao;

    @Override
    public ResponseDTO LoginCheck(Request request) {
        if (request.getPassword()!=null||request.getOptid()!=null){
            String s = PasswordUtil.encodePassword(request.getPassword());
            request.setPassword(s);
            int i = requestDao.loginCheck(request);
            if (i!=0){
                return ResponseDTO.ok("老铁没毛病");
            }else {
                return ResponseDTO.fail("密码错误");
            }
        }
        return ResponseDTO.fail("密码或者id不能为空");
    }

    @Override
    public ResponseDTO insert(Request request) {
        if (request.getOptid()!=null&&request.getPassword()!=null){
            String s=PasswordUtil.encodePassword(request.getPassword());
            request.setPassword(s);
            //DateFormat df=new SimpleDateFormat("YYYY-MM-DD");
            request.setWorkdate(new Date());
            request.setLanehex("1");
            int i = requestDao.insertSelective(request);
            if (i!=0){
                return ResponseDTO.ok("添加成功");
            }else {
                return ResponseDTO.fail("添加失败");
            }
        }
        return ResponseDTO.fail("输入内容不能为空");
    }
}
