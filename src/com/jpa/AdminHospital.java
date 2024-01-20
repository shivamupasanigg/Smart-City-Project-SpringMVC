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
@Table(name = "ADMIN_HOSPITAL")
public class AdminHospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="hospital_name")
	private String hospital_name;
	
	@Column(name="hospital_address")
	private String hospital_address;
	
	@Column(name="hospital_facility")
	private String hospital_facility;
	
	@Column(name="hospital_phone")
	private String hospital_phone;
	
	@Column(name="hospital_time")
	private String hospital_time;
	
	@Column(name="hospital_imgone")
	@Lob
	private byte[] hospital_imgone;
	
	@Column(name="hospital_imgtwo")
	@Lob
	private byte[] hospital_imgtwo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	public String getHospital_address() {
		return hospital_address;
	}
	public void setHospital_address(String hospital_address) {
		this.hospital_address = hospital_address;
	}
	public String getHospital_facility() {
		return hospital_facility;
	}
	public void setHospital_facility(String hospital_facility) {
		this.hospital_facility = hospital_facility;
	}
	public String getHospital_phone() {
		return hospital_phone;
	}
	public void setHospital_phone(String hospital_phone) {
		this.hospital_phone = hospital_phone;
	}
	public String getHospital_time() {
		return hospital_time;
	}
	public void setHospital_time(String hospital_time) {
		this.hospital_time = hospital_time;
	}
	public byte[] getHospital_imgone() {
		return hospital_imgone;
	}
	public void setHospital_imgone(byte[] hospital_imgone) {
		this.hospital_imgone = hospital_imgone;
	}
	public byte[] getHospital_imgtwo() {
		return hospital_imgtwo;
	}
	public void setHospital_imgtwo(byte[] hospital_imgtwo) {
		this.hospital_imgtwo = hospital_imgtwo;
	}
	@Override
	public String toString() {
		return "AdminHospital [id=" + id + ", hospital_name=" + hospital_name + ", hospital_address=" + hospital_address
				+ ", hospital_facility=" + hospital_facility + ", hospital_phone=" + hospital_phone + ", hospital_time="
				+ hospital_time + ", hospital_imgone=" + Arrays.toString(hospital_imgone) + ", hospital_imgtwo="
				+ Arrays.toString(hospital_imgtwo) + "]";
	}
	public AdminHospital(int id, String hospital_name, String hospital_address, String hospital_facility,
			String hospital_phone, String hospital_time, byte[] hospital_imgone, byte[] hospital_imgtwo) {
		super();
		this.id = id;
		this.hospital_name = hospital_name;
		this.hospital_address = hospital_address;
		this.hospital_facility = hospital_facility;
		this.hospital_phone = hospital_phone;
		this.hospital_time = hospital_time;
		this.hospital_imgone = hospital_imgone;
		this.hospital_imgtwo = hospital_imgtwo;
	}
	public AdminHospital() {
	}
	
	

}
