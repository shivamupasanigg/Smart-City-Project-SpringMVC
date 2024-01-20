package com.jpa.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.dao.AdminRailwayDaoImpl;
import com.jpa.AdminRailway;

@Controller
public class UserViewRailway {
	
	@Autowired
	private AdminRailwayDaoImpl viewRailwaydao;
	
	@GetMapping("/UserViewRailway")
	public String UserViewRailwaypage(@RequestParam int id,Model m)
	{
		AdminRailway viewRailway = viewRailwaydao.getbyid(id);
		
		m.addAttribute("viewRailway", viewRailway);
		m.addAttribute("RailwayImageone", Base64.getEncoder().encodeToString(viewRailway.getRailway_imageone()));
		m.addAttribute("RailwayImagetwo", Base64.getEncoder().encodeToString(viewRailway.getRailway_imagetwo()));
		return "UserSection/UserViewRailway";
		
	}

}
