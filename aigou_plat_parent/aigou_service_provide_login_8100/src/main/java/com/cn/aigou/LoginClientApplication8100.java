package com.cn.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoginClientApplication8100 {
     public static void main(String[] args) {
         SpringApplication.run(LoginClientApplication8100.class);
     }
}
