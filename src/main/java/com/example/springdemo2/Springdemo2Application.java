package com.example.springdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Springdemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdemo2Application.class, args);
	}

}
