package com.example.gradledemoeurekagateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangxing
 */
@SpringBootApplication
@EnableEurekaClient
public class GradleDemoEurekaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleDemoEurekaGatewayApplication.class, args);
    }

}
