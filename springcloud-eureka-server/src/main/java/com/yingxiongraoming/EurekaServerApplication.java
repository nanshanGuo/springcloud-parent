 package com.yingxiongraoming;

 import org.springframework.boot.SpringApplication;
 import org.springframework.boot.autoconfigure.SpringBootApplication;
 import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
 
 /**
 * @author yingxiongraoming
 * @date 2021/01/11
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
 
}