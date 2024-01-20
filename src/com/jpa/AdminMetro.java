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
@Table(name="ADMIN_METRO")
public class AdminMetro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="station_name")
	private String metro_Station_name;
	@Column(name="station_address")
	private String metro_Station_address;
	
	@Lob
	@Column(name="station_imgone")
	private byte[] metro_imageone;
	
	@Lob
	@Column(name="station_imgtwo")
	private byte[] metro_imagetwo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMetro_Station_name() {
		return metro_Station_name;
	}

	public void setMetro_Station_name(String metro_Station_name) {
		this.metro_Station_name = metro_Station_name;
	}

	public String getMetro_Station_address() {
		return metro_Station_address;
	}

	public void setMetro_Station_address(String metro_Station_address) {
		this.metro_Station_address = metro_Station_address;
	}

	public byte[] getMetro_imageone() {
		return metro_imageone;
	}

	public void setMetro_imageone(byte[] metro_imageone) {
		this.metro_imageone = metro_imageone;
	}

	public byte[] getMetro_imagetwo() {
		return metro_imagetwo;
	}

	public void setMetro_imagetwo(byte[] metro_imagetwo) {
		this.metro_imagetwo = metro_imagetwo;
	}

	@Override
	public String toString() {
		return "AdminMetro [id=" + id + ", metro_Station_name=" + metro_Station_name + ", metro_Station_address="
				+ metro_Station_address + ", metro_imageone=" + Arrays.toString(metro_imageone) + ", metro_imagetwo="
				+ Arrays.toString(metro_imagetwo) + "]";
	}

	public AdminMetro(int id, String metro_Station_name, String metro_Station_address, byte[] metro_imageone,
			byte[] metro_imagetwo) {
		this.id = id;
		this.metro_Station_name = metro_Station_name;
		this.metro_Station_address = metro_Station_address;
		this.metro_imageone = metro_imageone;
		this.metro_imagetwo = metro_imagetwo;
	}

	public AdminMetro() {
	}

	
	
	
	
	
	
	
	

}
