package com.ellison.pei.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ellisonpei
 */
@PropertySource("classpath:test.properties")
@Configuration
public class Student {

	@Value("#{student.name}")
	private String name;
	@Value("#{student.password}")
	private String password;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
