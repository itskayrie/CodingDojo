package com.travel.example.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.travel.example.models.expense;

@Repository
public interface ExpenseRepositroy extends CrudRepository<expense, Long> {
	List<expense>findAll();
}
