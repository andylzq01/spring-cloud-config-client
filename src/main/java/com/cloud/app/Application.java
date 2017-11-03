package com.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
//		new SpringApplicationBuilder(Application.class).web(true).run(args);
		SpringApplication.run(Application.class,args);
	}
}