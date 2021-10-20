package com.axallant.rentcloud.application;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


import com.axallant.rentcloud.models.Address;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BusinessOwners {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL)
	private BusinessApplication businessApplication;
	
	private String name;
	@Embedded
	private Address ownerAddress;
	private String email;
	private String phone;
	private String phoneAlteranative;
	private Date dob;
	private String drivingLicenceNo;
	private String ssn;
	
	public BusinessOwners() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BusinessApplication getBusinessApplication() {
		return businessApplication;
	}

	public void setBusinessApplication(BusinessApplication businessApplication) {
		this.businessApplication = businessApplication;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneAlteranative() {
		return phoneAlteranative;
	}

	public void setPhoneAlteranative(String phoneAlteranative) {
		this.phoneAlteranative = phoneAlteranative;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDrivingLicenceNo() {
		return drivingLicenceNo;
	}

	public void setDrivingLicenceNo(String drivingLicenceNo) {
		this.drivingLicenceNo = drivingLicenceNo;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Address getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(Address ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	
	
	
}
