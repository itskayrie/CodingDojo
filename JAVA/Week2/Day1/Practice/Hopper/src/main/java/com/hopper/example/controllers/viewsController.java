package com.hopper.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class viewsController { 
	
	@GetMapping("/index")
	public String order(Model MyModel) {
		String username="copper wire";
		double price=5.25;
		String description = "Metal strips, also an illustration of nanoseconds.";
	    String vendor = "Little Things Corner Store";
		MyModel.addAttribute("name",username);
		MyModel.addAttribute("age",price);
		MyModel.addAttribute("desc" ,description);
		MyModel.addAttribute("vendor",vendor);
		return "index.jsp";
	}
}	
