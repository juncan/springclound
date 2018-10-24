package com.wujc.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudServerApplication.class)
                .web(true).run(args);
    }
}
