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
@Table(name="ADMIN_MALLS")
public class AdminMalls {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="mall_name")
	private String mall_name;
	
	@Column(name="mall_address")
	private String mall_address;
	
	@Column(name="mall_phone")
	private String mall_phone;
	
	@Column(name="mall_am_time")
	private String  mall_amtiming;
	
	@Column(name="mall_pm_time")
	private String mall_pmtiming;
	
	@Column(name="mall_imgone")
	@Lob
	private byte[] mallimageone;
	
	@Lob
	@Column(name="mall_imgtwo")
	private byte[] mallimagetwo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMall_name() {
		return mall_name;
	}

	public void setMall_name(String mall_name) {
		this.mall_name = mall_name;
	}

	public String getMall_address() {
		return mall_address;
	}

	public void setMall_address(String mall_address) {
		this.mall_address = mall_address;
	}

	public String getMall_phone() {
		return mall_phone;
	}

	public void setMall_phone(String mall_phone) {
		this.mall_phone = mall_phone;
	}

	public String getMall_amtiming() {
		return mall_amtiming;
	}

	public void setMall_amtiming(String mall_amtiming) {
		this.mall_amtiming = mall_amtiming;
	}

	public String getMall_pmtiming() {
		return mall_pmtiming;
	}

	public void setMall_pmtiming(String mall_pmtiming) {
		this.mall_pmtiming = mall_pmtiming;
	}

	public byte[] getMallimageone() {
		return mallimageone;
	}

	public void setMallimageone(byte[] mallimageone) {
		this.mallimageone = mallimageone;
	}

	public byte[] getMallimagetwo() {
		return mallimagetwo;
	}

	public void setMallimagetwo(byte[] mallimagetwo) {
		this.mallimagetwo = mallimagetwo;
	}

	@Override
	public String toString() {
		return "AdminMalls [id=" + id + ", mall_name=" + mall_name + ", mall_address=" + mall_address + ", mall_phone="
				+ mall_phone + ", mall_amtiming=" + mall_amtiming + ", mall_pmtiming=" + mall_pmtiming
				+ ", mallimageone=" + Arrays.toString(mallimageone) + ", mallimagetwo=" + Arrays.toString(mallimagetwo)
				+ "]";
	}

	public AdminMalls(int id, String mall_name, String mall_address, String mall_phone, String mall_amtiming,
			String mall_pmtiming, byte[] mallimageone, byte[] mallimagetwo) {
		super();
		this.id = id;
		this.mall_name = mall_name;
		this.mall_address = mall_address;
		this.mall_phone = mall_phone;
		this.mall_amtiming = mall_amtiming;
		this.mall_pmtiming = mall_pmtiming;
		this.mallimageone = mallimageone;
		this.mallimagetwo = mallimagetwo;
	}

	public AdminMalls() {
	}
	
	
	

}
