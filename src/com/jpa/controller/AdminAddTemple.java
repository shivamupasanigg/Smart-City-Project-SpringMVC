package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.AdminTemple;
import com.jpa.dao.AdminTempleDaoImpl;
@Controller
public class AdminAddTemple {
	
	@Autowired
	private AdminTempleDaoImpl insertTemple;
	
	@GetMapping("/AddTemple")
	public String AddTemple(Model m)
	{
		m.addAttribute("AddTemple", new AdminTemple());
		return "AdminSection/AddTemple";
	}
	
	@PostMapping("/insertTemple")
	public String insertTemple(@RequestParam("templename") String templename,
			@RequestParam("templeaddress") String templeaddress,@RequestParam("templecontact") String templecontact,
			@RequestParam("templeamtime") String templeamtime,@RequestParam("templepmtime") String templepmtime,
			@RequestParam("templeimgone") MultipartFile templeimgone,@RequestParam("templeimgtwo") MultipartFile templeimgtwo) throws IOException
	{
		AdminTemple inserttemple = new AdminTemple();
		inserttemple.setTemple_name(templename);
		inserttemple.setTemple_address(templeaddress);
		inserttemple.setTemple_phone(templecontact);
		inserttemple.setTemple_amtime(templeamtime);
		inserttemple.setTemple_pmtime(templepmtime);
		inserttemple.setTemple_imgone(templeimgone.getBytes());
		inserttemple.setTemple_imgtwo(templeimgtwo.getBytes());
		insertTemple.insert(inserttemple);
		return "AdminShowAlerts/InsertTemple";
	}

}
