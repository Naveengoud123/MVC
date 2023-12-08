package com.naveen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOperations {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void addEmployee() {

		//jdbcTemplate.update("insert into employee(Empid,name,age) VALUES(3,'Krithvik',04)");

		jdbcTemplate.update("delete from employee where empid=3");
	}

}