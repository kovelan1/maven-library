package com.axallant.rentcloud.propertiy;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "rentalEntity")
public class RentalEntity implements Serializable{

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "property_id")
	private Property property;
	
	@OneToMany(mappedBy = "rentalEntity", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<ViewingTime> viewingTimes;
	
	private String unitName;
	private String unitType;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	private String listingHeading;
	private Date availableFrom;
	private String fullRooms;
	private String halfRooms;
	private String bedRooms;
	private String bathroomsAttach;
	private String bathroomsSeparate;
	private String sqFeet;
	@Column(columnDefinition = "LONGTEXT")
	private String description;
	private String petPolicy;
	private boolean smoking;
	private boolean furnisher;
	private boolean parkingGarage;
	private boolean parkingOnStreet;
	private boolean parkingDriveway;
	private boolean parkingPrivateLot;
	private boolean parkingDedicatedSpot;
	private boolean parking;
	private boolean parkingCovered;
	
	@Column(columnDefinition = "LONGTEXT")
	private String parkingDescription;
	
	private double parkingFee;
	
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
	private boolean gas;
	private boolean laundry ;
	private boolean microwave ;
	private boolean refrigerator ;
	private boolean oven;
	private boolean guestParking;
	private boolean freezer;
	private boolean trashCompactor;
	private boolean garbageDisposal;
	private boolean coolingCentral;
	private boolean coolingEvaporative;
	private boolean coolingGeothermal;
	private boolean coolingRefrigeration;
	private boolean coolingSolar;
	private boolean coolingWall;
	private boolean coolingOther;
	private boolean heatingBaseboard;
	private boolean heatingForcedAir;
	private boolean heatingGeothermal;
	private boolean heatingHeatPump;
	private boolean heatingRadiant;
	private boolean heatingStove;
	private boolean heatingWall;
	private boolean heatingOther;
	private String laundryType;
	
	
	private String walkInTime;
	private String walkInDate;
	private String amenities;
	private double rent;
	private double securityDeposit;
	private double keyDeposit;
	private String leasePeriod;
	private boolean securityChk;
	private boolean backgroundChk;
	private String imageLink;
	private String link;
	private long contractId;
	
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;


    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
	
	public RentalEntity() {}


	






	public RentalEntity(Long id, Property property, List<ViewingTime> viewingTimes, String unitName, String unitType,
			Status status, String listingHeading, Date availableFrom, String fullRooms, String halfRooms,
			String bedRooms, String bathroomsAttach, String bathroomsSeparate, String sqFeet, String description,
			String petPolicy, boolean smoking, boolean furnisher, boolean parkingGarage, boolean parkingOnStreet,
			boolean parkingDriveway, boolean parkingPrivateLot, boolean parkingDedicatedSpot, boolean parking,
			boolean parkingCovered, String parkingDescription, double parkingFee, boolean outDoorSharedYard,
			boolean outDoorPrivateYard, boolean outDoorPatio, boolean outDoorBalcony, boolean outDoorGarden,
			String washerDrier, String basement, boolean wheelChair, boolean gym, boolean airConditioner,
			boolean hardwoodFloors, boolean fireplace, boolean dishwasher, boolean walkInCloset, boolean pool,
			boolean hotTub, boolean storage, boolean gas, boolean laundry, boolean microwave, boolean refrigerator,
			boolean oven, boolean guestParking, boolean freezer, boolean trashCompactor, boolean garbageDisposal,
			boolean coolingCentral, boolean coolingEvaporative, boolean coolingGeothermal, boolean coolingRefrigeration,
			boolean coolingSolar, boolean coolingWall, boolean coolingOther, boolean heatingBaseboard,
			boolean heatingForcedAir, boolean heatingGeothermal, boolean heatingHeatPump, boolean heatingRadiant,
			boolean heatingStove, boolean heatingWall, boolean heatingOther, String laundryType, String walkInTime,
			String walkInDate, String amenities, double rent, double securityDeposit, double keyDeposit,
			String leasePeriod, boolean securityChk, boolean backgroundChk, String imageLink, String link,
			Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.property = property;
		this.viewingTimes = viewingTimes;
		this.unitName = unitName;
		this.unitType = unitType;
		this.status = status;
		this.listingHeading = listingHeading;
		this.availableFrom = availableFrom;
		this.fullRooms = fullRooms;
		this.halfRooms = halfRooms;
		this.bedRooms = bedRooms;
		this.bathroomsAttach = bathroomsAttach;
		this.bathroomsSeparate = bathroomsSeparate;
		this.sqFeet = sqFeet;
		this.description = description;
		this.petPolicy = petPolicy;
		this.smoking = smoking;
		this.furnisher = furnisher;
		this.parkingGarage = parkingGarage;
		this.parkingOnStreet = parkingOnStreet;
		this.parkingDriveway = parkingDriveway;
		this.parkingPrivateLot = parkingPrivateLot;
		this.parkingDedicatedSpot = parkingDedicatedSpot;
		this.parking = parking;
		this.parkingCovered = parkingCovered;
		this.parkingDescription = parkingDescription;
		this.parkingFee = parkingFee;
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
		this.gas = gas;
		this.laundry = laundry;
		this.microwave = microwave;
		this.refrigerator = refrigerator;
		this.oven = oven;
		this.guestParking = guestParking;
		this.freezer = freezer;
		this.trashCompactor = trashCompactor;
		this.garbageDisposal = garbageDisposal;
		this.coolingCentral = coolingCentral;
		this.coolingEvaporative = coolingEvaporative;
		this.coolingGeothermal = coolingGeothermal;
		this.coolingRefrigeration = coolingRefrigeration;
		this.coolingSolar = coolingSolar;
		this.coolingWall = coolingWall;
		this.coolingOther = coolingOther;
		this.heatingBaseboard = heatingBaseboard;
		this.heatingForcedAir = heatingForcedAir;
		this.heatingGeothermal = heatingGeothermal;
		this.heatingHeatPump = heatingHeatPump;
		this.heatingRadiant = heatingRadiant;
		this.heatingStove = heatingStove;
		this.heatingWall = heatingWall;
		this.heatingOther = heatingOther;
		this.laundryType = laundryType;
		this.walkInTime = walkInTime;
		this.walkInDate = walkInDate;
		this.amenities = amenities;
		this.rent = rent;
		this.securityDeposit = securityDeposit;
		this.keyDeposit = keyDeposit;
		this.leasePeriod = leasePeriod;
		this.securityChk = securityChk;
		this.backgroundChk = backgroundChk;
		this.imageLink = imageLink;
		this.link = link;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}









	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
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

	public String getLeasePeriod() {
		return leasePeriod;
	}

	public void setLeasePeriod(String leasePeriod) {
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

	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public String getParkingDescription() {
		return parkingDescription;
	}

	public void setParkingDescription(String parkingDescription) {
		this.parkingDescription = parkingDescription;
	}

	public double getParkingFee() {
		return parkingFee;
	}

	public void setParkingFee(double parkingFee) {
		this.parkingFee = parkingFee;
	}

	public boolean isGas() {
		return gas;
	}

	public void setGas(boolean gas) {
		this.gas = gas;
	}

	public boolean isLaundry() {
		return laundry;
	}

	public void setLaundry(boolean laundry) {
		this.laundry = laundry;
	}

	public boolean isGuestParking() {
		return guestParking;
	}

	public void setGuestParking(boolean guestParking) {
		this.guestParking = guestParking;
	}

	public double getKeyDeposit() {
		return keyDeposit;
	}

	public void setKeyDeposit(double keyDeposit) {
		this.keyDeposit = keyDeposit;
	}



	public Date getAvailableFrom() {
		return availableFrom;
	}



	public void setAvailableFrom(Date availableFrom) {
		this.availableFrom = availableFrom;
	}



	public String getFullRooms() {
		return fullRooms;
	}



	public void setFullRooms(String fullRooms) {
		this.fullRooms = fullRooms;
	}



	public String getHalfRooms() {
		return halfRooms;
	}



	public void setHalfRooms(String halfRooms) {
		this.halfRooms = halfRooms;
	}



	public String getBedRooms() {
		return bedRooms;
	}



	public void setBedRooms(String bedRooms) {
		this.bedRooms = bedRooms;
	}



	public String getBathroomsAttach() {
		return bathroomsAttach;
	}



	public void setBathroomsAttach(String bathroomsAttach) {
		this.bathroomsAttach = bathroomsAttach;
	}



	public String getBathroomsSeparate() {
		return bathroomsSeparate;
	}



	public void setBathroomsSeparate(String bathroomsSeparate) {
		this.bathroomsSeparate = bathroomsSeparate;
	}



	public String getSqFeet() {
		return sqFeet;
	}



	public void setSqFeet(String sqFeet) {
		this.sqFeet = sqFeet;
	}


	public boolean isMicrowave() {
		return microwave;
	}


	public void setMicrowave(boolean microwave) {
		this.microwave = microwave;
	}


	public boolean isRefrigerator() {
		return refrigerator;
	}


	public void setRefrigerator(boolean refrigerator) {
		this.refrigerator = refrigerator;
	}


	public boolean isOven() {
		return oven;
	}


	public void setOven(boolean oven) {
		this.oven = oven;
	}


	public String getLaundryType() {
		return laundryType;
	}


	public void setLaundryType(String laundryType) {
		this.laundryType = laundryType;
	}









	public boolean isFreezer() {
		return freezer;
	}









	public void setFreezer(boolean freezer) {
		this.freezer = freezer;
	}









	public boolean isTrashCompactor() {
		return trashCompactor;
	}









	public void setTrashCompactor(boolean trashCompactor) {
		this.trashCompactor = trashCompactor;
	}









	public boolean isGarbageDisposal() {
		return garbageDisposal;
	}









	public void setGarbageDisposal(boolean garbageDisposal) {
		this.garbageDisposal = garbageDisposal;
	}









	public boolean isCoolingCentral() {
		return coolingCentral;
	}









	public void setCoolingCentral(boolean coolingCentral) {
		this.coolingCentral = coolingCentral;
	}









	public boolean isCoolingEvaporative() {
		return coolingEvaporative;
	}









	public void setCoolingEvaporative(boolean coolingEvaporative) {
		this.coolingEvaporative = coolingEvaporative;
	}









	public boolean isCoolingGeothermal() {
		return coolingGeothermal;
	}









	public void setCoolingGeothermal(boolean coolingGeothermal) {
		this.coolingGeothermal = coolingGeothermal;
	}









	public boolean isCoolingRefrigeration() {
		return coolingRefrigeration;
	}









	public void setCoolingRefrigeration(boolean coolingRefrigeration) {
		this.coolingRefrigeration = coolingRefrigeration;
	}









	public boolean isCoolingSolar() {
		return coolingSolar;
	}









	public void setCoolingSolar(boolean coolingSolar) {
		this.coolingSolar = coolingSolar;
	}









	public boolean isCoolingWall() {
		return coolingWall;
	}









	public void setCoolingWall(boolean coolingWall) {
		this.coolingWall = coolingWall;
	}









	public boolean isCoolingOther() {
		return coolingOther;
	}









	public void setCoolingOther(boolean coolingOther) {
		this.coolingOther = coolingOther;
	}









	public boolean isHeatingBaseboard() {
		return heatingBaseboard;
	}









	public void setHeatingBaseboard(boolean heatingBaseboard) {
		this.heatingBaseboard = heatingBaseboard;
	}









	public boolean isHeatingForcedAir() {
		return heatingForcedAir;
	}









	public void setHeatingForcedAir(boolean heatingForcedAir) {
		this.heatingForcedAir = heatingForcedAir;
	}









	public boolean isHeatingGeothermal() {
		return heatingGeothermal;
	}









	public void setHeatingGeothermal(boolean heatingGeothermal) {
		this.heatingGeothermal = heatingGeothermal;
	}









	public boolean isHeatingHeatPump() {
		return heatingHeatPump;
	}









	public void setHeatingHeatPump(boolean heatingHeatPump) {
		this.heatingHeatPump = heatingHeatPump;
	}









	public boolean isHeatingRadiant() {
		return heatingRadiant;
	}









	public void setHeatingRadiant(boolean heatingRadiant) {
		this.heatingRadiant = heatingRadiant;
	}









	public boolean isHeatingStove() {
		return heatingStove;
	}









	public void setHeatingStove(boolean heatingStove) {
		this.heatingStove = heatingStove;
	}









	public boolean isHeatingWall() {
		return heatingWall;
	}









	public void setHeatingWall(boolean heatingWall) {
		this.heatingWall = heatingWall;
	}









	public boolean isHeatingOther() {
		return heatingOther;
	}









	public void setHeatingOther(boolean heatingOther) {
		this.heatingOther = heatingOther;
	}









	public long getContractId() {
		return contractId;
	}









	public void setContractId(long contractId) {
		this.contractId = contractId;
	}

	
	
	
}
