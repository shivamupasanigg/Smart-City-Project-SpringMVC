package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.AdminMostVisitedPlace;

@Repository
public interface AdminMostVisitPlaceDao extends JpaRepository<AdminMostVisitedPlace,Integer>{

	@Modifying
    @Query("UPDATE AdminMostVisitedPlace p SET p.place_name = :placename, p.place_address = :placeaddress, p.place_phone = :placecontact, p.place_amtiming = :amTime, p.place_pmtiming = :pmTime, p.imageone = :imageone, p.imagetwo = :imagetwo WHERE p.id = :id")
    void updatePlace(
        @Param("id") int id,
        @Param("placename") String placename,
        @Param("placeaddress") String placeaddress,
        @Param("placecontact") String placecontact,
        @Param("amTime") String amTime,
        @Param("pmTime") String pmTime,
        @Param("imageone") byte[] imageone,
        @Param("imagetwo") byte[] imagetwo
    );
}
