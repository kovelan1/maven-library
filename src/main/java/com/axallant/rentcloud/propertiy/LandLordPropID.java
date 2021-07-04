package com.axallant.rentcloud.propertiy;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

import org.springframework.lang.NonNull;

@Embeddable
public class LandLordPropID implements Serializable{

	
	private String user_name;
    private long property_id;

    public LandLordPropID() {
    }

    public LandLordPropID(String user_name, long property_id) {
        this.user_name = user_name;
        this.property_id = property_id;
    }
    
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LandLordPropID lpId = (LandLordPropID) o;
        return user_name.equals(lpId.user_name) &&
        		property_id==lpId.property_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_name, property_id);
    }

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public long getProperty_id() {
		return property_id;
	}

	public void setProperty_id(long property_id) {
		this.property_id = property_id;
	}
}
