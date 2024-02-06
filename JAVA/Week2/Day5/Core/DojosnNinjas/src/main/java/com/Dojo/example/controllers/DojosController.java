package com.Dojo.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dojo.example.models.Dojo;
import com.Dojo.example.services.DojoService;
import com.Dojo.example.services.NinjasService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/dojos")
public class DojosController {
	
	@Autowired
	private NinjasService NinServ;
	@Autowired
	private DojoService DoServ;
	
	@GetMapping("/new")
	public String allDojos(@ModelAttribute("dojo") Dojo dojo) {
		
		return "dojos.jsp";
	}
	@PostMapping("/processDojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo,
			BindingResult result) {
		if (result.hasErrors()) {
			return "Dashboard.jsp";
		}else {
			Dojo newDojo = DoServ.createDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}
	@GetMapping("/{id}")
	public String ninjaByDojo(@PathVariable Long id,Model model) {
		Dojo saved = DoServ.findDojoById(id);
		model.addAttribute("dojo", saved);
		return "Dashboard.jsp";
	}

}
