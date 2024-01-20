package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import com.jpa.AdminHospital;
import com.jpa.dao.AdminHospitalDao;

@Service
@Transactional
public class AdminHospitalDaoImpl {
	
	@Autowired
	private AdminHospitalDao adminhospitaldao;
	// insert
	public void inserthospital(AdminHospital h)
	{
		adminhospitaldao.save(h);
	}
	// select
	public List<AdminHospital> getalldata()
	{
		return adminhospitaldao.findAll();
	}
	
	// get by id
	public AdminHospital getbyid(int id)
	{
		return adminhospitaldao.findById(id).get();
	}
	
	// delete
	public void deletehospital(int id)
	{
		adminhospitaldao.deleteById(id);
	}
	
	// update
	public void UpdateHospital(int id,String name,String address,String facility,String phone,String time,byte[] imgone,byte[] imgtwo)
	{
		adminhospitaldao.updatehospital(id, name, address, facility, phone, time, imgone, imgtwo);
	}
}
