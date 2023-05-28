package com.huang.cn.dangdang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.huang.**.dao")
public class DangdangApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DangdangApplication.class, args);
    }

}
