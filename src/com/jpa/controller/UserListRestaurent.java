package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.dao.AdminRestaurantDaoImpl;
import com.jpa.AdminRestaurent;
import com.jpa.AdminTemple;

@Controller
public class UserListRestaurent {
	
	@Autowired
	private AdminRestaurantDaoImpl restaurentselectdao;
	
	@GetMapping("/UserListRestaurent")
	public String UserListRestaurentpage(Model m)
	{
		List<AdminRestaurent> GetRestaurentList = restaurentselectdao.getalldata();
		
		List<String> UserRestaurentImage = new ArrayList<>();
		String Image;
		for (AdminRestaurent list : GetRestaurentList) {
	        if (list.getRestaurant_imgone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getRestaurant_imgone());
	            UserRestaurentImage.add(Image);
	        }
	    }
		
		
		m.addAttribute("GetRestaurentList", GetRestaurentList);
		m.addAttribute("UserRestaurentImage",UserRestaurentImage);
		return "UserSection/UserListRestaurent";
	}

}
