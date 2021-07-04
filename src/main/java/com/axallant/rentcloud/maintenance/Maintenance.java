package com.axallant.rentcloud.maintenance;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Maintenance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String tenantId;
	private String landlordId;
	private long contractId;
	private long rentalEntityId;
	private String category;
	private String subCategory;
	private String description;
	private String imageUrl;
	@Enumerated(EnumType.STRING)
	private LandlordStatus landlordApproved;
	@Enumerated(EnumType.STRING)
	private ResponseStatus status; // use to store the 3rd party maintenance provider status 
	private String outsourceId;
	private double cost;
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
	private Date created_at;
	private Date approvedOn;
	private Date finishOn;
	
	
	public Maintenance(){}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public long getContractId() {
		return contractId;
	}
	public void setContractId(long contractId) {
		this.contractId = contractId;
	}
	public long getRentalEntityId() {
		return rentalEntityId;
	}
	public void setRentalEntityId(long rentalEntityId) {
		this.rentalEntityId = rentalEntityId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public ResponseStatus getStatus() {
		return status;
	}
	public void setStatus(ResponseStatus status) {
		this.status = status;
	}
	public String getOutsourceId() {
		return outsourceId;
	}
	public void setOutsourceId(String outsourceId) {
		this.outsourceId = outsourceId;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getApprovedOn() {
		return approvedOn;
	}
	public void setApprovedOn(Date approvedOn) {
		this.approvedOn = approvedOn;
	}
	public Date getFinishOn() {
		return finishOn;
	}
	public void setFinishOn(Date finishOn) {
		this.finishOn = finishOn;
	}

	public String getLandlordId() {
		return landlordId;
	}

	public void setLandlordId(String landlordId) {
		this.landlordId = landlordId;
	}

	public LandlordStatus getLandlordApproved() {
		return landlordApproved;
	}

	public void setLandlordApproved(LandlordStatus landlordApproved) {
		this.landlordApproved = landlordApproved;
	}
	
	
	
	
	
}
