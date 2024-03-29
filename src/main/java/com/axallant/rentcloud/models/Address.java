package com.axallant.rentcloud.models;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable {

	private String unit;
	private String address;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String country;
	private double lat=0.0;
	private double lng=0.0; 
	
	
	public Address(String unit,String address,String address2, String city, String state, String zip, String country, double lat, double lng) {
		super();
		this.unit=unit;
		this.address = address;
		this.address2=address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.lat = lat;
		this.lng = lng;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
