package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.AdminRestaurent;
import com.jpa.dao.AdminRestaurantDaoImpl;

@Controller
public class AdminAddRestaurant {
	
	@Autowired
	private AdminRestaurantDaoImpl insert;
	
	@GetMapping("/AddRestaurant")
	public String AddRestaurant(Model m)
	{
		m.addAttribute("addrestaurant", new AdminRestaurent());
		return "AdminSection/AddRestaurant";
	}
	
	@PostMapping("/InsertRestaurant")
	public String InsertRestaurant(@RequestParam("restaurentname") String name,
			                       @RequestParam("restaurentaddress") String address,
			                       @RequestParam("restaurentdishes") String dishes,
			                       @RequestParam("restaurentcontact") String phone,
			                       @RequestParam("restaurentAmTime") String amtime,
			                       @RequestParam("restaurentPmTime") String pmtime,
			                       @RequestParam("restaurentimgone") MultipartFile imgone,
			                       @RequestParam("restaurentimgtwo") MultipartFile imgtwo) throws IOException
	{
		AdminRestaurent insertRestaurent = new AdminRestaurent();
		insertRestaurent.setRestaurant_name(name);
		insertRestaurent.setRestaurant_address(address);
		insertRestaurent.setRestaurant_dishes(dishes);
		insertRestaurent.setRestaurant_phone(phone);
		insertRestaurent.setRestaurant_amtime(amtime);
		insertRestaurent.setRestaurant_pmtime(pmtime);
		insertRestaurent.setRestaurant_imgone(imgone.getBytes());
		insertRestaurent.setRestaurant_imgtwo(imgtwo.getBytes());
		insert.insertrestaurant(insertRestaurent);
		return "AdminShowAlerts/InsertRestaurant";
	}
 
}
