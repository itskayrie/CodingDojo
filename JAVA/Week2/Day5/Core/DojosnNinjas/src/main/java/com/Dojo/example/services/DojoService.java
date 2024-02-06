package com.Dojo.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dojo.example.models.Dojo;
import com.Dojo.example.repositories.DojosRepository;

@Service
public class DojoService {
	@Autowired
	private DojosRepository DoRepo;
	
	public List<Dojo> allDojos(){
		return DoRepo.findAll();
	}
	
	// CREATE
	public Dojo createDojo(Dojo d) {
		return DoRepo.save(d);
	}
	
	
	// READ ONE
	public Dojo findDojoById(Long id) {
		Optional<Dojo> maybeDojo = DoRepo.findById(id);
		if(maybeDojo.isPresent()) {
			return maybeDojo.get();
		}else {
			return null;
		}
	}
}
