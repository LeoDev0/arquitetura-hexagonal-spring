package com.example.hexagonalspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HexagonalSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalSpringApplication.class, args);
	}

}
