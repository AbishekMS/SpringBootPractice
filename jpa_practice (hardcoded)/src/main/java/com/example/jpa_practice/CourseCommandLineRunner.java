package com.example.jpa_practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Python", "in28Minutes"));
		repository.insert(new Course(2, "Cpp", "in28Minutes"));
		repository.insert(new Course(3, "Java", "in28Minutes"));
		repository.deleteById(3);
		System.out.println(repository.findById(1));
		repository.deleteById(1);
		System.out.println(repository.findAll());
	}
	
	

}
