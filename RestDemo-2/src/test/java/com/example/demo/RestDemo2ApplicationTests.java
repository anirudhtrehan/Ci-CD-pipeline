package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestDemo2ApplicationTests {

	@Autowired
	private controller controller; 
	
	
	@Test  
	void contextLoads() {
		assertThat(controller).isNotNull();
		
	}

}
