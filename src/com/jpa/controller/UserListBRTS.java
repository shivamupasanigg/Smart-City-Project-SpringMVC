package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.AdminBRTS;
import com.jpa.AdminRestaurent;
import com.jpa.dao.AdminBRTSDaoImpl;

@Controller
public class UserListBRTS {
	
	@Autowired
	private AdminBRTSDaoImpl UserBRTSSelect;
	
	@GetMapping("/UserListBRTS")
	public String UserListBRTSpage(Model m) {
		List<AdminBRTS> UserListBRTS = UserBRTSSelect.GetAllBrts();
		
		List<String> UserBRTSImage = new ArrayList<>();
		String Image;
		for (AdminBRTS list : UserListBRTS) {
	        if (list.getBrts_imageone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getBrts_imageone());
	            UserBRTSImage.add(Image);
	        }
	    }
		m.addAttribute("UserListBRTS", UserListBRTS);
		m.addAttribute("UserBRTSImage", UserBRTSImage);
		return "UserSection/UserListBRTS";
	}
	

	

}
