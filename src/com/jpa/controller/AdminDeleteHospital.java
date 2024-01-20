package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.dao.AdminHospitalDaoImpl;

@Controller
public class AdminDeleteHospital {
	
	@Autowired
	private AdminHospitalDaoImpl delete;
	
	@GetMapping("/DeleteHospital")
	public String DeleteHospital(@RequestParam int id)
	{
		delete.deletehospital(id);
		return "redirect:/ListHospital";
	}

}
