package com.micro.service.v1.microserviceexchangevaluev1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceExchangeValueV1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceExchangeValueV1Application.class, args);
    }

}
