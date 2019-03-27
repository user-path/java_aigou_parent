package com.cn.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication7110 {
     public static void main(String[] args) {
         SpringApplication.run(EurekaServerApplication7110.class );
     }
}
