package com.sbl.microservice_project.ms_stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MsStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsStockApplication.class, args);
    }

}
