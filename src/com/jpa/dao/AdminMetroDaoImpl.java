package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import com.jpa.AdminMetro;

@Service
@Transactional
public class AdminMetroDaoImpl {

	@Autowired
	private AdminMetroDao adminmetrodao;
	// insert
	public void insert(AdminMetro m)
	{
		adminmetrodao.save(m);
	}
	// get all data
	public List<AdminMetro> getalldata()
	{
		return adminmetrodao.findAll();
	}
	
	// delete
	public void delete(int id)
	{
		adminmetrodao.deleteById(id);
	}
	// get data by id
	public AdminMetro getbyid(int id)
	{
		return adminmetrodao.findById(id).get();
	}
	// update 
	public void Update(int id,String metro_station_name,String metro_station_address,byte[] metro_img_one,byte[] metro_img_two)
	{
		adminmetrodao.updatemetro(id, metro_station_name, metro_station_address, metro_img_one, metro_img_two);
	}
	
}
