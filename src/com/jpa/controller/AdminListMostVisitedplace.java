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
public class AdminListMostVisitedplace {
	
	@Autowired
	private AdminMostVsitPlaceDaoImpl MostVisitPlace;
	
	
	@GetMapping("/ListMostVisitedPlace")
	public String ListMostVisitedPlace(Model model)
	{
		List<AdminMostVisitedPlace> MostVisitList = MostVisitPlace.getAllMostVisitedPlace();
		
		List<String> MostVisitImage = new ArrayList<>();
		String Image;
		for (AdminMostVisitedPlace list : MostVisitList) {
	        if (list.getImageone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getImageone());
	            MostVisitImage.add(Image);
	        }
	    }
		model.addAttribute("MostVisitList",MostVisitList);
	    model.addAttribute("MostVisitImage", MostVisitImage);
		return "AdminSection/ListMostVisitedPlace";
	}
	
}
