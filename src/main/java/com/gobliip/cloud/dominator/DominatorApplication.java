package com.gobliip.cloud.dominator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DominatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DominatorApplication.class, args);
    }
}
