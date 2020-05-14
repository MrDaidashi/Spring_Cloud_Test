package com.example.my_eureka_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MyEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEurekaClientApplication.class, args);
	}


}
