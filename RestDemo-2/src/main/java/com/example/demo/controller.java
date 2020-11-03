package com.example.demo;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.philips.services.iot.httpclient.exception.IoTHttpException;
import com.philips.services.iot.httpclient.exception.IoTHttpNetworkException;

import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
public class controller {
	private String currentUrl="";
	@Autowired
	private dataser dataservice;
	@GetMapping("/employee")
	public List<edata> employee() {
		
		return this.dataservice.getalldata();
	}
	@GetMapping("/employee/{id}")
	public edata getedata(@PathVariable("id")int id) {
		return dataservice.getdatabyid(id);
		
	}
	@PostMapping("/employee")
	public edata addedata(@RequestBody edata ed) {
		this.dataservice.adddata(ed);
		return ed;
	
		
	}
	@DeleteMapping("/employee/{id}")
	public void deledata(@PathVariable("id") int id)throws IoTHttpException, IoTHttpNetworkException  {
		this.dataservice.deldata(id);	
		this.dataservice.deleteMethod(currentUrl,id);
		
	}
    @PutMapping("employee/{id}")
    public edata updatedata(@RequestBody edata ed,@PathVariable("id") int id) throws IoTHttpException, IoTHttpNetworkException, JsonProcessingException{
    	this.dataservice.updatdata(ed,id);
    	this.dataservice.putMethod(currentUrl, ed, id);
    	return ed;
    }
	
	
}
