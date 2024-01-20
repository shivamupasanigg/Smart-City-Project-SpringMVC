package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.AdminMalls;
import com.jpa.dao.AdminMallDaoImpl;

@Controller
public class AdminAddMalls {
	
	@Autowired
	private AdminMallDaoImpl insert;
	
	@GetMapping("/AddMalls")
	public String getdesign(Model m)
	{
		AdminMalls mall= new AdminMalls();
		m.addAttribute("mall", mall);
		return "AdminSection/AddMalls";
	}
	
	@PostMapping("/insertMalls")
	public String insert(@RequestParam("mallname") String name,
						@RequestParam("malladdress") String address,
						@RequestParam("mallcontact") String mallcontact,
						@RequestParam("mallamTime") String amtime,
						@RequestParam("mallpmTime") String pmtime,
						@RequestParam("mallimg1") MultipartFile mallimgone,
						@RequestParam("mallimg2") MultipartFile mallimgtwo,Model m) throws IOException
	{
		
		AdminMalls insertmall = new AdminMalls();
		insertmall.setMall_name(name);
		insertmall.setMall_address(address);
		insertmall.setMall_phone(mallcontact);
		insertmall.setMall_amtiming(amtime);
		insertmall.setMall_pmtiming(pmtime);
		insertmall.setMallimageone(mallimgone.getBytes());
		insertmall.setMallimagetwo(mallimgtwo.getBytes());
		
		insert.insert(insertmall);
		return "AdminShowAlerts/InsertMalls";
	}

}
