package com.axallant.rentcloud.payment;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RentalSubcription {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String tenant;
	
	@Column(unique=true)
	private long contractId;
	private String subsciptionId;
	private int paymentDay;
	private Date startDate;
	private Date endDate;
	private int iteration;
	
	
	public RentalSubcription() {
		// TODO Auto-generated constructor stub
	}

	
	
	public RentalSubcription(Long id, String tenant, long contractId, String subsciptionId) {
		super();
		this.id = id;
		this.tenant = tenant;
		this.contractId = contractId;
		this.subsciptionId = subsciptionId;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	public long getContractId() {
		return contractId;
	}

	public void setContractId(long contractId) {
		this.contractId = contractId;
	}

	public String getSubsciptionId() {
		return subsciptionId;
	}

	public void setSubsciptionId(String subsciptionId) {
		this.subsciptionId = subsciptionId;
	}
	
	
	
}
