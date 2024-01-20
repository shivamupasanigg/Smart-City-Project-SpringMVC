package com.jpa.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.AdminRestaurent;
import com.jpa.dao.AdminRestaurantDaoImpl;

@Controller
public class UserViewRestaurent {
	
	@Autowired
	private AdminRestaurantDaoImpl ViewRestaurentdao;
	
	@GetMapping("/UserViewRestaurent")
	public String UserViewRestaurentpage(@RequestParam int id,Model m)
	{
		AdminRestaurent ViewRestaurent = ViewRestaurentdao.getbyid(id);
		
		m.addAttribute("ViewRestaurent", ViewRestaurent);
		m.addAttribute("RestaurentImageone", Base64.getEncoder().encodeToString(ViewRestaurent.getRestaurant_imgone()));
		m.addAttribute("RestaurentImagetwo", Base64.getEncoder().encodeToString(ViewRestaurent.getRestaurant_imgtwo()));
		return "UserSection/UserViewRestaurent";
	}

}
