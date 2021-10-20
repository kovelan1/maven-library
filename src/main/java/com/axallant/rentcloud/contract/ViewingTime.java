package com.axallant.rentcloud.contract;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "viewingTime")
public class ViewingTime {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long contractId;
	private Date date;
	
	public ViewingTime( long contractId, Date date) {
		super();
		this.contractId = contractId;
		this.date = date;
	}
	public ViewingTime() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getContractId() {
		return contractId;
	}
	public void setContractId(long contractId) {
		this.contractId = contractId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
