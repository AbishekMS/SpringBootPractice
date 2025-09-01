package com.example.jpa_practice;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(int id) {
		return entityManager.find(Course.class,id);
	}
	
	public void deleteById(int id) {
		Course course=entityManager.find(Course.class,id);
		entityManager.remove(course);
		
	}

	  public List<Course> findAll() {
	        return entityManager.createQuery("SELECT c FROM Course c", Course.class)
	                            .getResultList();
	    }

}
