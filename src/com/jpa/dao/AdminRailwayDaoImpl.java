package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import com.jpa.AdminRailway;
import com.jpa.dao.AdminRailwayDao;


@Service
@Transactional
public class AdminRailwayDaoImpl {
	
	@Autowired
	private AdminRailwayDao adminrailwaydao;
	// insert
	public void insertRailway(AdminRailway r)
	{
		adminrailwaydao.save(r);
	}
	// get all data
	public List<AdminRailway> getalldata()
	{
		return adminrailwaydao.findAll();
	}
	// delete
	public void delete(int id)
	{
		adminrailwaydao.deleteById(id);
	}
	// get by id
	public AdminRailway getbyid(int id)
	{
		return adminrailwaydao.findById(id).get();
	}
	// update
	public void UpdateRailway(int id,String stationname,String stationaddress,byte[] bs,byte[] bs2)
	{
		adminrailwaydao.updaterailway(id, stationname, stationaddress, bs, bs2);
	}
}
