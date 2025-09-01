package com.example.jdbc_practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@GetMapping("/hello")
	public String getNothing() {
		return "Hello";
	}

}
