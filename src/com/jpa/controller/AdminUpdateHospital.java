package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.dao.AdminHospitalDaoImpl;
import com.jpa.AdminHospital;

@Controller
public class AdminUpdateHospital {
	
	@Autowired
	private AdminHospitalDaoImpl update;
	@GetMapping("/UpdateHospital")
	public String UpdateHospital(@RequestParam int id,Model m)
	{
		AdminHospital listhospital = update.getbyid(id);
		m.addAttribute("listhospital", listhospital);
		return "AdminSection/UpdateHospital";
	}
	
	@PostMapping("/updateHospital")
	public String updatehospital(@RequestParam("id") int id,
			  @RequestParam("hospitalname") String hospitalname,@RequestParam("hospitaladdress") String hospitaladdress,
			  @RequestParam("hospitalfacility") String hospitalfacility,@RequestParam("hospitalcontact") String hospitalcontact,
			  @RequestParam("hospitaltime") String hospitaltime,@RequestParam("hospitalimgone") MultipartFile hospitalimgone,
			  @RequestParam("hospitalimgtwo") MultipartFile hospitalimgtwo,Model m) throws IOException 
	{
		update.UpdateHospital(id, hospitalname, hospitaladdress, hospitalfacility, hospitalcontact, hospitaltime, hospitalimgone.getBytes(), hospitalimgtwo.getBytes());
		return "redirect:/ListHospital";
	}
}
