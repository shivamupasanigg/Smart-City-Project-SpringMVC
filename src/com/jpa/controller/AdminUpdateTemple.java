package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.AdminTemple;
import com.jpa.dao.AdminTempleDaoImpl;

@Controller
public class AdminUpdateTemple {
	
	@Autowired
	private AdminTempleDaoImpl update;
	
	
	@GetMapping("/UpdateTemple")
	public String UpdateTemple(@RequestParam int id,Model m)
	{
		AdminTemple templelist = update.getbyid(id);
		m.addAttribute("templelist", templelist);
		return "AdminSection/UpdateTemple";
	}
	
	@PostMapping("/updateTemple")
	public String updateTemple(@RequestParam("id") int id,
			@RequestParam("templename") String templename,@RequestParam("templeaddress") String templeaddress,
			@RequestParam("templecontact") String templecontact,@RequestParam("templeamtime") String templeamtime,
			@RequestParam("templepmtime") String templepmtime,@RequestParam("templeimgone") MultipartFile templeimgone,
			@RequestParam("templeimgtwo") MultipartFile templeimgtwo) throws IOException 
	{
		
		update.UpdateTemple(id, templename, templeaddress, templecontact, templeamtime, templepmtime, templeimgone.getBytes(),templeimgtwo.getBytes());
		return "redirect:/ListTemple";
	}

}
