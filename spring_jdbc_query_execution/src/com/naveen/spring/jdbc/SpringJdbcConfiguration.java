package com.naveen.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@ComponentScan("com.naveen.*")
@Configuration
public class SpringJdbcConfiguration {
	
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("SYSTEM");
		dataSource.setPassword("MANAGER");
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource);
		
		return template;
	}
	


}