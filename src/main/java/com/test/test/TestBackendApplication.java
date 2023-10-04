package com.test.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@CrossOrigin(origins = "https://client-ev4g.onrender.com")
@RestController
public class TestBackendApplication {

	@Value("${test.field}")
	private String field;
	public static void main(String[] args) {
		SpringApplication.run(TestBackendApplication.class, args);
	}
	
	
 
	@GetMapping("/")
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("Hello World! - From The Server " + field);
	}
	
}
