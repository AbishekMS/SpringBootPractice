	package com.example.PracticeTwo;
	
	import java.util.Arrays;
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;
	
	@RestController
	public class CourseController {
		
		private Course course;
		
		@Autowired
		CourseController(Course course){
			this.course=course;
		}
		
		@GetMapping("/courseDetails")
		public Course getCourseDetails(){
			return course;
		}
		
	
	}
