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
@Table(name="ADMIN_RAILWAY")
public class AdminRailway {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="station_name")
	private String railway_Station_name;
	@Column(name="station_address")
	private String railway_Station_address;
	
	@Lob
	@Column(name="station_imgone")
	private byte[] railway_imageone;
	
	@Lob
	@Column(name="station_imgtwo")
	private byte[] railway_imagetwo;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRailway_Station_name() {
		return railway_Station_name;
	}


	public void setRailway_Station_name(String railway_Station_name) {
		this.railway_Station_name = railway_Station_name;
	}


	public String getRailway_Station_address() {
		return railway_Station_address;
	}


	public void setRailway_Station_address(String railway_Station_address) {
		this.railway_Station_address = railway_Station_address;
	}


	public byte[] getRailway_imageone() {
		return railway_imageone;
	}


	public void setRailway_imageone(byte[] railway_imageone) {
		this.railway_imageone = railway_imageone;
	}


	public byte[] getRailway_imagetwo() {
		return railway_imagetwo;
	}


	public void setRailway_imagetwo(byte[] railway_imagetwo) {
		this.railway_imagetwo = railway_imagetwo;
	}

	

	@Override
	public String toString() {
		return "AdminRailway [id=" + id + ", railway_Station_name=" + railway_Station_name
				+ ", railway_Station_address=" + railway_Station_address + ", railway_imageone="
				+ Arrays.toString(railway_imageone) + ", railway_imagetwo=" + Arrays.toString(railway_imagetwo) + "]";
	}

	

	public AdminRailway(int id, String railway_Station_name, String railway_Station_address, byte[] railway_imageone,
			byte[] railway_imagetwo) {
		super();
		this.id = id;
		this.railway_Station_name = railway_Station_name;
		this.railway_Station_address = railway_Station_address;
		this.railway_imageone = railway_imageone;
		this.railway_imagetwo = railway_imagetwo;
	}


	public AdminRailway() {
	}

	
	
	
	
	
	
	
	

}
