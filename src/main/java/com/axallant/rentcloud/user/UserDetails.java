package com.axallant.rentcloud.user;

import java.util.List;

import com.axallant.rentcloud.models.Address;
import com.axallant.rentcloud.user.AuthProvider;
import com.axallant.rentcloud.user.Role;

public class UserDetails {
	
	 private String username;
	 private String firstName;
	 private String lastName;
	 private String middleName;
	 private Address address;
	 private String mobileNumber;
	 private List<Role> roles;
	 private AuthProvider provider;
	 private String imageUrl;
	 
	 public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public AuthProvider getProvider() {
		return provider;
	}

	public void setProvider(AuthProvider provider) {
		this.provider = provider;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public UserDetails() {
		// TODO Auto-generated constructor stub
	}
	 
	
	

}
