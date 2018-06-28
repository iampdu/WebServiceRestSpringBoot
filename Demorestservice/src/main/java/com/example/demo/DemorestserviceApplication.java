package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@EnableAutoConfiguration
@EnableConfigurationProperties
@EntityScan(basePackages=("com.example.model"))
@SpringBootApplication
public class DemorestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemorestserviceApplication.class, args);
	}
}
