package com.jpa.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.AdminHospital;
import com.jpa.dao.AdminHospitalDaoImpl;

@Controller
public class UserViewHospital {
	
	@Autowired
	private AdminHospitalDaoImpl ViewHospitaldao;
	
	@GetMapping("/ViewHospital")
	public String ViewHospital(@RequestParam int id,Model m)
	{
		
		AdminHospital ViewHospital = ViewHospitaldao.getbyid(id);
		m.addAttribute("ViewHospital", ViewHospital);
		m.addAttribute("HospitalImageone", Base64.getEncoder().encodeToString(ViewHospital.getHospital_imgone()));
		m.addAttribute("HospitalImagetwo", Base64.getEncoder().encodeToString(ViewHospital.getHospital_imgtwo()));
		
		return "UserSection/UserViewHospital";
		
	}

}
