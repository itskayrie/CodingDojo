package com.burger.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.burger.example.models.Burger;
import com.burger.example.repositories.BurgerRepository;

@Service
public class BurgerService {
    // Your dependency on BurgerRepository or any other data access layer can be added here
	// Business LOGIC
		// C R U D
		
		// DI
		@Autowired
		private BurgerRepository burgerRepo;
		
    // Method to retrieve all burgers
    public List<Burger> allBurgers() {
   
        return burgerRepo.findAll();
     
    }

    // Method to create a new burger
    public Burger createBurger(Burger burger) {
     
        return burgerRepo.save(burger);
        
    }

    // Method to find a burger by ID
    public Burger findBurger(Long id) {
 
        return burgerRepo.findById(id).orElse(null);
       
    }

    // Method to update a burger
    public void updateBurger(Burger burger) {
        
        burgerRepo.save(burger);
    }
 // DELETE
 	public void deleteBurger(Long id) {
 		burgerRepo.deleteById(id);
 	}
}
