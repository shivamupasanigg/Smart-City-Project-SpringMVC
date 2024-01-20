package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.Admin;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminDaoImpl {
	
	@Autowired
	AdminDao Admindao;
	
	// get only username
	public Admin getUserByUsername(String username) {
        return Admindao.findByUsername(username);
    }
	
	public List<Admin> getdata()
	{
		return Admindao.findAll();
	}
	
	// get id 
	
	public Admin getbyid(int id)
	{
		return Admindao.findById(id).get();
	}
	// update password
	public void updatepassword(int id , String password)
	{
		Admindao.updatePassword(id,password);
	}
	
	

}
