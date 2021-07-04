package com.axallant.rentcloud.notification;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(NotifictionUserId.class)
public class NotificationUserSettings {

	@Id
	private String userName;
	
	@Id
	private Events event;
	
	private boolean subscribed;
	
	public NotificationUserSettings() {}

	public NotificationUserSettings(String userName, Events event, boolean subscribed) {
		
		this.userName = userName;
		this.event = event;
		this.subscribed = subscribed;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Events getEvent() {
		return event;
	}

	public void setEvent(Events event) {
		this.event = event;
	}

	public boolean isSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}
	
	
}
