package com.Dojo.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dojo.example.models.Ninja;
import com.Dojo.example.repositories.NinjasRepository;



@Service
public class NinjasService {
	
	@Autowired
	private NinjasRepository NinRepo;
	
	public List<Ninja> allNinjas(){
		return NinRepo.findAll();
	}
	
	// CREATE
	public Ninja createNin(Ninja n) {
		return NinRepo.save(n);
	}
	
	
	// READ ONE
	public Ninja findNinById(Long id) {
		Optional<Ninja> maybeNin = 	NinRepo.findById(id);
		if(maybeNin.isPresent()) {
			return maybeNin.get();
		}else {
			return null;
		}
	}
		
}
