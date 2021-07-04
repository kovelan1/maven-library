package com.axallant.rentcloud.notification;

import java.io.Serializable;
import java.util.Objects;


public class NotifictionUserId implements Serializable {

	private String userName;
	private Events event;
	
	public NotifictionUserId(){}
	public NotifictionUserId(String userName, Events event) {
		
		this.userName = userName;
		this.event = event;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotifictionUserId lpId = (NotifictionUserId) o;
        return userName.equals(lpId.userName) &&
        		event==lpId.event;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, event);
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
    
    
	
}
