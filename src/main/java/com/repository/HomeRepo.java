package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Home;

public interface HomeRepo extends CrudRepository<Home,Integer>{
	
	//find all
	public List<Home> findAll();
	
//	
//	//find by home address
//	public List<Home> findHomeByAddress();
}
