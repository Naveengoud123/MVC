package com.dilip.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends JpaRepository<Student, Long> {

	
	// internal default implmentation provide by SPring JPA 
	// to do Db operations 
}
