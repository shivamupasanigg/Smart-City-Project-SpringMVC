package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.dao.AdminBRTSDaoImpl;

@Controller
public class AdminDeleteBRTS {
	
	@Autowired
	private AdminBRTSDaoImpl deleteBRTS;
	
	@GetMapping("/deleteBRTS")
	public String deletebrts(@RequestParam int id,Model m)
	{
		deleteBRTS.delete(id);
		return "redirect:/ListBRTS";
	}

}
