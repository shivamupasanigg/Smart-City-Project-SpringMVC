package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.dao.AdminMostVsitPlaceDaoImpl;

@Controller
public class AdminDeleteMostVisitedPlace {
	
	@Autowired
	private AdminMostVsitPlaceDaoImpl delete;
	
	@GetMapping("/DeleteMostVisit")
	public String delete(@RequestParam int id) {
		delete.Delete(id);
		return "redirect:/ListMostVisitedPlace";    
	}

}
