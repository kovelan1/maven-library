package com.axallant.rentcloud.application;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name = "application")
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(mappedBy = "application")
	private List<Apply> apply;
	
	@OneToMany(mappedBy = "application")
	private List<OtherOccupant> occupants;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
			mappedBy = "application")
	private BusinessApplication businessApplication;
	
	private long rentalEntityId;
	private double rent;
	private boolean pets;
	private int petCount;
	private String creditCheck;
	private String securityCheck;
	private String applicationForm;
	private String occupant;
	private int leaseTerm;
	private Date moveInDate;
	@Enumerated(EnumType.STRING)
	private ApplicationStatus status;
	private int totalOccupants;
	
	private boolean  hydro;
    private boolean  gas;
    private boolean  heat;
    private boolean  hotWaterHeater;
    private boolean  hotWaterTank;
    private boolean  internet;
    private boolean  cableTv;
    private boolean  other;
    private boolean  water;
    private boolean contractCreated;
    private long contractId;
	
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;


    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
	
	public Application() {}


	public long getId() {
		return id;
	}

	public void setId(long applicationid) {
		this.id = applicationid;
	}


	public List<Apply> getApply() {
		return apply;
	}

	

	public List<OtherOccupant> getOccupants() {
		return occupants;
	}


	public void setOccupants(List<OtherOccupant> occupants) {
		this.occupants = occupants;
	}


	public void setApply(List<Apply> apply) {
		this.apply = apply;
	}


	public long getRentalEntityId() {
		return rentalEntityId;
	}


	public void setRentalEntityId(long rentalEntityId) {
		this.rentalEntityId = rentalEntityId;
	}


	public double getRent() {
		return rent;
	}


	public void setRent(double rent) {
		this.rent = rent;
	}


	public boolean isPets() {
		return pets;
	}


	public void setPets(boolean pets) {
		this.pets = pets;
	}


	public int getPetCount() {
		return petCount;
	}


	public void setPetCount(int petCount) {
		this.petCount = petCount;
	}


	public String getCreditCheck() {
		return creditCheck;
	}


	public void setCreditCheck(String creditCheck) {
		this.creditCheck = creditCheck;
	}


	public String getSecurityCheck() {
		return securityCheck;
	}


	public void setSecurityCheck(String securityCheck) {
		this.securityCheck = securityCheck;
	}


	public String getApplicationForm() {
		return applicationForm;
	}


	public void setApplicationForm(String applicationForm) {
		this.applicationForm = applicationForm;
	}


	public String getOccupant() {
		return occupant;
	}


	public void setOccupant(String occupant) {
		this.occupant = occupant;
	}


	public int getLeaseTerm() {
		return leaseTerm;
	}


	public void setLeaseTerm(int leaseTerm) {
		this.leaseTerm = leaseTerm;
	}


	public Date getMoveInDate() {
		return moveInDate;
	}


	public void setMoveInDate(Date moveInDate) {
		this.moveInDate = moveInDate;
	}


	public ApplicationStatus getStatus() {
		return status;
	}


	public void setStatus(ApplicationStatus status) {
		this.status = status;
	}


	public int getTotalOccupants() {
		return totalOccupants;
	}


	public void setTotalOccupants(int totalOccupants) {
		this.totalOccupants = totalOccupants;
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


	public boolean isHydro() {
		return hydro;
	}


	public void setHydro(boolean hydro) {
		this.hydro = hydro;
	}


	public boolean isGas() {
		return gas;
	}


	public void setGas(boolean gas) {
		this.gas = gas;
	}


	public boolean isHeat() {
		return heat;
	}


	public void setHeat(boolean heat) {
		this.heat = heat;
	}


	public boolean isHotWaterHeater() {
		return hotWaterHeater;
	}


	public void setHotWaterHeater(boolean hotWaterHeater) {
		this.hotWaterHeater = hotWaterHeater;
	}


	public boolean isHotWaterTank() {
		return hotWaterTank;
	}


	public void setHotWaterTank(boolean hotWaterTank) {
		this.hotWaterTank = hotWaterTank;
	}


	public boolean isInternet() {
		return internet;
	}


	public void setInternet(boolean internet) {
		this.internet = internet;
	}


	public boolean isCableTv() {
		return cableTv;
	}


	public void setCableTv(boolean cableTv) {
		this.cableTv = cableTv;
	}


	public boolean isOther() {
		return other;
	}


	public void setOther(boolean other) {
		this.other = other;
	}


	public boolean isWater() {
		return water;
	}


	public void setWater(boolean water) {
		this.water = water;
	}


	public BusinessApplication getBusinessApplication() {
		return businessApplication;
	}


	public void setBusinessApplication(BusinessApplication businessApplication) {
		this.businessApplication = businessApplication;
	}


	public boolean isContractCreated() {
		return contractCreated;
	}


	public void setContractCreated(boolean contractCreated) {
		this.contractCreated = contractCreated;
	}


	public long getContractId() {
		return contractId;
	}


	public void setContractId(long contractId) {
		this.contractId = contractId;
	}

	
	
	
}

