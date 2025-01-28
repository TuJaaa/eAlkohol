package com.example.eAlkohol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class EAlkoholApplication {

	public static void main(String[] args) {
		SpringApplication.run(EAlkoholApplication.class, args);
	}

}
