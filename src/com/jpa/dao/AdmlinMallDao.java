package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.AdminMalls;

@Repository
public interface AdmlinMallDao extends JpaRepository<AdminMalls, Integer>
{
	
	@Modifying
	@Query("UPDATE AdminMalls m SET m.mall_name = :mallname, m.mall_address = :malladdress, m.mall_phone = :mallcontact, m.mall_amtiming = :mallamTime, m.mall_pmtiming = :mallpmTime, m.mallimageone = :mallimg1, m.mallimagetwo = :mallimg2 WHERE m.id = :id")
	void updatemalls(
	        @Param("id") int id,
	        @Param("mallname") String mallname,
	        @Param("malladdress") String malladdress,
	        @Param("mallcontact") String mallcontact,
	        @Param("mallamTime") String mallamTime,
	        @Param("mallpmTime") String mallpmTime,
	        @Param("mallimg1") byte[] mallimg1,
	        @Param("mallimg2") byte[] mallimg2
	);
}
