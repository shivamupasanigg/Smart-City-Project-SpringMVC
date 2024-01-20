package com.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.UserRegister;

@Repository
public interface UserSignUpLoginDao extends JpaRepository<UserRegister, Integer>{

	// get user by userName
	UserRegister findByUsername(String username);
	
	// Update Profile
	@Modifying
	@Query("UPDATE UserRegister SET fullname = :full_name, username = :user_name, password = :pass_word, confirmpassword = :confirm_password WHERE id = :id")
	void updateProfile(@Param("id") int id,
	                   @Param("full_name") String full_name,
	                   @Param("user_name") String user_name,
	                   @Param("pass_word") String pass_word,
	                   @Param("confirm_password") String confirm_password);
	
}
