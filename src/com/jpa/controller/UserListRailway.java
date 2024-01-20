package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.AdminRailway;
import com.jpa.dao.AdminRailwayDaoImpl;

@Controller
public class UserListRailway {
	
	@Autowired
	private AdminRailwayDaoImpl ListRailwaydao;
	
	@GetMapping("/UserListRailway")
	public String UserListRailwaypage(Model m)
	{
		List<AdminRailway> UserListRailway = ListRailwaydao.getalldata();
		
		List<String> UserRailwayImage = new ArrayList<>();
		String Image;
		for (AdminRailway list : UserListRailway) {
	        if (list.getRailway_imageone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getRailway_imageone());
	            UserRailwayImage.add(Image);
	        }
	    }
		
		m.addAttribute("UserListRailway", UserListRailway);
		m.addAttribute("UserRailwayImage",UserRailwayImage);
		return "UserSection/UserListRailway";
		
	}

}
