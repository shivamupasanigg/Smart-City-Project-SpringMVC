package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.dao.AdminMostVsitPlaceDaoImpl;

import com.jpa.AdminMostVisitedPlace;

@Controller
public class UserListMostVisitedPlace {
	
	@Autowired
	private AdminMostVsitPlaceDaoImpl UserMostVisitedselect;
	
	@GetMapping("/UserListMostVisitedPlace")
	public String UserListMostVisitedPlacePage(Model m)
	{
		List<AdminMostVisitedPlace> UserMostVisitedPlace = UserMostVisitedselect.getAllMostVisitedPlace();
		// for get  image
		List<String> UserMostVisitImage = new ArrayList<>();
		String Image;
		for (AdminMostVisitedPlace list : UserMostVisitedPlace) {
	        if (list.getImageone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getImageone());
	            UserMostVisitImage.add(Image);
	        }
	    }
		
		m.addAttribute("UserMostVisitImage", UserMostVisitImage);
		m.addAttribute("UserMostVisitedPlace", UserMostVisitedPlace);
		return "UserSection/UserListMostVisitedPlace";
	}

}
