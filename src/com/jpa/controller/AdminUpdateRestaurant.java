package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.dao.AdminRestaurantDaoImpl;
import com.jpa.AdminRestaurent;

@Controller
public class AdminUpdateRestaurant {
	
	@Autowired
	private AdminRestaurantDaoImpl Update;
	
	@GetMapping("/UpdateRestaurant")
	public String UpdateRestaurant(@RequestParam int id,Model m)
	{
		AdminRestaurent updaterestro= Update.getbyid(id);
		m.addAttribute("updaterestro", updaterestro);
		return "AdminSection/UpdateRestaurant";
	}
	
	@PostMapping("/updateRestaurant")
	public String updateRestaurant(@RequestParam("id") int id,
			@RequestParam("restaurentname") String restaurentname,@RequestParam("restaurentaddress") String restaurentaddress,
			@RequestParam("restaurentdishes") String restaurentdishes,@RequestParam("restaurentcontact") String restaurentcontact,
			@RequestParam("restaurentAmTime") String restaurentAmTime,@RequestParam("restaurentPmTime") String restaurentPmTime,
			@RequestParam("restaurentimgone") MultipartFile restaurentimgone,@RequestParam("restaurentimgtwo") MultipartFile restaurentimgtwo) throws IOException 
	{
		
		Update.updaterestaurant(id, restaurentname, restaurentaddress, restaurentdishes, restaurentcontact, restaurentAmTime, restaurentPmTime, restaurentimgone.getBytes(),restaurentimgtwo.getBytes());
		return "redirect:/ListRestaurant";
	}
	 

}
