package com.wzgzs.eurekaerver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaErverApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaErverApplication.class, args);
    }

}
