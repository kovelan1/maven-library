package com.axallant.rentcloud.contract;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "checkInOut")
public class CheckInOut {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long contractId;
	private String place;
	private String item;
	private String moveIn;
	private String moveInDescription;
	private String moveOut;
	private String moveOutDescription;
	private String cost;
	
	public CheckInOut(long id, long contractId, String place, String item, String moveIn, String moveInDescription,
			String moveOut, String moveOutDescription, String cost) {
		super();
		this.id = id;
		this.contractId = contractId;
		this.place = place;
		this.item = item;
		this.moveIn = moveIn;
		this.moveInDescription = moveInDescription;
		this.moveOut = moveOut;
		this.moveOutDescription = moveOutDescription;
		this.cost = cost;
	}

	public CheckInOut() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getMoveIn() {
		return moveIn;
	}

	public void setMoveIn(String moveIn) {
		this.moveIn = moveIn;
	}

	public String getMoveInDescription() {
		return moveInDescription;
	}

	public void setMoveInDescription(String moveInDescription) {
		this.moveInDescription = moveInDescription;
	}

	public String getMoveOut() {
		return moveOut;
	}

	public void setMoveOut(String moveOut) {
		this.moveOut = moveOut;
	}

	public String getMoveOutDescription() {
		return moveOutDescription;
	}

	public void setMoveOutDescription(String moveOutDescription) {
		this.moveOutDescription = moveOutDescription;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public long getContractId() {
		return contractId;
	}

	public void setContractId(long contractId) {
		this.contractId = contractId;
	}
	
	
	
}
