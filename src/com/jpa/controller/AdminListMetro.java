package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.AdminMetro;
import com.jpa.dao.AdminMetroDaoImpl;



@Controller
public class AdminListMetro {
	
	@Autowired
	private AdminMetroDaoImpl select;

	@GetMapping("/ListMetro")
	public String ListMetro(Model m)
	{
		List<AdminMetro> ListMetro = select.getalldata();
		
		List<String> ListMetroImage = new ArrayList<>();
		String Image;
		for (AdminMetro list : ListMetro) {
	        if (list.getMetro_imageone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getMetro_imageone());
	            ListMetroImage.add(Image);
	        }
	    }
		
		m.addAttribute("ListMetroImage", ListMetroImage);
		m.addAttribute("ListMetro", ListMetro);
		return "AdminSection/ListMetro";
	}
}
