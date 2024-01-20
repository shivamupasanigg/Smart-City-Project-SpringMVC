package com.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserHome {
	
	@GetMapping("/UserHeader")
	public String UserHeader(Model m)
	{
		return "UserSection/UserHeader";
	}
	
	@GetMapping("/UserHome")
	public String UserHomePage(HttpSession session,Model m)
	{
		
		int userId = (int) session.getAttribute("UserId");
		m.addAttribute("UserId", userId);
		return "UserSection/Userhome";
	}
	
	@GetMapping("/UserFooter")
	public String UserFooter(Model m)
	{
		return "UserSection/UserFooter";
	}

}
