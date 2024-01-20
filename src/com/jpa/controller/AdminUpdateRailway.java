package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.dao.AdminRailwayDaoImpl;
import com.jpa.AdminRailway;

@Controller
public class AdminUpdateRailway {
	
	@Autowired
	private AdminRailwayDaoImpl update;
	
	@GetMapping("/UpdateRailway")
	public String updaterailway(@RequestParam int id,Model m)
	{
		AdminRailway updaterailwaylist = update.getbyid(id);
		m.addAttribute("updaterailwaylist",updaterailwaylist);
		return "AdminSection/UpdateRailway";
	}
	
	@PostMapping("/updateRailway")
	public String updateRailway(@RequestParam("id") int id,
			                    @RequestParam("railway_name") String name,
			                    @RequestParam("railway_address") String address,
			                    @RequestParam("railway_one") MultipartFile imageone,
			                    @RequestParam("railway_two") MultipartFile imagetwo) throws IOException
	{
		update.UpdateRailway(id, name, address, imageone.getBytes(),imagetwo.getBytes());
		return "redirect:/ListRailway";
	}

}
