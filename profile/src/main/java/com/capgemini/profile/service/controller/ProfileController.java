package com.capgemini.profile.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.profile.service.ProfileService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ProfileController {

	@Autowired
	private ProfileService service;
	
	
	@GetMapping
	public void getOrderHistory()
	{
		
	}
	
}
