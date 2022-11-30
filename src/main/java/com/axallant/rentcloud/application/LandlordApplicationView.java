package com.axallant.rentcloud.application;

import java.util.List;

import com.axallant.rentcloud.application.Application;

public class LandlordApplicationView {
	
	//private Long propertyId;
	private Long rentalEntityId;
	private List<Application> applications;
	
	public LandlordApplicationView() {
		// TODO Auto-generated constructor stub
	}

	public LandlordApplicationView(Long rentalEntityId, List<Application> applications) {
		//this.propertyId=propertyId;
		this.rentalEntityId = rentalEntityId;
		this.applications = applications;
	}

	public Long getRentalEntityId() {
		return rentalEntityId;
	}

	public void setRentalEntityId(Long rentalEntityId) {
		this.rentalEntityId = rentalEntityId;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

//	public Long getPropertyId() {
//		return propertyId;
//	}
//
//	public void setPropertyId(Long propertyId) {
//		this.propertyId = propertyId;
//	}
//	
	

}
