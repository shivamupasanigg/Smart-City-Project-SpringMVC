package com.jpa.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.AdminMalls;
import com.jpa.dao.AdminMallDaoImpl;

@Controller
public class UserViewMall {
	
	@Autowired
	private AdminMallDaoImpl viewmalldao;
	
	@GetMapping("/UserViewMall")
	public String UserViewMallpage(@RequestParam int id,Model m)
	{
		AdminMalls malls = viewmalldao.get(id);
		
		m.addAttribute("malls", malls);
		m.addAttribute("MallImageone",Base64.getEncoder().encodeToString(malls.getMallimageone()));
		m.addAttribute("MallImagetwo",Base64.getEncoder().encodeToString(malls.getMallimagetwo()));
		return "UserSection/UserViewMall";
		
	}

}
