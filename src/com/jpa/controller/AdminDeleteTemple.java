package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.dao.AdminTempleDaoImpl;

@Controller
public class AdminDeleteTemple {
	
	@Autowired
	private AdminTempleDaoImpl deletetemple;
	
	@GetMapping("/DeleteTemple")
	public String deletetemple(@RequestParam int id)
	{
		deletetemple.delete(id);
		return "redirect:/ListTemple";
	}

}
