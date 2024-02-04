package com.omikuji.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class FormController {
	@GetMapping("/form")
	public String displayForm() {
		return "form.jsp";
	}

	@PostMapping("/processForm")
	public String processForm(@RequestParam("numofyears") int numofyears,
								@RequestParam("city") String city,
								@RequestParam("person")String person,
								@RequestParam("hobby") String hobby,
								@RequestParam("thing") String thing,
								@RequestParam("nice") String nice,
								HttpSession session) {
		
		// put all the input values in session
		session.setAttribute("keyYear", numofyears);
		session.setAttribute("keyCity", city);
		session.setAttribute("keyHobby", hobby);
		session.setAttribute("keyPerson", person);
		session.setAttribute("keyNice", nice);
		session.setAttribute("keyThing", thing);
		return "redirect:/form/show";
	}
	
	@GetMapping("/form/show")
	public String result() {
		
		return "display.jsp";
	}
}
