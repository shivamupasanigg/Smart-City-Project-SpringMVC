package com.jpa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller

public class HomeController {

	// get header design
	@GetMapping("/header")
	public String header(Model m)
	{
		return "AllJSPFILES/header";
	}
	// get footer design
	@GetMapping("/footer")
	public String footer(Model m)
	{
		return "AllJSPFILES/footer";
	}
	
	// get home with header and footer
	@GetMapping("/AdminPanel")
	public String AdminPanel(HttpSession session,Model m)
	{
		int id = (int) session.getAttribute("AdminUserId");
		m.addAttribute("Id",id);
		return "AdminSection/Home";
	}
	
	
	
	
	
}
