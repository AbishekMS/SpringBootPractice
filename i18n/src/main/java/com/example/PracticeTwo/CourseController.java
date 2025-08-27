package com.example.PracticeTwo;
	
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
	
@RestController
public class CourseController {
		
	    private MessageSource messageSource;
		private CourseDaoService service;
		
		@Autowired
		CourseController(CourseDaoService service, MessageSource messageSource){
			this.service=service;
			this.messageSource=messageSource;
		}
		
		@GetMapping("/courseDetails")
		public List<Course> getCourseDetails(){	
			return  service.findAll();
		}
		
		@GetMapping("/hello")
		public String sayHello() {
			Locale locale= LocaleContextHolder.getLocale();
			return messageSource.getMessage("hello.world.message", null, "Default message", locale);
			
				}
		@GetMapping("/courseDetails/{id}")
		public Optional<Course> getCourseById(@PathVariable int id){	
			return  service.getById(id);
		}
		
		@PostMapping("/courses")
		public ResponseEntity<Course> createCourse(@Validated @RequestBody Course corse){
			Course course= service.save(corse);
			URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(course.getId()).toUri();
			return ResponseEntity.created(location).build();
		}
		
	
	}
