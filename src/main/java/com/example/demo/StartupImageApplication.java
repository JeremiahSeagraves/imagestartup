package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@ComponentScan("com.example.demo")
@RestController
public class StartupImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartupImageApplication.class, args);
	}
	
}
