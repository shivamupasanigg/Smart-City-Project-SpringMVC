package com.jpa.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.AdminTemple;
import com.jpa.dao.AdminTempleDaoImpl;

@Controller
public class UserViewTemple {
	
	@Autowired
	private AdminTempleDaoImpl ViewTempledao;
	
	@GetMapping("/UserViewTemple")
	public String UserViewTemplepage(@RequestParam int id,Model m)
	{
		AdminTemple ViewTemple = ViewTempledao.getbyid(id);
		
		m.addAttribute("ViewTemple", ViewTemple);
		m.addAttribute("TempleImageOne",Base64.getEncoder().encodeToString(ViewTemple.getTemple_imgone()));
		m.addAttribute("TempleImageTwo", Base64.getEncoder().encodeToString(ViewTemple.getTemple_imgtwo()));
		return "UserSection/UserViewTemple";
	}

}
