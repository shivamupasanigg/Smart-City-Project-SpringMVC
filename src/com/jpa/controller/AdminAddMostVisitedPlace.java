package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.AdminMostVisitedPlace;
import com.jpa.dao.AdminMostVsitPlaceDaoImpl;


@Controller
public class AdminAddMostVisitedPlace {
	
	@Autowired
	private AdminMostVsitPlaceDaoImpl MostVisitPlace;

	// get the design of most visited place 
	@GetMapping("/AddMostVisitedPlace")
	public String MostVisitedPlace(Model m)
	{
		AdminMostVisitedPlace admp = new AdminMostVisitedPlace();
	    m.addAttribute("AddMostVisitedPlace",admp);
		return "AdminSection/AddMostVisitedPlace";
	}
	// insertion operation
	@PostMapping("/save")
	public String InsertMostVisitPlace(@RequestParam("placename") String name,
			@RequestParam("placeaddress") String address,@RequestParam("placecontact") String phone,
			@RequestParam("amTime") String amtime,@RequestParam("pmTime") String pmtime,@RequestParam("img1") MultipartFile fileone,
			@RequestParam("img2") MultipartFile filetwo)throws IOException 
	{
		AdminMostVisitedPlace add = new AdminMostVisitedPlace();
		add.setPlace_name(name);
		add.setPlace_address(address);
		add.setPlace_phone(phone);
		add.setPlace_amtiming(amtime);
		add.setPlace_pmtiming(pmtime);
		add.setImageone(fileone.getBytes());
		add.setImagetwo(filetwo.getBytes());
		
		MostVisitPlace.save(add);
		return "AdminShowAlerts/InsertMostVisitedPlace";
	}
		
}
