package com.cn.aigou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.cn.aigou.mapper")
public class LoginClientApplication8100 {
     public static void main(String[] args) {
         SpringApplication.run(LoginClientApplication8100.class);
     }
}
