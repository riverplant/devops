package com.devops.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
//		ServiceLoader<InternetService> loader = 
//				ServiceLoader.load(InternetService.class);
//		
//		for(InternetService provider : loader) {
//			provider.connectInternet();
//		}
	}

}
