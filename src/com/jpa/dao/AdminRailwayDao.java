package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.AdminRailway;

@Repository
public interface AdminRailwayDao extends JpaRepository<AdminRailway, Integer>{

	@Modifying
	@Query("UPDATE AdminRailway r SET r.railway_Station_name = :railway_name, r.railway_Station_address = :railway_address, r.railway_imageone = :railway_one, r.railway_imagetwo = :railway_two WHERE r.id = :id")
	void updaterailway(@Param("id") int id,
	                   @Param("railway_name") String railway_name,
	                   @Param("railway_address") String railway_address,
	                   @Param("railway_one") byte[] railway_one,
	                   @Param("railway_two") byte[] railway_two);

	
}
