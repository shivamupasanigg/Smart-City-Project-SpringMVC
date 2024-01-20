package com.jpa;

import com.AdminCustomValidator.UserConfirmPassword;
import com.AdminCustomValidator.UserFullName;
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
public class UserRegister {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="user_full_name")
	@UserFullName
	private String fullname;
	@Column(name="user_user_name")
	@UserUserName
	private String username;
	@Column(name="user_password")
	@UserPassword
	private String password;
	@Column(name="user_confirm_password")
	@UserConfirmPassword
	private String confirmpassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
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
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	@Override
	public String toString() {
		return "UserRegister [id=" + id + ", fullname=" + fullname + ", username=" + username + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + "]";
	}
	public UserRegister(int id, String fullname, String username, String password, String confirmpassword) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	public UserRegister() {
		super();
	}
	
	
	
	
	

}
