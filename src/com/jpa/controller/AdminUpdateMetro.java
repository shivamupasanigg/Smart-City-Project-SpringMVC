package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.dao.AdminMetroDaoImpl;
import com.jpa.AdminMetro;

@Controller
public class AdminUpdateMetro {

      
	@Autowired
	private AdminMetroDaoImpl update;
	
	@GetMapping("/UpdateMetro")
	public String UpdateMetro(@RequestParam int id,Model m)
	{
		AdminMetro updatemetro = update.getbyid(id);
		m.addAttribute("updatemetro", updatemetro);
		return "AdminSection/UpdateMetro";
	}
	
	@PostMapping("/updatemetro")
	public String UpdateMetro(@RequestParam("id") int id,
							  @RequestParam("stationname") String Stationname,
							  @RequestParam("stationaddress") String Stationaddress,
							  @RequestParam("metro_img_one") MultipartFile imageone,
							  @RequestParam("metro_img_two") MultipartFile imagetwo) throws IOException
	{
		update.Update(id, Stationname, Stationname,imageone.getBytes(), imagetwo.getBytes());
		return "redirect:/ListMetro";
	}	
}
