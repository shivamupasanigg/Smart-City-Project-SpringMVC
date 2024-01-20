package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.AdminMalls;
import com.jpa.dao.AdminMallDaoImpl;

@Controller
public class UserListMall {
	
	@Autowired
	private AdminMallDaoImpl select;
	
	@GetMapping("/UserListMall")
	public String UserListMallpage(Model m)
	{
		List<AdminMalls> getMalls = select.getallmalldata();
		
		List<String> UserMallImage = new ArrayList<>();
		String Image;
		for (AdminMalls list : getMalls) {
	        if (list.getMallimageone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getMallimageone());
	            UserMallImage.add(Image);
	        }
	    }
		m.addAttribute("getMalls", getMalls);
		m.addAttribute("UserMallImage",UserMallImage);
		return "UserSection/UserListMall";
		
	}

}
