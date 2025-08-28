package com.example.PracticeTwo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonFilter("personFilter")
public class Person {
	
	private String Name;
	private String password;
	private int age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, String password, int age) {
		
		Name = name;
		this.password = password;
		this.age = age;
	}
	

}
