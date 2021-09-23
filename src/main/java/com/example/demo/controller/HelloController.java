package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${name}")
	private String name;
	
	
	@GetMapping(value = "/")
	public String getHello() throws Exception {
		
		if(name!=null)
		return name;
		else
			throw new Exception("variable name not found in environment variable");
	}
}
