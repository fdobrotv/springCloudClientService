package com.fdobrotv.client_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }

    @Value("${some.variable:default val}")
    private String variable;

    @Scheduled(fixedRate = 2000)
    public void doSomeWork() {
        System.out.println(">>Start>>");
        System.out.println(variable);
        System.out.println("<<End<<");
    }
}