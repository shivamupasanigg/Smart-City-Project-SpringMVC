package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import jakarta.transaction.Transactional;

import com.jpa.AdminMostVisitedPlace;

@Service
@Transactional
public class AdminMostVsitPlaceDaoImpl {
	
	@Autowired
	private AdminMostVisitPlaceDao AdminMostVisit;
	
	// insert 
	public void save(AdminMostVisitedPlace mostvisit) {
		AdminMostVisit.save(mostvisit);
    }
	
	// select
	public List<AdminMostVisitedPlace> getAllMostVisitedPlace() {
        return AdminMostVisit.findAll();
    }
	
	// get id
	 public AdminMostVisitedPlace get(int id) {
	        return AdminMostVisit.findById(id).get();
	 }
	 
	 // delete
	public void Delete(int id) {
        AdminMostVisit.deleteById(id);
    }
	
	public void updateplace(int id,String name,String address,String phone,String amTime,String pmTime, byte[] imageone,byte[] imagetwo)
	{
		AdminMostVisit.updatePlace(id, name, address, phone, amTime, pmTime, imageone, imagetwo);
	}
	
	
}
