package com.axallant.rentcloud.contract;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Tenant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	private int tenantOrder;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="contract_id")
	private Contract contract;
	
	private boolean agreed;
	
	public Tenant() {
		// TODO Auto-generated constructor stub
	}

	public Tenant(Long id, String username, int tenantOrder, Contract contract, boolean agreed) {
		super();
		this.id = id;
		this.username = username;
		this.tenantOrder = tenantOrder;
		this.contract = contract;
		this.agreed = agreed;
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

	

	
	
}
