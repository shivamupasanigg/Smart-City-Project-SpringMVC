package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jpa.UserfeedbackForm;
import com.jpa.dao.UserFeedBackFormDaoImpl;

@Controller
public class AdminViewFeedBack {
	
	@Autowired
	private UserFeedBackFormDaoImpl select;
	
	@GetMapping("/AdminViewFeedBack")
	public String AdminViewFeedBackpage(Model m)
	{
		
		List<UserfeedbackForm> UserFeedBack = select.getalldata();
		
		m.addAttribute("UserFeedBack", UserFeedBack);
		return "AdminSection/ViewFeedBack";
	}
	
	@GetMapping("/AdminViewFeedBackAlert")
	public String AdminViewAlertpage(@RequestParam int id,Model m)
	{
		UserfeedbackForm UserFeedBack = select.getbyid(id);
		m.addAttribute("FeedBack", UserFeedBack.getFeedbackcomments());
		return "AdminShowAlerts/AdminViewFeedBackAlert";
	}

}
