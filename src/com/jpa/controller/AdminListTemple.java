package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.jpa.AdminTemple;
import com.jpa.dao.AdminTempleDaoImpl;
@Controller
public class AdminListTemple {
	
	@Autowired
	private AdminTempleDaoImpl select;
	
	@GetMapping("/ListTemple")
	public String listtemple(Model m)
	{
		
		List<AdminTemple> templelist = select.getalldata();
		
		List<String> templeimage = new ArrayList<>();
		String brtsimageone;
		for (AdminTemple list : templelist) {
	        if (list.getTemple_imgone() != null) {
	        	brtsimageone = Base64.getEncoder().encodeToString(list.getTemple_imgone());
	        	templeimage.add(brtsimageone);
	        }
	    }
		
		m.addAttribute("templeimage",templeimage);
		m.addAttribute("templelist", templelist);
		return "AdminSection/ListTemple";
		
	}

}
