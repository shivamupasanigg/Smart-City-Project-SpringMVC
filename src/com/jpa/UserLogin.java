package com.jpa;

import com.AdminCustomValidator.UserPassword;
import com.AdminCustomValidator.UserUserName;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_SIGNUP")
public class UserLogin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="user_user_name")
	@UserUserName
	private String username;
	
	@Column(name="user_password")
	@UserPassword
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserLogin(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public UserLogin() {
		super();
	}
	@Override
	public String toString() {
		return "UserLogin [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	
	

}
