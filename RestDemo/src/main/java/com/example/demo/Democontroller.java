package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontroller {


	@GetMapping("/login")
	public String abc() {
		return "Welcome!";
	}
	
	  @GetMapping("/boo") public book getbooks() {
	  
	  book obj=new book(); obj.setId(1234);
	  obj.setTitle("Java Complete Reference"); obj.setAuthor("XYZ");
	  return obj; }
	 
}
