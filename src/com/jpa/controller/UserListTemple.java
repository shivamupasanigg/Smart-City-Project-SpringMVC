package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.AdminTemple;
import com.jpa.dao.AdminTempleDaoImpl;

@Controller
public class UserListTemple {
	
	@Autowired
	private AdminTempleDaoImpl templeselect;
	
	@GetMapping("/UserListTemple")
	public String UserListTemplepage(Model m)
	{
		List<AdminTemple> listtemple = templeselect.getalldata();
		
		List<String> UserTempleImage = new ArrayList<>();
		String Image;
		for (AdminTemple list : listtemple) {
	        if (list.getTemple_imgone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getTemple_imgone());
	            UserTempleImage.add(Image);
	        }
	    }
		
		m.addAttribute("listtemple", listtemple);
		m.addAttribute("UserTempleImage",UserTempleImage);
		return "UserSection/UserListTemple";
	}

}
