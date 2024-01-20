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
@Table(name="ADMIN_BRTS")
public class AdminBRTS {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="station_name")
	private String brts_Station_name;
	@Column(name="station_address")
	private String brts_Station_address;
	
	@Lob
	@Column(name="station_imgone")
	private byte[] brts_imageone;
	
	@Lob
	@Column(name="station_imgtwo")
	private byte[] brts_imagetwo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrts_Station_name() {
		return brts_Station_name;
	}

	public void setBrts_Station_name(String brts_Station_name) {
		this.brts_Station_name = brts_Station_name;
	}

	public String getBrts_Station_address() {
		return brts_Station_address;
	}

	public void setBrts_Station_address(String brts_Station_address) {
		this.brts_Station_address = brts_Station_address;
	}

	public byte[] getBrts_imageone() {
		return brts_imageone;
	}

	public void setBrts_imageone(byte[] brts_imageone) {
		this.brts_imageone = brts_imageone;
	}

	public byte[] getBrts_imagetwo() {
		return brts_imagetwo;
	}

	public void setBrts_imagetwo(byte[] brts_imagetwo) {
		this.brts_imagetwo = brts_imagetwo;
	}

	@Override
	public String toString() {
		return "AdminBRTS [id=" + id + ", brts_Station_name=" + brts_Station_name + ", brts_Station_address="
				+ brts_Station_address + ", brts_imageone=" + Arrays.toString(brts_imageone) + ", brts_imagetwo="
				+ Arrays.toString(brts_imagetwo) + "]";
	}

	public AdminBRTS(int id, String brts_Station_name, String brts_Station_address, byte[] brts_imageone,
			byte[] brts_imagetwo) {
		super();
		this.id = id;
		this.brts_Station_name = brts_Station_name;
		this.brts_Station_address = brts_Station_address;
		this.brts_imageone = brts_imageone;
		this.brts_imagetwo = brts_imagetwo;
	}

	public AdminBRTS() {
	}
	
	
	
	
	
	
	

}
