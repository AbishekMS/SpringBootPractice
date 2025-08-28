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
	
	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getRequestParam1Controller() {
		return new PersonV1("Rick Grimes");
	}
	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getRequestParam2Controller() {
		return new PersonV2(new Name("Rick","Version2"));
	}
	
	@GetMapping(path="/person", headers="X-API-VERSION=2")
	public PersonV2 getPersonV2RequestHeader() {
		return new PersonV2(new Name("Rick","header"));
	}
	@GetMapping(path="/person", headers="X-API-VERSION=1")
	public PersonV1 getPersonV1RequestHeader() {
		return new PersonV1("Rick Grimes");
	}
}
