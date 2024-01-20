package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.jpa.dao.AdminRailwayDaoImpl;
@Controller
public class AdminDeleteRailway {
	
	@Autowired
	private AdminRailwayDaoImpl deleteRailway;

	@GetMapping("/DeleteRailway")
	public String deleteRailway(@RequestParam int id)
	{
		deleteRailway.delete(id);
		return "redirect:/ListRailway";
	}
}
