package com.axallant.rentcloud.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class LeadData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String email;
	private String mobile;
	private String source;
	@Column(columnDefinition = "LONGTEXT")
	private String message;
	private String property;
	private String rentalEntity;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
	private boolean transfer;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
	public LeadData() {
		// TODO Auto-generated constructor stub
	}
	
	

	public LeadData(long id, String name, String email, String mobile, String source, String message, String property,
			String rentalEntity, Date createdAt, boolean transfer, Date updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.source = source;
		this.message = message;
		this.property = property;
		this.rentalEntity = rentalEntity;
		this.createdAt = createdAt;
		this.transfer = transfer;
		this.updatedAt = updatedAt;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getRentalEntity() {
		return rentalEntity;
	}

	public void setRentalEntity(String rentalEntity) {
		this.rentalEntity = rentalEntity;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public boolean isTransfer() {
		return transfer;
	}

	public void setTransfer(boolean transfer) {
		this.transfer = transfer;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public String toString() {
		return "LeadData [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", source="
				+ source + ", message=" + message + ", property=" + property + ", rentalEntity=" + rentalEntity
				+ ", createdAt=" + createdAt + ", transfer=" + transfer + ", updatedAt=" + updatedAt + "]";
	}
	
	
	
}
