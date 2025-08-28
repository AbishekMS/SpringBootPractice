package com.example.PracticeTwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	@GetMapping("/staticBinding-JsonIgnore")
	public Person2 staticBindingWithJsonIgnore() {
		return new Person2("Abishek","freakyDeaky@123", 22);
	}
	
	@GetMapping("/staticBinding-JsonIgnoreProperties")
	public Person1 staticBindingWithJsonIgnoreProperties() {
		return new Person1("Abi","freakyDeaky@123", 22);
	}
	
}
