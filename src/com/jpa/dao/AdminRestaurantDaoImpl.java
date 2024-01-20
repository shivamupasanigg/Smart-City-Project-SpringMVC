package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


import com.jpa.AdminRestaurent;

@Service
@Transactional
public class AdminRestaurantDaoImpl {
	
	@Autowired
	private AdminRestaurantDao adminrestaurantdao;
	// insert
	public void insertrestaurant(AdminRestaurent restro)
	{
		adminrestaurantdao.save(restro);
	}
	// get all data
	public List<AdminRestaurent> getalldata()
	{
		return adminrestaurantdao.findAll();
	}
	// delete
	public void delete(int id)
	{
		adminrestaurantdao.deleteById(id);
	}
	
	// get by id
	
	public AdminRestaurent getbyid(int id)
	{
		return adminrestaurantdao.findById(id).get();
	}
	
	public void updaterestaurant(int id, String restaurentname, String restaurentaddress, String restaurentdishes,
			String restaurentcontact, String restaurentAmTime, String restaurentPmTime, byte[] imgon, byte[] imgtw) {
		// TODO Auto-generated method stub
		adminrestaurantdao.updaterestaurant(id, restaurentname, restaurentaddress, restaurentdishes, restaurentcontact, restaurentAmTime, restaurentPmTime, imgon, imgtw);
	}

}
