package com.example.PracticeTwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionController() {
		return new PersonV1("Rick Grimes");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionController() {
		return new PersonV2(new Name("Rick","Grimes"));
	}
}
