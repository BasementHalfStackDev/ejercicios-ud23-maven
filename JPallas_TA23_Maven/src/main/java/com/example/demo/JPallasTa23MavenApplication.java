package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JPallasTa23MavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(JPallasTa23MavenApplication.class, args);
	}
	
	@GetMapping("/")
	public String welcome() {
		return String.format("Bienvenido a Spring framework!");
	}
	
	@GetMapping("/hello")
	public String hello() {
		return String.format("Hello world!");
	}
	
	@GetMapping("/sus")
	public String sus() {
		return String.format("You sussy baka!");
	}

}
