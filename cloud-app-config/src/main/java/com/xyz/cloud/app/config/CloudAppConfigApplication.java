package com.xyz.cloud.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
// spring-cloud-config 生效的注解
@EnableConfigServer
public class CloudAppConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudAppConfigApplication.class, args);
	}
}
