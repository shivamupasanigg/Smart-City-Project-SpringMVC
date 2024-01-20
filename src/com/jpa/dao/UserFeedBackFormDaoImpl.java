package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jpa.UserfeedbackForm;

public class UserFeedBackFormDaoImpl {
	
	@Autowired
	private  UserFeedBackFormDao userfeedbackformdao; 
	
	//insert
	public void insert(UserfeedbackForm f)
	{
		userfeedbackformdao.save(f);
	}

	// select 
	public List<UserfeedbackForm> getalldata()
	{
		return userfeedbackformdao.findAll();
	}
	
	// select by id
	
	public UserfeedbackForm getbyid(int id)
	{
		return userfeedbackformdao.findById(id).get();
	}
	
	
	
}
