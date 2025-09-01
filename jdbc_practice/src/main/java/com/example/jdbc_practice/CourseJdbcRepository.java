package com.example.jdbc_practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY =
			"insert into course(id,name,author) values (1,'Springboot','Tulesko')";
	
	private static String DELETE_QUERY_ID =
			"DELETE FROM COURSE WHERE ID = ?";
	
	private static String SELECT_QUERY_ID =
			"SELECT * FROM COURSE WHERE ID = ?";
	
    private static String INSERT_QUERY_USING_PARAMETERS= "insert into course(id,name,author) values (?,?,?)";

	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}
	public void insertViaParameter(int id, String name, String author) {
		springJdbcTemplate.update(INSERT_QUERY_USING_PARAMETERS,id,name,author);
	}
	public void insertViaParameter(Course course) {
		springJdbcTemplate.update(INSERT_QUERY_USING_PARAMETERS,course.getId(),course.getName(),course.getAuthor());
	}	
	
	public void deleteById(int id) {
		springJdbcTemplate.update(DELETE_QUERY_ID,id);
	}
	
	public Course findById(int id) {
		return springJdbcTemplate.queryForObject(SELECT_QUERY_ID, new BeanPropertyRowMapper<>(Course.class), id);
	}

		
}
