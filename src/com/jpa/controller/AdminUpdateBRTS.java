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
public class AdminUpdateBRTS {
	
	@Autowired
	private AdminBRTSDaoImpl update;
	
	@GetMapping("/UpdateBRTSStation")
	public String UpdateBRTSStation(@RequestParam int id,Model m)
	{
		
		AdminBRTS updatebrts = update.getbyid(id);
		m.addAttribute("updatebrts",updatebrts);
		return "AdminSection/UpdateBRTS";
	}
	
	@PostMapping("/updateBRTS")
	public String updateBRTS(@RequestParam("id") int id,
			                 @RequestParam("stationname") String stationname,
			                 @RequestParam("stationaddress") String stationaddress,
			                 @RequestParam("imgone") MultipartFile imgone,
			                 @RequestParam("imgtwo") MultipartFile imgtwo) throws IOException
	{
		update.updatebrts(id,stationname,stationaddress,imgone.getBytes(),imgtwo.getBytes());
		return "redirect:/ListBRTS";
	}

}
