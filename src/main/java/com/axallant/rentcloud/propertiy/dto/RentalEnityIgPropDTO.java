package com.axallant.rentcloud.propertiy.dto;

import java.util.Date;
import java.util.List;
import com.axallant.rentcloud.propertiy.RentalEntity;
import com.axallant.rentcloud.propertiy.Status;
import com.axallant.rentcloud.propertiy.ViewingTime;

// this is for ignore the property details in rental entity // used in proprty dto
public class RentalEnityIgPropDTO {

	private Long id;
	private List<ViewingTime> viewingTimes;
	
	private String unitName;
	private String unitType;
	private Status status;
	
	private String listingHeading;
	private int fullRooms;
	private int halfRooms;
	private int bedRooms;
	private int bathroomsAttach;
	private int bathroomsSeparate;
	private int sqFeet;
	private String description;
	private String petPolicy;
	private boolean furnisher;
	private boolean parkingGarage;
	private boolean parkingOnStreet;
	private boolean parkingDriveway;
	private boolean parkingPrivateLot;
	private boolean parkingDedicatedSpot;
	private boolean parkingCovered;
	
	private boolean outDoorSharedYard;
	private boolean outDoorPrivateYard;
	private boolean outDoorPatio;
	private boolean outDoorBalcony;
	private boolean outDoorGarden;
	
	private String washerDrier;
	private String basement;
	private boolean wheelChair;
	private boolean gym;
	private boolean airConditioner;
	private boolean hardwoodFloors ;
	private boolean fireplace ;
	private boolean dishwasher;
	private boolean walkInCloset ;
	private boolean pool;
	private boolean hotTub ;
	private boolean storage ;
	private String walkInTime;
	private String walkInDate;
	private String amenities;
	private double rent;
	private double securityDeposit;
	private int leasePeriod;
	private boolean securityChk;
	private boolean backgroundChk;
	private String imageLink;
	private String link;
	private Date createdAt;
	private Date updatedAt;
	
	public RentalEnityIgPropDTO() {}
	
	public RentalEnityIgPropDTO transfromPramObject(RentalEntity rentalEntity) {
		return new RentalEnityIgPropDTO(
					rentalEntity.getId(), 
					rentalEntity.getUnitName(), 
					rentalEntity.getUnitType(), rentalEntity.getStatus(), 
					rentalEntity.getListingHeading(), 
					rentalEntity.getFullRooms(), 
					rentalEntity.getHalfRooms(), 
					rentalEntity.getBedRooms(), 
					rentalEntity.getBathroomsAttach(), 
					rentalEntity.getBathroomsSeparate(), 
					rentalEntity.getSqFeet(), 
					rentalEntity.getDescription(), 
					rentalEntity.getPetPolicy(), 
					rentalEntity.isFurnisher(), 
					rentalEntity.isParkingGarage(), 
					rentalEntity.isParkingOnStreet(),
					rentalEntity.isParkingDriveway(), 
					rentalEntity.isParkingPrivateLot(), 
					rentalEntity.isParkingDedicatedSpot(),
					rentalEntity.isParkingCovered(), 
					rentalEntity.isOutDoorSharedYard(), 
					rentalEntity.isOutDoorPrivateYard(), 
					rentalEntity.isOutDoorPatio(), 
					rentalEntity.isOutDoorBalcony(),
					rentalEntity.isOutDoorGarden(), 
					rentalEntity.getWasherDrier(), 
					rentalEntity.getBasement(), 
					rentalEntity.isWheelChair(), 
					rentalEntity.isGym(), 
					rentalEntity.isAirConditioner(), 
					rentalEntity.isHardwoodFloors(), 
					rentalEntity.isFireplace(), 
					rentalEntity.isDishwasher(), 
					rentalEntity.isWalkInCloset(), 
					rentalEntity.isPool(), 
					rentalEntity.isHotTub(), 
					rentalEntity.isStorage(), 
					rentalEntity.getWalkInTime(), 
					rentalEntity.getWalkInDate(), 
					rentalEntity.getAmenities(), 
					rentalEntity.getRent(), 
					rentalEntity.getSecurityDeposit(),
					rentalEntity.getLeasePeriod(), 
					rentalEntity.isSecurityChk(), 
					rentalEntity.isBackgroundChk(), 
					rentalEntity.getImageLink(), 
					rentalEntity.getLink(), 
					rentalEntity.getCreatedAt(), 
					rentalEntity.getUpdatedAt(), 
					rentalEntity.getViewingTimes());
	}

	public RentalEnityIgPropDTO(Long id, String unitName, String unitType, Status status,
			String listingHeading, int fullRooms, int halfRooms, int bedRooms, int bathroomsAttach,
			int bathroomsSeparate, int sqFeet, String description, String petPolicy, boolean furnisher,
			boolean parkingGarage, boolean parkingOnStreet, boolean parkingDriveway, boolean parkingPrivateLot,
			boolean parkingDedicatedSpot, boolean parkingCovered, boolean outDoorSharedYard, boolean outDoorPrivateYard,
			boolean outDoorPatio, boolean outDoorBalcony, boolean outDoorGarden, String washerDrier, String basement,
			boolean wheelChair, boolean gym, boolean airConditioner, boolean hardwoodFloors, boolean fireplace,
			boolean dishwasher, boolean walkInCloset, boolean pool, boolean hotTub, boolean storage, String walkInTime,
			String walkInDate, String amenities, double rent, double securityDeposit, int leasePeriod,
			boolean securityChk, boolean backgroundChk, String imageLink, String link, Date createdAt, Date updatedAt,List<ViewingTime> viewingTimes) {
		super();
		this.id = id;
		this.unitName = unitName;
		this.unitType = unitType;
		this.status = status;
		this.listingHeading = listingHeading;
		this.fullRooms = fullRooms;
		this.halfRooms = halfRooms;
		this.bedRooms = bedRooms;
		this.bathroomsAttach = bathroomsAttach;
		this.bathroomsSeparate = bathroomsSeparate;
		this.sqFeet = sqFeet;
		this.description = description;
		this.petPolicy = petPolicy;
		this.furnisher = furnisher;
		this.parkingGarage = parkingGarage;
		this.parkingOnStreet = parkingOnStreet;
		this.parkingDriveway = parkingDriveway;
		this.parkingPrivateLot = parkingPrivateLot;
		this.parkingDedicatedSpot = parkingDedicatedSpot;
		this.parkingCovered = parkingCovered;
		this.outDoorSharedYard = outDoorSharedYard;
		this.outDoorPrivateYard = outDoorPrivateYard;
		this.outDoorPatio = outDoorPatio;
		this.outDoorBalcony = outDoorBalcony;
		this.outDoorGarden = outDoorGarden;
		this.washerDrier = washerDrier;
		this.basement = basement;
		this.wheelChair = wheelChair;
		this.gym = gym;
		this.airConditioner = airConditioner;
		this.hardwoodFloors = hardwoodFloors;
		this.fireplace = fireplace;
		this.dishwasher = dishwasher;
		this.walkInCloset = walkInCloset;
		this.pool = pool;
		this.hotTub = hotTub;
		this.storage = storage;
		this.walkInTime = walkInTime;
		this.walkInDate = walkInDate;
		this.amenities = amenities;
		this.rent = rent;
		this.securityDeposit = securityDeposit;
		this.leasePeriod = leasePeriod;
		this.securityChk = securityChk;
		this.backgroundChk = backgroundChk;
		this.imageLink = imageLink;
		this.link = link;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.viewingTimes=viewingTimes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getListingHeading() {
		return listingHeading;
	}

	public void setListingHeading(String listingHeading) {
		this.listingHeading = listingHeading;
	}

	public int getFullRooms() {
		return fullRooms;
	}

	public void setFullRooms(int fullRooms) {
		this.fullRooms = fullRooms;
	}

	public int getHalfRooms() {
		return halfRooms;
	}

	public void setHalfRooms(int halfRooms) {
		this.halfRooms = halfRooms;
	}

	public int getBedRooms() {
		return bedRooms;
	}

	public void setBedRooms(int bedRooms) {
		this.bedRooms = bedRooms;
	}

	public int getBathroomsAttach() {
		return bathroomsAttach;
	}

	public void setBathroomsAttach(int bathroomsAttach) {
		this.bathroomsAttach = bathroomsAttach;
	}

	public int getBathroomsSeparate() {
		return bathroomsSeparate;
	}

	public void setBathroomsSeparate(int bathroomsSeparate) {
		this.bathroomsSeparate = bathroomsSeparate;
	}

	public int getSqFeet() {
		return sqFeet;
	}

	public void setSqFeet(int sqFeet) {
		this.sqFeet = sqFeet;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPetPolicy() {
		return petPolicy;
	}

	public void setPetPolicy(String petPolicy) {
		this.petPolicy = petPolicy;
	}

	public boolean isFurnisher() {
		return furnisher;
	}

	public void setFurnisher(boolean furnisher) {
		this.furnisher = furnisher;
	}

	public boolean isParkingGarage() {
		return parkingGarage;
	}

	public void setParkingGarage(boolean parkingGarage) {
		this.parkingGarage = parkingGarage;
	}

	public boolean isParkingOnStreet() {
		return parkingOnStreet;
	}

	public void setParkingOnStreet(boolean parkingOnStreet) {
		this.parkingOnStreet = parkingOnStreet;
	}

	public boolean isParkingDriveway() {
		return parkingDriveway;
	}

	public void setParkingDriveway(boolean parkingDriveway) {
		this.parkingDriveway = parkingDriveway;
	}

	public boolean isParkingPrivateLot() {
		return parkingPrivateLot;
	}

	public void setParkingPrivateLot(boolean parkingPrivateLot) {
		this.parkingPrivateLot = parkingPrivateLot;
	}

	public boolean isParkingDedicatedSpot() {
		return parkingDedicatedSpot;
	}

	public void setParkingDedicatedSpot(boolean parkingDedicatedSpot) {
		this.parkingDedicatedSpot = parkingDedicatedSpot;
	}

	public boolean isParkingCovered() {
		return parkingCovered;
	}

	public void setParkingCovered(boolean parkingCovered) {
		this.parkingCovered = parkingCovered;
	}

	public boolean isOutDoorSharedYard() {
		return outDoorSharedYard;
	}

	public void setOutDoorSharedYard(boolean outDoorSharedYard) {
		this.outDoorSharedYard = outDoorSharedYard;
	}

	public boolean isOutDoorPrivateYard() {
		return outDoorPrivateYard;
	}

	public void setOutDoorPrivateYard(boolean outDoorPrivateYard) {
		this.outDoorPrivateYard = outDoorPrivateYard;
	}

	public boolean isOutDoorPatio() {
		return outDoorPatio;
	}

	public void setOutDoorPatio(boolean outDoorPatio) {
		this.outDoorPatio = outDoorPatio;
	}

	public boolean isOutDoorBalcony() {
		return outDoorBalcony;
	}

	public void setOutDoorBalcony(boolean outDoorBalcony) {
		this.outDoorBalcony = outDoorBalcony;
	}

	public boolean isOutDoorGarden() {
		return outDoorGarden;
	}

	public void setOutDoorGarden(boolean outDoorGarden) {
		this.outDoorGarden = outDoorGarden;
	}

	public String getWasherDrier() {
		return washerDrier;
	}

	public void setWasherDrier(String washerDrier) {
		this.washerDrier = washerDrier;
	}

	public String getBasement() {
		return basement;
	}

	public void setBasement(String basement) {
		this.basement = basement;
	}

	public boolean isWheelChair() {
		return wheelChair;
	}

	public void setWheelChair(boolean wheelChair) {
		this.wheelChair = wheelChair;
	}

	public boolean isGym() {
		return gym;
	}

	public void setGym(boolean gym) {
		this.gym = gym;
	}

	public boolean isAirConditioner() {
		return airConditioner;
	}

	public void setAirConditioner(boolean airConditioner) {
		this.airConditioner = airConditioner;
	}

	public boolean isHardwoodFloors() {
		return hardwoodFloors;
	}

	public void setHardwoodFloors(boolean hardwoodFloors) {
		this.hardwoodFloors = hardwoodFloors;
	}

	public boolean isFireplace() {
		return fireplace;
	}

	public void setFireplace(boolean fireplace) {
		this.fireplace = fireplace;
	}

	public boolean isDishwasher() {
		return dishwasher;
	}

	public void setDishwasher(boolean dishwasher) {
		this.dishwasher = dishwasher;
	}

	public boolean isWalkInCloset() {
		return walkInCloset;
	}

	public void setWalkInCloset(boolean walkInCloset) {
		this.walkInCloset = walkInCloset;
	}

	public boolean isPool() {
		return pool;
	}

	public void setPool(boolean pool) {
		this.pool = pool;
	}

	public boolean isHotTub() {
		return hotTub;
	}

	public void setHotTub(boolean hotTub) {
		this.hotTub = hotTub;
	}

	public boolean isStorage() {
		return storage;
	}

	public void setStorage(boolean storage) {
		this.storage = storage;
	}

	public String getWalkInTime() {
		return walkInTime;
	}

	public void setWalkInTime(String walkInTime) {
		this.walkInTime = walkInTime;
	}

	public String getWalkInDate() {
		return walkInDate;
	}

	public void setWalkInDate(String walkInDate) {
		this.walkInDate = walkInDate;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public double getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	public int getLeasePeriod() {
		return leasePeriod;
	}

	public void setLeasePeriod(int leasePeriod) {
		this.leasePeriod = leasePeriod;
	}

	public boolean isSecurityChk() {
		return securityChk;
	}

	public void setSecurityChk(boolean securityChk) {
		this.securityChk = securityChk;
	}

	public boolean isBackgroundChk() {
		return backgroundChk;
	}

	public void setBackgroundChk(boolean backgroundChk) {
		this.backgroundChk = backgroundChk;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<ViewingTime> getViewingTimes() {
		return viewingTimes;
	}

	public void setViewingTimes(List<ViewingTime> viewingTimes) {
		this.viewingTimes = viewingTimes;
	}

}
