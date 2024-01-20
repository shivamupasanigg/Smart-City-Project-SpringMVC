package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.dao.AdminDaoImpl;
import com.jpa.Admin;

@Controller
public class AdminProfile {
	
	@Autowired
	private AdminDaoImpl admin;
	
	@GetMapping("/AdminProfile")
	public String getData(Model m,@RequestParam int id)
	{
		Admin getadmindata = admin.getbyid(id);
		m.addAttribute("getadmindata", getadmindata);
		return "AdminSection/AdminProfile";
	}
	
	@GetMapping("/AdminforgotPassword")
	public String forgotpassword(Model m,@RequestParam int id)
	{
		Admin getbyid = admin.getbyid(id);
		m.addAttribute("getbyid", getbyid);
		return "AdminSection/AdminProfileResetPassword";
	}
	
	@PostMapping("/adminprofileupdatepassword")
	public String updatepassword(@RequestParam("adminId") int adminId,@RequestParam("newPassword") String newPassword)
	{
		admin.updatepassword(adminId,newPassword);
		return "redirect:/AdminProfile?id=" + adminId;
	}

}
