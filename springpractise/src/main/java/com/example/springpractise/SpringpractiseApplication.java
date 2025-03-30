package com.example.springpractise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class SpringpractiseApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpringpractiseApplication.class, args);
	    Car car= context.getBean(Car.class);
		car.getStart();
	}

}
