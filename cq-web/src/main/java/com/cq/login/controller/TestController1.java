package com.cq.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * creator:于竞杰
 * date:2020/7/31
 * time:14:38
 */
@RestController
@RequestMapping("/upload")
public class TestController1 {


    //@RequestMapping("/test")
    public String UploadFile(MultipartFile file) {
        if (file.getSize() > 0) {

            long i =file.getSize()/1024;

            System.out.println("文件大小是" + i+"kb");
            String originalFilename = file.getOriginalFilename();
            String s = originalFilename.substring(originalFilename.lastIndexOf("."));
            String uid= UUID.randomUUID().toString();
            String fileName=uid+s;
            File file1=new File("D:\\100Test2\\1\\"+File.separator+fileName);

            try {
                file.transferTo(file1);
                System.out.println(file1);
                return "保存成功"+fileName;
            } catch (IOException e) {
                e.printStackTrace();
                return "保存失败";
            }
        }
        return "文件不能为空";
    }

    @RequestMapping("/test2")
    public Object UploadFiles(MultipartHttpServletRequest request) {

        List list = new ArrayList();
        Map<String, MultipartFile> fileMap = request.getFileMap();

        Set<String> stringSet = fileMap.keySet();

        for (String groupName : stringSet) {
            List<MultipartFile> files = request.getFiles(groupName);// 取出当前组的这些图片
            for (MultipartFile file : files) {
                String s = UploadFile(file);
                list.add(s);
            }
        }
        return list;
    }
}
