package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import com.jpa.Admin;
import com.jpa.UserRegister;

@Service
@Transactional
public class UserSignUpLoginDaoImpl {

	@Autowired
	private UserSignUpLoginDao usersignuplogindao;

	// insert
	public void insert(UserRegister r) {
		usersignuplogindao.save(r);
	}
	
	// select
	public List<UserRegister> getalldata()
	{
		return usersignuplogindao.findAll();
	}
	
	// get All Data By Id
	public UserRegister getbyid(int id)
	{
		return usersignuplogindao.findById(id).get();
	}
	
	// update profile
	public void UpdateProfile(int id,String fullname,String username,String password,String confirmpassword)
	{
		usersignuplogindao.updateProfile(id, fullname, username, confirmpassword, password);
	}
	
	// login section dao code 
	// select only username for login
	
		public UserRegister loginUser(String username) {
			return usersignuplogindao.findByUsername(username);
		}
}
