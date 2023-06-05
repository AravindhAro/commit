package com.Employee_App.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Employee_App.OneServices.DemoOneService;
import com.Employee_App.dto.CommonDto;
import com.Employee_App.dto.FormDto;

@RestController

public class DemoOneController {

	@Autowired
	private DemoOneService demoservice;
	
	
	@RequestMapping(value = "/Demo1" ,method = RequestMethod.POST)
	public String demo(@RequestBody String name) {
	String demodd=	demoservice.view(name);
		return demodd;	
	}
	@RequestMapping(value = "/Demo11" ,method = RequestMethod.POST)
	public ResponseEntity<String> save(@RequestBody FormDto FormDto){
		String result = demoservice.save(FormDto);
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
	@GetMapping(value = "/get")
	private ResponseEntity<String> viewByName(@RequestParam(name = "name") String name) {

		String response = demoservice.viewByName(name);
System.err.println(response);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
}
