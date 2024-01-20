package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.AdminMetro;
import com.jpa.AdminRailway;
import com.jpa.dao.AdminRailwayDaoImpl;

@Controller
public class AdminListRailway {
	
	@Autowired
	private AdminRailwayDaoImpl select;

	@GetMapping("/ListRailway")
	public String ListRailway(Model m)
	{
		List<AdminRailway> Railwaylist = select.getalldata();
		
		
		List<String> ListRailwayImage = new ArrayList<>();
		String Image;
		for (AdminRailway list : Railwaylist) {
	        if (list.getRailway_imageone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getRailway_imageone());
	            ListRailwayImage.add(Image);
	        }
	    }
		
		m.addAttribute("ListRailwayImage",ListRailwayImage);
		m.addAttribute("Railwaylist", Railwaylist);
		return "AdminSection/ListRailway";
	}
}
