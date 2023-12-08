package com.naveen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PatientOperations {

	@Autowired
	JdbcTemplate template;
	
}
