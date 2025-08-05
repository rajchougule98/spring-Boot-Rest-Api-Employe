package com.cjc.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe {

	@Id
	private Integer eid;
	private String name;
	private String address;
	private Float mobileNo;
	private Double salery;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Float getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Float mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Double getSalery() {
		return salery;
	}
	public void setSalery(Double salery) {
		this.salery = salery;
	}
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", salery=" + salery + "]";
	}
	
}
