package com.banu.cloud.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LocationServiceApplication {

	public static void main(String[] args) {
		System.out.println("\n Application Started");
		
		SpringApplication.run(LocationServiceApplication.class, args);
		
		System.out.println("\n Application exited");
	}
}
