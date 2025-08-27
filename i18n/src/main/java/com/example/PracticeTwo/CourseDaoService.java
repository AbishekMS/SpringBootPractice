package com.example.PracticeTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public class CourseDaoService {
	private static List<Course> courses= new ArrayList<>();
	private static int id=1;
	
	public List<Course> findAll() {
		
		return courses;
	}

	public Optional<Course> getById(int id) {		
		return courses.stream().filter(c-> c.getId()==id).findFirst();
	}

	public Course save(Course corse) {
		// TODO Auto-generated method stub
		corse.setId(id++);
		courses.add(corse);
		
		return corse;
	}
	
	
	
	

}
