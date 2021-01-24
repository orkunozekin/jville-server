package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Home;
import com.repository.HomeRepo;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "*")
public class HomeController {
	
	/**
	 * @author orkun
	 * Instantiate the repository class
	 */
	private HomeRepo homeRepo;
	
	//Find all homes
	@GetMapping("/")
	public List<Home> findAllHomes() {
		return homeRepo.findAll();
	}
	
	//Create a new home
	@PostMapping("/newHome")
	public String insertHome(@RequestBody Home home) {
		System.out.println(home);
		homeRepo.save(home);
		return "home has successfully been inserted";
	}
	
	
	/////////Constructors
	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public HomeController(HomeRepo homeRepo) {
		this.homeRepo = homeRepo;
	}

	
	////////Getters and Setters
	public HomeRepo getHomeRepo() {
		return homeRepo;
	}

	public void setHomeRepo(HomeRepo homeRepo) {
		this.homeRepo = homeRepo;
	}
	
	

	
	
}
