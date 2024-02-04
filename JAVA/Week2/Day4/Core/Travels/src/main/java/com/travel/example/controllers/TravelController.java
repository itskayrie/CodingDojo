package com.travel.example.controllers;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.travel.example.models.expense;
import com.travel.example.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/expenses")
public class TravelController {
	// DI
		@Autowired
		private ExpenseService expensesServ;
		
		@GetMapping("")
		public String home(@ModelAttribute("expense") expense expense, Model model) {
			List<expense> allExpenses = expensesServ.allExpenses();
			model.addAttribute("allExpenses",allExpenses);
			return "home.jsp";
		}
		
		// Process Book
		@PostMapping("/processExpense")
		public String createExp(@Valid @ModelAttribute("expense") expense expense,
				BindingResult result,
				Model model) {
			if (result.hasErrors()) {
				
				List<expense> allExpenses = expensesServ.allExpenses();
				model.addAttribute("allExpenses",allExpenses);
				return "home.jsp";
			}else {
				expense newExp = expensesServ.createExpense(expense);
				return "redirect:/expenses";
			}
			
		}
		
		@DeleteMapping("/{id}")
		public String deleteBook(@PathVariable("id") Long id) {
			
			expensesServ.deleteExpense(id);
			
			return "redirect:/expenses";
		}
		
		
		// Display Edit Form
		
		@GetMapping("/edit/{id}")
		public String getMethodName(Model model, @PathVariable("id") Long id) {
			// find the book by the id
			expense selectedExpense = expensesServ.findExpenseById(id);
			model.addAttribute("expense",selectedExpense);
			return "edit.jsp";
		}
			
		@PutMapping("/update/{id}")
		public String editExp(@Valid @ModelAttribute("expense") expense expense, BindingResult result) {
			
			if(result.hasErrors()) {
				return "edit.jsp";
			}else {
				
				expensesServ.updateExpense(expense);
			
				return "redirect:/expenses";
			}
		}
}
