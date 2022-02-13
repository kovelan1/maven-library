package com.axallant.rentcloud.contract;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.axallant.rentcloud.user.UserDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class TenantDTO {

private Long id;
	
	private String username;
	
	private int tenantOrder;
	
	private Contract contract;
	
	private boolean agreed;
	
	private UserDetails userDetails;
	
	public TenantDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getTenantOrder() {
		return tenantOrder;
	}

	public void setTenantOrder(int tenantOrder) {
		this.tenantOrder = tenantOrder;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	
	
}
