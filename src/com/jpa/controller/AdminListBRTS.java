package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.dao.AdminBRTSDaoImpl;
import com.jpa.AdminBRTS;
import com.jpa.AdminMostVisitedPlace;

@Controller
public class AdminListBRTS {
	
	@Autowired
	private AdminBRTSDaoImpl select;
	
	@GetMapping("/ListBRTS")
	public String ListBRTS(Model m)
	{
		List<AdminBRTS> brtslist = select.GetAllBrts();
		
		List<String> brtsimage = new ArrayList<>();
		String brtsimageone;
		for (AdminBRTS list : brtslist) {
	        if (list.getBrts_imageone() != null) {
	        	brtsimageone = Base64.getEncoder().encodeToString(list.getBrts_imageone());
	            brtsimage.add(brtsimageone);
	        }
	    }
		m.addAttribute("brtslist", brtslist);
		m.addAttribute("brtsimage", brtsimage);
		return "AdminSection/ListBRTS";
	}

}
