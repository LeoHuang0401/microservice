package com.leo.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigApplicatoin {

    public static void main(String[]args) {
        new SpringApplicationBuilder(ConfigApplicatoin.class).run(args);
    }
}
