package com.axallant.rentcloud.propertiy;

import java.io.Serializable;
import java.util.Optional;

import com.axallant.rentcloud.models.Address;
import com.axallant.rentcloud.propertiy.Property;
import com.axallant.rentcloud.propertiy.RentalEntity;


public class ViewRenatlEntity implements Serializable{

	

	private Address address;
	
	private RentalEntity rentalEntity;

	public ViewRenatlEntity(){}

	public ViewRenatlEntity(Address address, RentalEntity rentalEntity) {
		
		this.address = address;
		this.rentalEntity = rentalEntity;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public RentalEntity getRentalEntity() {
		return rentalEntity;
	}

	public void setRentalEntity(RentalEntity rentalEntity) {
		this.rentalEntity = rentalEntity;
	}
	
	
}
