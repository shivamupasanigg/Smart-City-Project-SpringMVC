package com.jpa.controller;

import java.io.IOException;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.dao.AdminMallDaoImpl;
import com.jpa.AdminMalls;

@Controller
public class AdminUpdateMalls {
	
	@Autowired
	private AdminMallDaoImpl updatemall;
	
	@GetMapping("/UpdateMalls")
	public String updatemall(@RequestParam int id,Model m)
	{
		AdminMalls updatemalls = updatemall.get(id);
		m.addAttribute("updatemalls", updatemalls);
		return "AdminSection/UpdateMalls";
	}
	
	@PostMapping("/updatemall")
	public String update(@RequestParam("id")int id,
						@RequestParam("mallname") String Mallsname,
						@RequestParam("malladdress") String malladdress,
						@RequestParam("mallcontact") String mallphone,
						@RequestParam("mallamTime") String mallamtime,
						@RequestParam("mallpmTime") String mallpmtime,
						@RequestParam("mallimg1") MultipartFile mallimageone,
						@RequestParam("mallimg2") MultipartFile mallimagetwo) throws IOException{
		
		updatemall.updatemalls(id, Mallsname, malladdress, mallphone, mallamtime, mallpmtime,mallimageone.getBytes(),mallimagetwo.getBytes());
	     return "redirect:/ListMalls";
		
	}

}
