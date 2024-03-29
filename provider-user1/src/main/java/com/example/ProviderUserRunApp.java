package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//����Eureka�ͻ���
@EnableEurekaClient
@SpringBootApplication
public class ProviderUserRunApp {
	public static void main(String[] args) {
		SpringApplication.run(ProviderUserRunApp.class, args);
	}
}
