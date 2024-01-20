package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.AdminRailway;
import com.jpa.dao.AdminRailwayDaoImpl;

@Controller
public class AdminAddRailway {
	
	@Autowired
	private AdminRailwayDaoImpl insert;
	
	@GetMapping("/AddRailway")
	public String AddRailway(Model m)
	{
		m.addAttribute("addrailway", new AdminRailway());
		return "AdminSection/AddRailway";
	}

	@PostMapping("/insertRailway")
	public String insertrailway(@RequestParam("railway_station_name") String station_name,
			                   @RequestParam("railway_station_address") String station_address,
			                   @RequestParam("railway_img_one") MultipartFile station_imgone,
			                   @RequestParam("railway_img_two") MultipartFile station_imgtwo) throws IOException
	{
		AdminRailway insertrailway = new AdminRailway();
		insertrailway.setRailway_Station_name(station_name);
		insertrailway.setRailway_Station_address(station_address);
		insertrailway.setRailway_imageone(station_imgone.getBytes());
		insertrailway.setRailway_imagetwo(station_imgtwo.getBytes());
		insert.insertRailway(insertrailway);
		return "AdminShowAlerts/InsertRailway";
	}
}
