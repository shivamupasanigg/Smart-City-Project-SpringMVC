package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.AdminBRTS;
import com.jpa.dao.AdminBRTSDaoImpl;

@Controller
public class AdminAddBRTS {
	
	@Autowired
	private AdminBRTSDaoImpl insertbrts;
	
	@GetMapping("/AddBRTS")
	public String AddBRTS(Model m)
	{
		m.addAttribute("addbrts",new AdminAddBRTS());
		return "AdminSection/AddBRTS";
	}
	
	@PostMapping("/insertBRTS")
	public String insertbrts(@RequestParam("stationname") String Station_name,
							@RequestParam("stationaddress") String Station_address,
							@RequestParam("img1") MultipartFile image1,
							@RequestParam("img2") MultipartFile image2,Model m) throws IOException
	{
		AdminBRTS insert = new AdminBRTS();
		insert.setBrts_Station_name(Station_name);
		insert.setBrts_Station_address(Station_address);
		insert.setBrts_imageone(image1.getBytes());
		insert.setBrts_imagetwo(image2.getBytes());
		insertbrts.InsertBrts(insert);
		return "AdminShowAlerts/InsertBRTS";
	}
	

}
