package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.UserRegister;
import com.jpa.dao.UserSignUpLoginDaoImpl;

@Controller
public class AdminViewUser {
	
	@Autowired
	private UserSignUpLoginDaoImpl viewuser;

	@GetMapping("/AdminViewUser")
	public String AdminViewUserpage(Model m)
	{
		List<UserRegister> userview = viewuser.getalldata();
		
		m.addAttribute("userview", userview);
		return "AdminSection/ViewUser";
	}
}
