package com.axallant.rentcloud.models;

import javax.persistence.Embeddable;

@Embeddable
public class Name {

	private String f_name;
	private String l_name;
	
	
	
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	
	
}
