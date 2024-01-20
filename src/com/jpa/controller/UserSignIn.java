package com.jpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.jpa.UserLogin;
import com.jpa.UserRegister;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import com.jpa.dao.UserSignUpLoginDaoImpl;

@Controller
public class UserSignIn {

	@Autowired
	private UserSignUpLoginDaoImpl login;
	

	@GetMapping("/UserSignIn")
	public String UserSignin(Model m) {
		UserLogin userlogin = new UserLogin();
		
		m.addAttribute("userlogin", userlogin);
		return "UserSection/UserSignIn";
	}

	@PostMapping("/UserLogin")
	public String UserLogin(@Valid @ModelAttribute("userlogin") UserLogin Userlogin, BindingResult br,Model m,HttpSession Session) {
		if (br.hasErrors()) {
			return "UserSection/UserSignIn";
		} 
		else {
			UserRegister user = login.loginUser(Userlogin.getUsername());
        if (user != null && user.getPassword().equals(Userlogin.getPassword())) {
        	Session.setAttribute("UserId", user.getId());
            return "UserSection/Userhome";
        } else {
            // Handle authentication failure
            return "UserSection/UserSignIn";
        }
		}

	}
	
	@GetMapping("/LogoutUser")
	public String LogoutAdmin()
	{
		return "UserShowAlerts/LogoutUserPanel";
	}

}
