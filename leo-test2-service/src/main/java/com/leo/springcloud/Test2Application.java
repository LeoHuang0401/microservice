package com.leo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(info =
@Info(title = "Test2 API", version = "1.0", description = "Documentation Test2 API v1.0"))
public class Test2Application {

    public static void main(String[]args) {
        SpringApplication.run(Test2Application.class, args);
    }
}
