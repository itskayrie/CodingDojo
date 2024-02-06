package com.Dojo.example.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Dojo.example.models.Dojo;

@Repository
public interface DojosRepository extends CrudRepository<Dojo, Long> {
	List<Dojo>findAll();
}
