package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jpa.Admin;
import com.jpa.LoginAlert;
import com.jpa.dao.AdminDaoImpl;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class AdminLogin {
	
    @Autowired
     AdminDaoImpl AdI;
    
	@GetMapping("/adminloginForm")
	public String adminloginForm(Model m)
	{
		Admin a = new Admin();
		m.addAttribute("adminlogin",a);
		return "AdminSection/AdminLoginForm";
	}
	
	@PostMapping("/Login")
	public String submit(@Valid @ModelAttribute("adminlogin") Admin a1, BindingResult br, Model m,HttpSession Session) {
		if (br.hasErrors()) {
			return "AdminSection/AdminLoginForm";
		} else {
			Admin AdminUser = AdI.getUserByUsername(a1.getUsername());
			
			if (AdminUser != null && AdminUser.getPassword().equals(a1.getPassword())) {
				
				Session.setAttribute("AdminUserId",AdminUser.getId());
				return "redirect:/AdminPanel";
				} 
		else {
				return "AdminSection/AdminLoginForm";
			}

		}
	}
	
	@GetMapping("/LogoutAdmin")
	public String LogoutAdmin()
	{
		return "ShowAlert/LogoutAdminAlert";
	}
	
	
}

