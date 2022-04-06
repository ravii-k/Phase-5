package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Project3Application {
	@GetMapping("/")
	public String home() {
		
		return "hi simpleleran welcome to the docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(Project3Application.class, args);
	}
}

