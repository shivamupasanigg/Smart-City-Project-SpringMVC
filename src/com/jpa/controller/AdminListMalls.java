package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.AdminMalls;
import com.jpa.AdminMostVisitedPlace;
import com.jpa.dao.AdminMallDaoImpl;

@Controller
public class AdminListMalls {
	
	@Autowired
	private AdminMallDaoImpl mallselect;
	
	@GetMapping("/ListMalls")
	public String ListMalls(Model m)
	{
		List<AdminMalls> ListMalls = mallselect.getallmalldata();
		
		List<String> MallsImage = new ArrayList<>();
		String Image;
		for (AdminMalls list : ListMalls) {
	        if (list.getMallimageone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getMallimageone());
	            MallsImage.add(Image);
	        }
	    }
		
		m.addAttribute("ListMalls",ListMalls);
		m.addAttribute("MallsImage", MallsImage);
		return "AdminSection/ListMalls";
	}

}
