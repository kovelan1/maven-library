package com.axallant.rentcloud.application;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ViewingRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long viewingTimeId;
	private String landlordId;
	private String tenantId;
	@Enumerated(EnumType.STRING)
	private ApplicationStatus status;
	
	public ViewingRequest() {
		
	}

	
	public ViewingRequest(Long id, Long viewingTimeId, String landlordId, String tenantId, ApplicationStatus status) {
		super();
		this.id = id;
		this.viewingTimeId = viewingTimeId;
		this.landlordId = landlordId;
		this.tenantId = tenantId;
		this.status = status;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getViewingTimeId() {
		return viewingTimeId;
	}

	public void setViewingTimeId(Long viewingTimeId) {
		this.viewingTimeId = viewingTimeId;
	}

	public String getLandlordId() {
		return landlordId;
	}

	public void setLandlordId(String landlordId) {
		this.landlordId = landlordId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public ApplicationStatus getStatus() {
		return status;
	}

	public void setStatus(ApplicationStatus status) {
		this.status = status;
	}

	
}
