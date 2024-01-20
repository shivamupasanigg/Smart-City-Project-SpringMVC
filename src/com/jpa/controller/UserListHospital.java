package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.AdminHospital;
import com.jpa.AdminMostVisitedPlace;
import com.jpa.dao.AdminHospitalDaoImpl;

@Controller
public class UserListHospital {
	
	@Autowired
	private AdminHospitalDaoImpl Hospitalselect;
	
	@GetMapping("/UserListHospital")
	public String UserListHospitalpage(Model m)
	{
		List<AdminHospital> getHospitals = Hospitalselect.getalldata();
		
		List<String> UserHsopitalImage = new ArrayList<>();
		String Image;
		for (AdminHospital list : getHospitals) {
	        if (list.getHospital_imgone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getHospital_imgone());
	            UserHsopitalImage.add(Image);
	        }
	    }
		
		m.addAttribute("getHospitals",getHospitals);
		m.addAttribute("UserHsopitalImage",UserHsopitalImage);
		return "UserSection/UserListHospital";
	}

}
