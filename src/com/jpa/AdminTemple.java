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
@Table(name = "ADMIN_TEMPLE")
public class AdminTemple {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="temple_name")
	private String temple_name;
	
	@Column(name="temple_address")
	private String temple_address;
	
	@Column(name="temple_phone")
	private String temple_phone;
	
	@Column(name="temple_amtime")
	private String  temple_amtime;
	
	@Column(name="temple_pmtime")
	private String temple_pmtime;
	
	@Column(name="temple_imgone")
	@Lob
	private byte[] temple_imgone;
	
	@Lob
	@Column(name="temple_imgtwo")
	private byte[] temple_imgtwo;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTemple_name() {
		return temple_name;
	}

	public void setTemple_name(String temple_name) {
		this.temple_name = temple_name;
	}

	public String getTemple_address() {
		return temple_address;
	}

	public void setTemple_address(String temple_address) {
		this.temple_address = temple_address;
	}

	public String getTemple_phone() {
		return temple_phone;
	}

	public void setTemple_phone(String temple_phone) {
		this.temple_phone = temple_phone;
	}

	public String getTemple_amtime() {
		return temple_amtime;
	}

	public void setTemple_amtime(String temple_amtime) {
		this.temple_amtime = temple_amtime;
	}

	public String getTemple_pmtime() {
		return temple_pmtime;
	}

	public void setTemple_pmtime(String temple_pmtime) {
		this.temple_pmtime = temple_pmtime;
	}
	
	

	public byte[] getTemple_imgone() {
		return temple_imgone;
	}

	public void setTemple_imgone(byte[] temple_imgone) {
		this.temple_imgone = temple_imgone;
	}

	public byte[] getTemple_imgtwo() {
		return temple_imgtwo;
	}

	public void setTemple_imgtwo(byte[] temple_imgtwo) {
		this.temple_imgtwo = temple_imgtwo;
	}

	@Override
	public String toString() {
		return "AdminTemple [id=" + id + ", temple_name=" + temple_name + ", temple_address=" + temple_address
				+ ", temple_phone=" + temple_phone + ", temple_amtime=" + temple_amtime + ", temple_pmtime="
				+ temple_pmtime + ", temple_imgone=" + Arrays.toString(temple_imgone) + ", temple_imgtwo="
				+ Arrays.toString(temple_imgtwo) + "]";
	}

	public AdminTemple(int id, String temple_name, String temple_address, String temple_phone, String temple_amtime,
			String temple_pmtime, byte[] temple_imgone, byte[] temple_imgtwo) {
		super();
		this.id = id;
		this.temple_name = temple_name;
		this.temple_address = temple_address;
		this.temple_phone = temple_phone;
		this.temple_amtime = temple_amtime;
		this.temple_pmtime = temple_pmtime;
		this.temple_imgone = temple_imgone;
		this.temple_imgtwo = temple_imgtwo;
	}

	public AdminTemple() {
	}
	
	
	
	
	
	

}
