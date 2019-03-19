package com.microservices.ServConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServConfigApplication.class, args);
	}

}
