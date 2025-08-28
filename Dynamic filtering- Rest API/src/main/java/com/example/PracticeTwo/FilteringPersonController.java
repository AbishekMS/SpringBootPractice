package com.example.PracticeTwo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringPersonController {
	
	@GetMapping("/dynamicBinding") // ignoring password
	public MappingJacksonValue dynamicBinding() {
		Person person = new Person("Abishek","freakyDeaky@123", 22);
		MappingJacksonValue mappingJacksonValue= new MappingJacksonValue(person);
		Set<String> set= Set.of("name","age");
		SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept(set);
		FilterProvider filters= new SimpleFilterProvider().addFilter("personFilter", filter);
		mappingJacksonValue.setFilters(filters);
		return mappingJacksonValue;
	}
	
	@GetMapping("/dynamicBinding-List")
	public MappingJacksonValue dynamicBindingWithList() {
		List<Person> persons= Arrays.asList(new Person("Abishek","freakyDeaky@123", 22),new Person("Abi","freakyDeaky@123", 20));
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(persons);
		SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("name");
		FilterProvider filters= new SimpleFilterProvider().addFilter("personFilter", filter);
		mappingJacksonValue.setFilters(filters);
		return mappingJacksonValue;
	}
	
}
