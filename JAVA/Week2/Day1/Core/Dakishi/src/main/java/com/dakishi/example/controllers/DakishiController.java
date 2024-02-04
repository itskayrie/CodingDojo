package com.dakishi.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/")
public class DakishiController {
	
	@GetMapping("/dakishi")
	public String home () {
		return "Welcome";
	}
	@GetMapping("/dakishi/today")
	public String Quote () {
		return "today you will find luck in all your endeavors";
	}
	@GetMapping("/dakishi/tommorow")
	public String Quote2 () {
		return "tommorrow an opportunity will arise,so be sure to be open to new ideas! ";
	}
	//query parameter 
	@GetMapping("/travel/city/{cityName}")
	public String cityName(@PathVariable("cityName") String name) {
		return "congratulations you will soon traveel to  " + name;
	}
		@GetMapping("/travel/{id}")
		public String userID(@PathVariable("id") int id) {
			String message;
			if(id%2==0) {
				message="you will take a grand journey in the near future,but be weary of temting offers";
			}else {
				message="you have enjoyed the fruits of your labor ,but now is a great time to spend time with famiy and friends ";
			}
			return message;
		}
		

}
