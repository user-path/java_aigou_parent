package com.cn.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserClientApplication8001 {
     public static void main(String[] args) {
         SpringApplication.run(UserClientApplication8001.class );
     }
}
