package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.AdminBRTS;

@Repository
public interface AdminBRTSDao extends JpaRepository<AdminBRTS,Integer>{
	
	@Modifying
	@Query("UPDATE AdminBRTS b SET b.brts_Station_name = :stationname, b.brts_Station_address = :stationaddress, b.brts_imageone = :imageone, b.brts_imagetwo = :imagetwo WHERE b.id = :id")
	void updateBRTS(@Param("id") int id,
	                @Param("stationname") String stationname,
	                @Param("stationaddress") String stationaddress,
	                @Param("imageone") byte[] imgone,
	                @Param("imagetwo") byte[] imgtwo);
}
