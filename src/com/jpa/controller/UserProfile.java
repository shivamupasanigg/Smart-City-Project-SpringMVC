package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.Admin;
import com.jpa.UserRegister;
import com.jpa.dao.UserSignUpLoginDaoImpl;

@Controller
public class UserProfile {
	
	@Autowired
	private UserSignUpLoginDaoImpl UserProfiledao;
	
	@GetMapping("/GetUserProfile")
	public String GetUerProfilepage(@RequestParam int id,Model m)
	{
		UserRegister getuserprofile = UserProfiledao.getbyid(id);
		
		m.addAttribute("getuserprofile", getuserprofile);
		return "UserSection/UserProfile";
		
	}
	
	

	@GetMapping("/UserforgotPassword")
	public String forgotpassword(Model m,@RequestParam int id)
	{
		UserRegister getbyid = UserProfiledao.getbyid(id);
		m.addAttribute("getbyid", getbyid);
		return "UserSection/UserResetPassword";
	}
	
	@PostMapping("/UserEditProfile")
	public String UserEditProfilepage(@RequestParam("id") int id,
			@RequestParam("full_name") String fullname,
			@RequestParam("user_name") String Username,
			@RequestParam("pass_word") String password,
			@RequestParam("ConfirmPassword") String Confirmpassword,Model m)
	{
		UserProfiledao.UpdateProfile(id, fullname, Username, password, Confirmpassword);
		return "redirect:/GetUserProfile?id=" +id;
	}
}
