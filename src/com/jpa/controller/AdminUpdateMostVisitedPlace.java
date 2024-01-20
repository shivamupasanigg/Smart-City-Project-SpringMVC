package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.dao.AdminMostVsitPlaceDaoImpl;
import com.jpa.AdminMostVisitedPlace;

@Controller
public class AdminUpdateMostVisitedPlace {
	
	@Autowired
	private AdminMostVsitPlaceDaoImpl update;
	
	@GetMapping("/UpdateMostVisitedPlace")
	public String UpdateMostVisitedPlace(@RequestParam int id,Model m)
	{
		AdminMostVisitedPlace MostVisitedPlaceData = update.get(id);
		m.addAttribute("MostVisitedPlaceData", MostVisitedPlaceData);
		return "AdminSection/UpdateMostVisitedPlace";
	}
	
	@PostMapping("/update")
	public String update(@RequestParam("id") int id,@RequestParam("placename") String name,
			             @RequestParam("placeaddress") String address,@RequestParam("placecontact") String phone,
			             @RequestParam("amTime") String amTime,@RequestParam("pmTime") String pmTime,
			             @RequestParam("img1") MultipartFile imageone,@RequestParam("img2") MultipartFile imagetwo) throws IOException
	{
		update.updateplace(id, name, address, phone, amTime, pmTime, imageone.getBytes(), imagetwo.getBytes());
		return "redirect:/ListMostVisitedPlace"; 
	}

}
