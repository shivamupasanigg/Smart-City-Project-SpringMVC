package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.dao.AdminRestaurantDaoImpl;

@Controller
public class AdminDeleteRestaurant {
	
	@Autowired
	private AdminRestaurantDaoImpl deleterestaurant;
	
	@GetMapping("/DeleteRestaurant")
	public String DeleteRestaurant(@RequestParam int id)
	{
		deleterestaurant.delete(id);
		return "redirect:/ListRestaurant";
	}
	

}
