package com.example.my_eureka_serve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MyEurekaServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEurekaServeApplication.class, args);
	}

}
