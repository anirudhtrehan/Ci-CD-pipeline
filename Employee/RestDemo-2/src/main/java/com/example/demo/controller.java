package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class controller {
	@Autowired
	private dataser dataservice;
	@GetMapping("/employee")
	public List<edata> employee() {
		return this.dataservice.getalledata();
	}
	@GetMapping("/employee/{id}")
	public edata getedata(@PathVariable("id")int id) {
		return dataservice.getedatabyid(id);
	}
	@PostMapping("/employee")
	public edata addedata(@RequestBody edata ed) {
		this.dataservice.addbook(ed);
		return ed;
		
	}
}
