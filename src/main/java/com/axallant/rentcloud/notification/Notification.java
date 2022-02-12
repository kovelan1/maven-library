package com.axallant.rentcloud.notification;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "notification")
public class Notification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private Events catogory;
	private String rentalEnitiyAddress;
	private long rentalEnitiyId;
	private String actionBy;
	private long actionId;
	private String notificationTo;
	private boolean seen;
	private boolean deleted;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;
	
	public Notification() {}

	public Notification(long id, Events catogory, String rentalEnitiyAddress, long rentalEnitiyId, String actionBy,
			long actionId, String notificationTo, boolean seen, boolean deleted, Date createdAt) {
		super();
		this.id = id;
		this.catogory = catogory;
		this.rentalEnitiyAddress = rentalEnitiyAddress;
		this.rentalEnitiyId = rentalEnitiyId;
		this.actionBy = actionBy;
		this.actionId = actionId;
		this.notificationTo = notificationTo;
		this.seen = seen;
		this.deleted = deleted;
		this.createdAt = createdAt;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Events getCatogory() {
		return catogory;
	}

	public void setCatogory(Events catogory) {
		this.catogory = catogory;
	}

	public String getRentalEnitiyAddress() {
		return rentalEnitiyAddress;
	}

	public void setRentalEnitiyAddress(String rentalEnitiyAddress) {
		this.rentalEnitiyAddress = rentalEnitiyAddress;
	}

	public long getRentalEnitiyId() {
		return rentalEnitiyId;
	}

	public void setRentalEnitiyId(long rentalEnitiyId) {
		this.rentalEnitiyId = rentalEnitiyId;
	}

	public String getActionBy() {
		return actionBy;
	}

	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}

	public long getActionId() {
		return actionId;
	}

	public void setActionId(long actionId) {
		this.actionId = actionId;
	}

	public String getNotificationTo() {
		return notificationTo;
	}

	public void setNotificationTo(String notificationTo) {
		this.notificationTo = notificationTo;
	}

	public boolean isSeen() {
		return seen;
	}

	public void setSeen(boolean seen) {
		this.seen = seen;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	

	
	
}
