package com.burger.example.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.burger.example.models.Burger;
import com.burger.example.services.BurgerService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("")
public class viewController {
		private final BurgerService burgerService;

	    public viewController(BurgerService burgerService){
	        this.burgerService = burgerService;
	    }
	    
	    @GetMapping("/burger")
		public String getAllBurgers(@ModelAttribute("burger") Burger burger,Model model){

			List<Burger> burgerList = burgerService.allBurgers();
			model.addAttribute("allBurgers",burgerList);

			return "index.jsp";
		}
	 // Process Burger
	 	@PostMapping("/processBurger")
	 	public String createBurger(@Valid @ModelAttribute("burger") Burger burger,
	 			BindingResult result,
	 			Model model) {
	 		if (result.hasErrors()) {
	 			// retrieve all books from db
	 			List<Burger> allBurgers = burgerService.allBurgers();
	 			model.addAttribute("allBurgers",allBurgers);
	 			return "index.jsp";
	 		}else {
	 			Burger newBurger = burgerService.createBurger(burger);
	 			return "redirect:/burger";
	 		}
	 		
	 	}
	 	
	 	@GetMapping("/edit/{id}")
		public String getAllBurgers(Model model,@PathVariable("id") Long id){

			Burger burgerToEdit = burgerService.findBurger(id);
			model.addAttribute("burger",burgerToEdit);

			return "edit.jsp";}
	 	
	 	@PutMapping("/burger/update/{id}")
	 	public String editBurger(@Valid @ModelAttribute("burger") Burger burger,
	 			BindingResult result) {
	 		if (result.hasErrors()) {
	 			return "edit.jsp";
	 		}else {
	 			burgerService.updateBurger(burger);
	 		
	 			return "redirect:/burger";
	 		}
	 		
	 	}

}
