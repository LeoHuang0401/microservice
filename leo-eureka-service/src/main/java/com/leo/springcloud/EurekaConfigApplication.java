package com.leo.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaConfigApplication {
    
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConfigApplication.class).run(args);
    }

}
