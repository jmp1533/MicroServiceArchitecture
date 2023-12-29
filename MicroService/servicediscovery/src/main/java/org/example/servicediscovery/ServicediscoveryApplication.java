package org.example.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //Eureka 서버 설정
@SpringBootApplication
public class ServicediscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicediscoveryApplication.class, args);
    }

}
