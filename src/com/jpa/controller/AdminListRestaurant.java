package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.AdminMostVisitedPlace;
import com.jpa.AdminRestaurent;
import com.jpa.dao.AdminRestaurantDaoImpl;

@Controller
public class AdminListRestaurant {
	
	@Autowired
	private AdminRestaurantDaoImpl select;
	
	@GetMapping("/ListRestaurant")
	public String ListRestaurant(Model m)
	{
		List<AdminRestaurent> listrestaurant = select.getalldata();
		
		List<String> restaurantImage = new ArrayList<>();
		String Image;
		for (AdminRestaurent list : listrestaurant) {
	        if (list.getRestaurant_imgone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getRestaurant_imgone());
	            restaurantImage.add(Image);
	        }
	    }
		m.addAttribute("restaurantImage", restaurantImage);
		m.addAttribute("listrestaurant", listrestaurant);
		return "AdminSection/ListRestaurant";
	}

}
