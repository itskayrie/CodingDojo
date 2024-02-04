package com.human.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Human {
	@GetMapping("/greet")
	public String home() {
	return "Hello Humans ";	
	}
	
	//query parameter 
	@GetMapping("/search")
	public String SearchEngine(@RequestParam(value="query") String SearchQuery) {
		return "hello " + SearchQuery;
	}


}
