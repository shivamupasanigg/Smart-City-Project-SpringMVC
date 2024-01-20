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
@Table(name="ADMIN_MOST_VISITED_PLACE")
public class AdminMostVisitedPlace {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="place_name")
	private String place_name;
	
	@Column(name="place_address")
	private String place_address;
	
	@Column(name="place_phone")
	private String place_phone;
	
	@Column(name="am_timing")
	private String  place_amtiming;
	
	@Column(name="pm_timing")
	private String place_pmtiming;
	
	@Column(name="place_imgone")
	@Lob
	private byte[] imageone;
	
	@Lob
	@Column(name="place_imgtwo")
	private byte[] imagetwo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlace_name() {
		return place_name;
	}
	public void setPlace_name(String place_name) {
		this.place_name = place_name;
	}
	public String getPlace_address() {
		return place_address;
	}
	public void setPlace_address(String place_address) {
		this.place_address = place_address;
	}
	public byte[] getImageone() {
		return imageone;
	}
	public void setImageone(byte[] imageone) {
		this.imageone = imageone;
	}
	public byte[] getImagetwo() {
		return imagetwo;
	}
	public void setImagetwo(byte[] imagetwo) {
		this.imagetwo = imagetwo;
	}
	
	public String getPlace_phone() {
		return place_phone;
	}
	public void setPlace_phone(String place_phone) {
		this.place_phone = place_phone;
	}
	public String getPlace_amtiming() {
		return place_amtiming;
	}
	public void setPlace_amtiming(String place_amtiming) {
		this.place_amtiming = place_amtiming;
	}
	public String getPlace_pmtiming() {
		return place_pmtiming;
	}
	public void setPlace_pmtiming(String place_pmtiming) {
		this.place_pmtiming = place_pmtiming;
	}
	
	
	@Override
	public String toString() {
		return "AdminMostVisitedPlace [id=" + id + ", place_name=" + place_name + ", place_address=" + place_address
				+ ", place_phone=" + place_phone + ", place_amtiming=" + place_amtiming + ", place_pmtiming="
				+ place_pmtiming + ", imageone=" + Arrays.toString(imageone) + ", imagetwo=" + Arrays.toString(imagetwo)
				+ "]";
	}
	
	
	public AdminMostVisitedPlace(int id, String place_name, String place_address, String place_phone,
			String place_amtiming, String place_pmtiming, byte[] imageone, byte[] imagetwo) {
		super();
		this.id = id;
		this.place_name = place_name;
		this.place_address = place_address;
		this.place_phone = place_phone;
		this.place_amtiming = place_amtiming;
		this.place_pmtiming = place_pmtiming;
		this.imageone = imageone;
		this.imagetwo = imagetwo;
	}
	public AdminMostVisitedPlace()
	{
		
	}
	
	
	
	
	
	
	
	

}
