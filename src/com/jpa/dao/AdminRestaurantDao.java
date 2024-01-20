package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.AdminRestaurent;

@Repository
public interface AdminRestaurantDao extends JpaRepository<AdminRestaurent, Integer> {

	@Modifying
	@Query(value = "UPDATE AdminRestaurent restro " +
	               "SET restro.restaurant_name = :restaurentname, " +
	               "restro.restaurant_address = :restaurentaddress, " +
	               "restro.restaurant_dishes = :restaurentdishes, " +
	               "restro.restaurant_phone = :restaurentcontact, " +
	               "restro.restaurant_amtime = :restaurentAmTime, " +
	               "restro.restaurant_pmtime = :restaurentPmTime, " +
	               "restro.restaurant_imgone = :restaurentimgone, " +
	               "restro.restaurant_imgtwo = :restaurentimgtwo " +
	               "WHERE restro.id = :id")
	void updaterestaurant(@Param("id") int id,@Param("restaurentname") String restaurentname,@Param("restaurentaddress") String restaurentaddress,@Param("restaurentdishes")  String restaurentdishes,
			@Param("restaurentcontact") String restaurentcontact,@Param("restaurentAmTime") String restaurentAmTime,@Param("restaurentPmTime") String restaurentPmTime,@Param("restaurentimgone") byte[] restaurentimgone,@Param("restaurentimgtwo") byte[] restaurentimgtwo);
}
