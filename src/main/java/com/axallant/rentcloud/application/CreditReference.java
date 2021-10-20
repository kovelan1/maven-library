package com.axallant.rentcloud.application;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.axallant.rentcloud.models.Address;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CreditReference {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL)
	private BusinessApplication businessApplication;
	
	private String companyName;
	private String contactName;
	private String phone;
	@Embedded
	private Address companyAddress;
	
	public CreditReference() {
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}
	
	
	
}
