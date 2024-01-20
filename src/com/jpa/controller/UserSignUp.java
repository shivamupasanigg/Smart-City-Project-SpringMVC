package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jpa.UserRegister;
import jakarta.validation.Valid;
import com.jpa.dao.UserSignUpLoginDaoImpl;

@Controller
public class UserSignUp {
	
	@Autowired
	private UserSignUpLoginDaoImpl signup;

	@GetMapping("/UserSignUp")
	public String Userregister(Model m)
	{
		UserRegister userregister = new UserRegister();
		m.addAttribute("userregister",userregister);
		return "UserSection/UserSignUp";
	}
	
	@PostMapping("/UserRegister")
	public String UserRegister(@Valid @ModelAttribute("userregister") UserRegister Register, BindingResult br) 
	{
		if(br.hasErrors())
		{
			return "UserSection/UserSignUp";
		}
		Register.setFullname(Register.getFullname());
		Register.setUsername(Register.getUsername());
		Register.setPassword(Register.getPassword());
		Register.setConfirmpassword(Register.getConfirmpassword());
		signup.insert(Register);
		return "UserShowAlerts/InsertRegister";
		
	}
	
}
