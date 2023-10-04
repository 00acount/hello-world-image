package com.test.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@CrossOrigin(origins = "*")
@RestController
public class TestBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestBackendApplication.class, args);
	}
 
	@GetMapping("/")
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("Hello World!");
	}
	
}
