package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import com.jpa.AdminTemple;

@Service
@Transactional
public class AdminTempleDaoImpl {
	
	@Autowired
	private AdminTempleDao templedao;
	
	// insert
	public void insert(AdminTemple t)
	{
		templedao.save(t);
	}
	// get all data
	public List<AdminTemple> getalldata()
	{
		return templedao.findAll();
	}
    // delete
	public void delete(int id)
	{
		templedao.deleteById(id);
	}
	// get by id
	public AdminTemple getbyid(int id)
	{
		return templedao.findById(id).get();
	}
	
	// update
	public void UpdateTemple(int id,String name,String address,String phone,String amtime,String pmtime,byte[] imageone,byte[] imagetwo)
	{
		templedao.updatetemple(id, name, address, phone, amtime, pmtime, imageone, imagetwo);
	}
	
	
}
