package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import com.jpa.AdminBRTS;

@Service
@Transactional
public class AdminBRTSDaoImpl {
	
	@Autowired
	private AdminBRTSDao AdminBRTSDao;
	
	// insert brts
	public void InsertBrts(AdminBRTS b)
	{
		AdminBRTSDao.save(b);
	}
	
	// get all  brts station
	public List<AdminBRTS> GetAllBrts()
	{
		return AdminBRTSDao.findAll();
	}
	// delete
	public void delete(int id)
	{
		AdminBRTSDao.deleteById(id);
	}
	
	// get id
	public AdminBRTS getbyid(int id)
	{
		return AdminBRTSDao.findById(id).get();
	}
	
	public void updatebrts(int id,String stationname,String stationaddress,byte[] imgone,byte[] imgtwo)
	{
		AdminBRTSDao.updateBRTS(id, stationname, stationaddress, imgone, imgtwo);
	}
	
	
	

}
