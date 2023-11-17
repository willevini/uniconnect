package com.uniconnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniconnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniconnectApplication.class, args);

		System.out.println("Aplicação rodando, acesse: http://localhost:8080");
	}
}
