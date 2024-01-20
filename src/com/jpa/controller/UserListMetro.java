package com.jpa.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jpa.dao.AdminMetroDaoImpl;
import com.jpa.AdminMetro;
import com.jpa.AdminTemple;

@Controller
public class UserListMetro {

	@Autowired
	private AdminMetroDaoImpl ListMetroDao;
	
	@GetMapping("/UserListMetro")
	public String UserListMetropage(Model m)
	{
		List<AdminMetro> Listmetro = ListMetroDao.getalldata();
		
		List<String> UserMetroImage = new ArrayList<>();
		String Image;
		for (AdminMetro list : Listmetro) {
	        if (list.getMetro_imageone() != null) {
	            Image = Base64.getEncoder().encodeToString(list.getMetro_imageone());
	            UserMetroImage.add(Image);
	        }
	    }
		m.addAttribute("Listmetro",Listmetro);
		m.addAttribute("UserMetroImage",UserMetroImage);
		return "UserSection/UserListMetro";
		
		
	}
}
