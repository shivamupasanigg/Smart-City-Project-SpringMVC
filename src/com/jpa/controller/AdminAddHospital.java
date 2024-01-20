package com.jpa.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jpa.AdminHospital;
import com.jpa.dao.AdminHospitalDaoImpl;


@Controller
public class AdminAddHospital {
	
	@Autowired
	private AdminHospitalDaoImpl insert;
	
	@GetMapping("AddHospital")
	public String AddHospital(Model m)
	{
		m.addAttribute("AdminHospital",new AdminHospital());
		return "AdminSection/AddHospital";
	}

	@PostMapping("/insertHospital")
	public String insertHospital(@RequestParam("hospitalname") String hospitalname,
			 @RequestParam("hospitaladdress") String hospitaladdress,@RequestParam("hospitalfacility") String hospitalfacility,
			 @RequestParam("hospitalcontact") String hospitalcontact,@RequestParam("hospitaltime") String hospitaltime,
			 @RequestParam("hospitalimgone") MultipartFile hospitalimgone,@RequestParam("hospitalimgtwo") MultipartFile hospitalimgtwo) throws IOException
	{
		AdminHospital inserthospital = new AdminHospital();
		inserthospital.setHospital_name(hospitalname);
		inserthospital.setHospital_address(hospitaladdress);
		inserthospital.setHospital_facility(hospitalfacility);
		inserthospital.setHospital_phone(hospitalcontact);
		inserthospital.setHospital_time(hospitaltime);
		inserthospital.setHospital_imgone(hospitalimgone.getBytes());
		inserthospital.setHospital_imgtwo(hospitalimgtwo.getBytes());
		insert.inserthospital(inserthospital);
		return "AdminShowAlerts/InsertHospital";
	}
	
}
