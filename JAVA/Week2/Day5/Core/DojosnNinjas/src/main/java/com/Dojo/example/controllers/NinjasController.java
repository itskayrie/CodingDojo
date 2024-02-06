package com.Dojo.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dojo.example.models.Dojo;
import com.Dojo.example.models.Ninja;
import com.Dojo.example.services.DojoService;
import com.Dojo.example.services.NinjasService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/ninjas")
public class NinjasController {
	// DI
		@Autowired
		private NinjasService NinServ;
		@Autowired
		private DojoService DoServ; 
		
		@GetMapping("/new")
		public String ninjaForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
			List<Dojo> allDojos = DoServ.allDojos();
			model.addAttribute("allDojos",allDojos);
			return "ninjas.jsp";
		}
		
		// Process Book
		@PostMapping("/processNinja")
		public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja ,
				BindingResult result,Model model ) {
			if (result.hasErrors()) {
				return "ninjas.jsp";
			}else {
				List<Dojo> allDojos = DoServ.allDojos();
				model.addAttribute("allDojos",allDojos);
				Ninja newNinja = NinServ.createNin(ninja);
				return "redirect:/dojos/"+ninja.getDojo().getId();
			}

		}
		
		
		
	
		}

