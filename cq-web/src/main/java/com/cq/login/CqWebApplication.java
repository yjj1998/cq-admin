package com.cq.login;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.cq.login.dao"})
public class CqWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CqWebApplication.class, args);
    }

}
