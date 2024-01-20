package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.AdminMetro;
import com.jpa.dao.AdminMetroDaoImpl;
@Controller
public class AdminAddMetro {
	
	@Autowired
	private AdminMetroDaoImpl insert;
	
	@GetMapping("/AddMetro")
	public String AddMetro(Model m)
	{
		m.addAttribute("AdminMetro",new AdminMetro());
		return "AdminSection/AddMetro";
	}
	
	@PostMapping("/insertMetro")
	public String insertMetro(@RequestParam("metroname") String metroname,
			                  @RequestParam("metroaddress") String metroaddress,
			                  @RequestParam("imgone") MultipartFile imgone,
			                  @RequestParam("imgtwo") MultipartFile imgtwo,Model m) throws IOException
	{
		AdminMetro metro = new AdminMetro();
		metro.setMetro_Station_name(metroname);
		metro.setMetro_Station_address(metroaddress);
		metro.setMetro_imageone(imgone.getBytes());
		metro.setMetro_imagetwo(imgtwo.getBytes());
		insert.insert(metro);
		return "AdminShowAlerts/InsertMetro";
	}
	
	
	

}
