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
public class AdminListHospital {
	
	@Autowired
	private AdminHospitalDaoImpl select;
	
	@GetMapping("/ListHospital")
	public String ListHospital(Model m)
	{
		List<AdminHospital> listhospital = select.getalldata();
		
		List<String> HospitalImage = new ArrayList<>();
		String Image;
		for (AdminHospital list : listhospital) {
	        if (list.getHospital_imgone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getHospital_imgone());
	            HospitalImage.add(Image);
	        }
	    }
		
		m.addAttribute("listhospital", listhospital);
		m.addAttribute("HospitalImage",HospitalImage);
		return "AdminSection/ListHospital";
	}

}
