package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.Admin;
@Repository
public interface AdminDao extends JpaRepository<Admin, Integer>
{
	// for login admin
	Admin findByUsername(String username);
	
	@Modifying
	@Query("UPDATE Admin a SET a.password = :newPassword WHERE a.id = :adminId")
	void updatePassword(@Param("adminId") int adminId, @Param("newPassword") String newPassword);

	
}
