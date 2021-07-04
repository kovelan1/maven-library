package com.axallant.rentcloud.propertiy;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "landLord_property")
public class LandLordProperty implements Serializable{

	@EmbeddedId
	private LandLordPropID landLordPropID;
	
	private String ownerType;
	private double share;
	public LandLordProperty() {}
	
	public LandLordProperty(LandLordPropID landLordPropID, String ownerType, double share) {
		super();
		this.landLordPropID = landLordPropID;
		this.ownerType = ownerType;
		this.share = share;
	}
	
	public LandLordPropID getLandLordPropID() {
		return landLordPropID;
	}
	public void setLandLordPropID(LandLordPropID landLordPropID) {
		this.landLordPropID = landLordPropID;
	}
	public String getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}
	public double getShare() {
		return share;
	}
	public void setShare(double share) {
		this.share = share;
	}
	
}
