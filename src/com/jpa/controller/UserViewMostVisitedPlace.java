package com.jpa.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.AdminMostVisitedPlace;
import com.jpa.dao.AdminMostVsitPlaceDaoImpl;

@Controller
public class UserViewMostVisitedPlace {
	
	@Autowired
	private AdminMostVsitPlaceDaoImpl ViewData;
	
	@GetMapping("/UserViewMostVisitedPlace")
	public String UserViewMostVisitedPlacePage(@RequestParam int id,Model m)
	{
		AdminMostVisitedPlace ViewMostVisit = ViewData.get(id);
		m.addAttribute("ViewMostVisit", ViewMostVisit);
		m.addAttribute("PlaceImageone", Base64.getEncoder().encodeToString(ViewMostVisit.getImageone()));
		m.addAttribute("PlaceImagetwo", Base64.getEncoder().encodeToString(ViewMostVisit.getImagetwo()));
		return "UserSection/UserViewMostVisitedPlace";
	}

}
