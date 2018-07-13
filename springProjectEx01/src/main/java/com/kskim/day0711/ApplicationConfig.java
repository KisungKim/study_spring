package com.kskim.day0711;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student3() {
		
		Student s = new Student();
		s.setStdId("003");
		s.setName("Lee");
		s.setGrade(3.);
		s.setCourse("Database");
		return s;
	}

}
