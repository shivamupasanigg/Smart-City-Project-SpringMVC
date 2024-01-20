package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.AdminHospital;

@Repository
public interface AdminHospitalDao extends JpaRepository<AdminHospital, Integer>{

	@Modifying
	@Query("UPDATE AdminHospital hospi SET hospi.hospital_name = :hospitalname, hospi.hospital_address = :hospitaladdress, hospi.hospital_facility = :hospitalfacility, hospi.hospital_phone = :hospitalcontact, hospi.hospital_time = :hospitaltime, hospi.hospital_imgone = :hospitalimgone, hospi.hospital_imgtwo = :hospitalimgtwo WHERE hospi.id = :id")
	void updatehospital(@Param("id") int id,
	                    @Param("hospitalname") String hospitalname,
	                    @Param("hospitaladdress") String hospitaladdress,
	                    @Param("hospitalfacility") String hospitalfacility,
	                    @Param("hospitalcontact") String hospitalcontact,
	                    @Param("hospitaltime") String hospitaltime,
	                    @Param("hospitalimgone") byte[] hospitalimgone,
	                    @Param("hospitalimgtwo") byte[] hospitalimgtwo);
}
