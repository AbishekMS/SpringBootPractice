package com.example.PracticeTwo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.stereotype.Component;

import io.micrometer.common.lang.Nullable;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@ConfigurationProperties(prefix="course-data")
public class Course {

	private int id;
	@Size(min=2, max=20, message="Course name must be between 2 and 50 characters")
	private String courseName;
	@Positive(message ="Duration must be postive")
	private long duration;
	
	
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
}
