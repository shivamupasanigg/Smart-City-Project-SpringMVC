package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jpa.UserfeedbackForm;
import com.jpa.dao.UserFeedBackFormDaoImpl;

import jakarta.validation.Valid;

@Controller
public class UserFeedBackForm {
	
	@Autowired
	private UserFeedBackFormDaoImpl insertf;
	
	@GetMapping("/UserFeedBackForm")
	public String UserFeedBackFormpage(Model m)
	{
	  m.addAttribute("userfeedback", new UserfeedbackForm());
	  return "UserSection/UserFeedBackForm";
	}
	
	@PostMapping("/UserInsertFeedback")
	public String UserInsertFeedbackpage(@Valid @ModelAttribute("userfeedback") UserfeedbackForm uf,BindingResult br,Model m)
	{
		if(br.hasErrors())
		{
			return "UserSection/UserFeedBackForm";
		}
		uf.setFeedbackfullname(uf.getFeedbackfullname());
		uf.setFeedbackcomments(uf.getFeedbackcomments());
		insertf.insert(uf);
		return "UserShowAlerts/InsertFeedBack";
		
	}
	
	
	
	

}
