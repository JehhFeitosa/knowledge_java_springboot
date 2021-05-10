package com.jessicafeitosa.Aula_Spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.jessicafeitosa.controllers"})
public class AulaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaSpringApplication.class, args);
	}

}
