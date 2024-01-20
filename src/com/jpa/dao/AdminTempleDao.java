package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.AdminTemple;

@Repository
public interface AdminTempleDao extends JpaRepository<AdminTemple, Integer>{
	
	@Modifying
	@Query("UPDATE AdminTemple temple SET temple.temple_name = :templename,temple.temple_address = :templeaddress,temple.temple_phone = :templecontact,temple.temple_amtime = :templeamtime,temple.temple_pmtime = :templepmtime,temple.temple_imgone = :templeimgone,temple.temple_imgtwo =:templeimgtwo WHERE temple.id=:id")
	void updatetemple(@Param("id") int id,
			          @Param("templename") String templename,
			          @Param("templeaddress") String templeaddress,
			          @Param("templecontact") String templecontact,
			          @Param("templeamtime") String templeamtime,
			          @Param("templepmtime") String templepmtime,
			          @Param("templeimgone") byte[] templeimgone,
			          @Param("templeimgtwo") byte[] templeimgtwo);

}
