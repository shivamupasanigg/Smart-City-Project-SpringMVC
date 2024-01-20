package com.jpa.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.AdminMetro;
import com.jpa.dao.AdminMetroDaoImpl;

@Controller
public class UserViewMetro {
	
	@Autowired
	private AdminMetroDaoImpl UserViewMetrodao;
	
	@GetMapping("/UserViewMetro")
	public String UserViewMetropage(@RequestParam int id,Model m)
	{
		AdminMetro ViewMetro = UserViewMetrodao.getbyid(id);
		
		m.addAttribute("ViewMetro", ViewMetro);
		m.addAttribute("MetroImageone",Base64.getEncoder().encodeToString(ViewMetro.getMetro_imageone()));
		m.addAttribute("MetroImagetwo",Base64.getEncoder().encodeToString(ViewMetro.getMetro_imagetwo()));
		return "UserSection/UserViewMetro";
	}

}
