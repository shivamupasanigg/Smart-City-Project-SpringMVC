package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.AdminMetro;

@Repository
public interface AdminMetroDao extends JpaRepository<AdminMetro, Integer>{
	
	@Modifying
	@Query("UPDATE AdminMetro m SET m.metro_Station_name = :stationname, m.metro_Station_address = :stationaddress, m.metro_imageone = :metro_img_one, m.metro_imagetwo = :metro_img_two WHERE m.id = :id")
	void updatemetro(@Param("id") int id,
	                @Param("stationname") String stationname,
	                @Param("stationaddress") String stationaddress,
	                @Param("metro_img_one") byte[] metro_img_one,
	                @Param("metro_img_two") byte[] metro_img_two);


	
}
