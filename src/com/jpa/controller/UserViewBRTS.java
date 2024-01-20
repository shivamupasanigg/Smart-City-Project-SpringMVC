package com.jpa.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.AdminBRTS;
import com.jpa.dao.AdminBRTSDaoImpl;

@Controller
public class UserViewBRTS {
	
	@Autowired
	private AdminBRTSDaoImpl ViewBRTS;
	
	@GetMapping("/UserViewBRTS")
	public String UserViewBRTSpage(@RequestParam int id,Model m)
	{
		AdminBRTS viewBrts = ViewBRTS.getbyid(id);
		m.addAttribute("viewBrts", viewBrts);
		m.addAttribute("BRTSImageone", Base64.getEncoder().encodeToString(viewBrts.getBrts_imageone()));
		m.addAttribute("BRTSImagetwo", Base64.getEncoder().encodeToString(viewBrts.getBrts_imagetwo()));
		return "UserSection/UserViewBRTS";
	}
	

}
