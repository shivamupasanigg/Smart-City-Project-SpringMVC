package com.jpa;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="ADMIN_RESTAURANT")
public class AdminRestaurent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="restaurant_name")
	private String restaurant_name;
	
	@Column(name="restaurant_address")
	private String restaurant_address;
	
	@Column(name="restaurant_dish")
	private String restaurant_dishes;
	
	@Column(name="restaurant_phone")
	private String restaurant_phone;
	
	@Column(name="restaurant_amtime")
	private String restaurant_amtime;
	
	@Column(name="restaurant_pmtime")
	private String restaurant_pmtime;
	
	@Column(name="restaurant_imgone")
	@Lob
	private byte[] restaurant_imgone;
	
	@Column(name="restaurant_imgtwo")
	@Lob
	private byte[] restaurant_imgtwo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRestaurant_name() {
		return restaurant_name;
	}

	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}

	public String getRestaurant_address() {
		return restaurant_address;
	}

	public void setRestaurant_address(String restaurant_address) {
		this.restaurant_address = restaurant_address;
	}
	public String getRestaurant_dishes() {
		return restaurant_dishes;
	}

	public void setRestaurant_dishes(String restaurant_dishes) {
		this.restaurant_dishes = restaurant_dishes;
	}

	public String getRestaurant_phone() {
		return restaurant_phone;
	}

	public void setRestaurant_phone(String restaurant_phone) {
		this.restaurant_phone = restaurant_phone;
	}

	public String getRestaurant_amtime() {
		return restaurant_amtime;
	}

	public void setRestaurant_amtime(String restaurant_amtime) {
		this.restaurant_amtime = restaurant_amtime;
	}

	public String getRestaurant_pmtime() {
		return restaurant_pmtime;
	}

	public void setRestaurant_pmtime(String restaurant_pmtime) {
		this.restaurant_pmtime = restaurant_pmtime;
	}

	public byte[] getRestaurant_imgone() {
		return restaurant_imgone;
	}

	public void setRestaurant_imgone(byte[] imageone) {
		this.restaurant_imgone = imageone;
	}

	public byte[] getRestaurant_imgtwo() {
		return restaurant_imgtwo;
	}

	public void setRestaurant_imgtwo(byte[] imagetwo) {
		this.restaurant_imgtwo = imagetwo;
	}

	@Override
	public String toString() {
		return "AdminRestaurent [id=" + id + ", restaurant_name=" + restaurant_name + ", restaurant_address="
				+ restaurant_address + ", restaurant_dishes=" + restaurant_dishes + ", restaurant_phone="
				+ restaurant_phone + ", restaurant_amtime=" + restaurant_amtime + ", restaurant_pmtime="
				+ restaurant_pmtime + ", restaurant_imgone=" + Arrays.toString(restaurant_imgone)
				+ ", restaurant_imgtwo=" + Arrays.toString(restaurant_imgtwo) + "]";
	}

	public AdminRestaurent(int id, String restaurant_name, String restaurant_address, String restaurant_dishes,
			String restaurant_phone, String restaurant_amtime, String restaurant_pmtime, byte[] restaurant_imgone,
			byte[] restaurant_imgtwo) {
		super();
		this.id = id;
		this.restaurant_name = restaurant_name;
		this.restaurant_address = restaurant_address;
		this.restaurant_dishes = restaurant_dishes;
		this.restaurant_phone = restaurant_phone;
		this.restaurant_amtime = restaurant_amtime;
		this.restaurant_pmtime = restaurant_pmtime;
		this.restaurant_imgone = restaurant_imgone;
		this.restaurant_imgtwo = restaurant_imgtwo;
	}

	public AdminRestaurent() {

	}
	
	

	
	

}
