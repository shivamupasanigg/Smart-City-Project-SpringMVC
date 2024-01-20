package com.jpa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import com.jpa.AdminMalls;
import com.jpa.AdminMostVisitedPlace;


@Service
@Transactional
public class AdminMallDaoImpl {
	
	@Autowired
	private AdmlinMallDao malldao;
	// insert
	public void insert(AdminMalls Mall)
	{
		malldao.save(Mall);
	}
	// get all data
	public List<AdminMalls> getallmalldata()
	{
		return malldao.findAll();
	}
    // delete
	public void delete(int id)
	{
		malldao.deleteById(id);
	}
	
	// get id
	public AdminMalls get(int id) {
		return malldao.findById(id).get();
	}
	// update
	public void updatemalls(int id,String mallname,String malladdress,String mallphone,String mallamtime,String mallpmtime,byte[] mallimageone,byte[] mallimagetwo)
	{
		malldao.updatemalls(id, mallname, malladdress, mallphone, mallamtime, mallpmtime, mallimageone, mallimagetwo);
	}
	
}
