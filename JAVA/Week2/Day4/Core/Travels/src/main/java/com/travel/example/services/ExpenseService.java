package com.travel.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.example.models.expense;
import com.travel.example.repositories.ExpenseRepositroy;

@Service
public class ExpenseService {
	
	// DI
		@Autowired
		private ExpenseRepositroy ExpRepo;
		// READ ALL
		public List<expense> allExpenses(){
			return ExpRepo.findAll();
		}
		// CREATE
		public expense createExpense(expense b) {
			return ExpRepo.save(b);
		}
		
		
		// READ ONE
		public expense findExpenseById(Long id) {
			Optional<expense> maybeExpense = ExpRepo.findById(id);
			if(maybeExpense.isPresent()) {
				return maybeExpense.get();
			}else {
				return null;
			}
		}
		
		// UPDATE
		public expense updateExpense(expense b) {
			return ExpRepo.save(b);
		}
		
		// DELETE
		public void deleteExpense(Long id) {
			ExpRepo.deleteById(id);
		}
		
}
