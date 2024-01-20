package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.dao.AdminMallDaoImpl;

@Controller
public class AdminDeleteMalls {
	
	@Autowired
	private AdminMallDaoImpl deletemall;

	@GetMapping("/DeleteMall")
	public String deletemall(@RequestParam int id)
	{
		deletemall.delete(id);
		return "redirect:/ListMalls";
	}
}
