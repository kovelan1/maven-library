package com.axallant.rentcloud.contract;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "contract")
public class Contract {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long contractId;
	
	private String tenantId;
	private long rentalEntityId;
	private long applicationId;
	private Date startDate;
	private Date endDate;
	private double rent;
	private int rentCollectionDate;
	private double securityDeposit;
	private String moveInCheckList;
	private String moveOutCheckList;
	@Enumerated(EnumType.STRING)
	private ContractStatus status;
	
	private boolean parkingAcce;
	private boolean indoorSmoking;
	private boolean moveEarly;
	private boolean indoorVaping;
	private String bankName;
	private String bankBranch;
	private String bankAddress;
	private boolean improvement;
	private boolean subLease;
	private boolean keyLosePayment;
	private boolean isInspection;
	private boolean isPetCharge;
	@Enumerated(EnumType.STRING)
	private PetChargeMethod petChargeMethod;
	
	private double petAmount;
	private boolean utilityResposible;
	private boolean isTenantMaintenance;
	private boolean isTenantInsurance;
	private boolean islateFee;
	@Enumerated(EnumType.STRING)
	private LateFeeCharging  lateFeeCharging;
	private int gracePeriod;
	private double lateFeeAmount;
	private boolean isSecurityDeposit;
	private boolean subscription;
	private String landLordId;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;


    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    public Contract() {}

    
    
	public String getLandLordId() {
		return landLordId;
	}



	public void setLandLordId(String landLordId) {
		this.landLordId = landLordId;
	}



	public boolean isSubscription() {
		return subscription;
	}


	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}


	public long getContractId() {
		return contractId;
	}

	public void setContractId(long contractId) {
		this.contractId = contractId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public long getRentalEntityId() {
		return rentalEntityId;
	}

	public void setRentalEntityId(long rentalEntityId) {
		this.rentalEntityId = rentalEntityId;
	}

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public int getRentCollectionDate() {
		return rentCollectionDate;
	}

	public void setRentCollectionDate(int rentCollectionDate) {
		this.rentCollectionDate = rentCollectionDate;
	}

	public double getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	public String getMoveInCheckList() {
		return moveInCheckList;
	}

	public void setMoveInCheckList(String moveInCheckList) {
		this.moveInCheckList = moveInCheckList;
	}

	public String getMoveOutCheckList() {
		return moveOutCheckList;
	}

	public void setMoveOutCheckList(String moveOutCheckList) {
		this.moveOutCheckList = moveOutCheckList;
	}

	public ContractStatus getStatus() {
		return status;
	}

	public void setStatus(ContractStatus status) {
		this.status = status;
	}

	public boolean isParkingAcce() {
		return parkingAcce;
	}

	public void setParkingAcce(boolean parkingAcce) {
		this.parkingAcce = parkingAcce;
	}

	public boolean isIndoorSmoking() {
		return indoorSmoking;
	}

	public void setIndoorSmoking(boolean indoorSmoking) {
		this.indoorSmoking = indoorSmoking;
	}

	public boolean isMoveEarly() {
		return moveEarly;
	}

	public void setMoveEarly(boolean moveEarly) {
		this.moveEarly = moveEarly;
	}

	public boolean isIndoorVaping() {
		return indoorVaping;
	}

	public void setIndoorVaping(boolean indoorVaping) {
		this.indoorVaping = indoorVaping;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public boolean isImprovement() {
		return improvement;
	}

	public void setImprovement(boolean improvement) {
		this.improvement = improvement;
	}

	public boolean isSubLease() {
		return subLease;
	}

	public void setSubLease(boolean subLease) {
		this.subLease = subLease;
	}

	public boolean isKeyLosePayment() {
		return keyLosePayment;
	}

	public void setKeyLosePayment(boolean keyLosePayment) {
		this.keyLosePayment = keyLosePayment;
	}

	public boolean isInspection() {
		return isInspection;
	}

	public void setInspection(boolean isInspection) {
		this.isInspection = isInspection;
	}

	public boolean isPetCharge() {
		return isPetCharge;
	}

	public void setPetCharge(boolean isPetCharge) {
		this.isPetCharge = isPetCharge;
	}

	public PetChargeMethod getPetChargeMethod() {
		return petChargeMethod;
	}

	public void setPetChargeMethod(PetChargeMethod petChargeMethod) {
		this.petChargeMethod = petChargeMethod;
	}

	public double getPetAmount() {
		return petAmount;
	}

	public void setPetAmount(double petAmount) {
		this.petAmount = petAmount;
	}

	public boolean isUtilityResposible() {
		return utilityResposible;
	}

	public void setUtilityResposible(boolean utilityResposible) {
		this.utilityResposible = utilityResposible;
	}

	public boolean isTenantMaintenance() {
		return isTenantMaintenance;
	}

	public void setTenantMaintenance(boolean isTenantMaintenance) {
		this.isTenantMaintenance = isTenantMaintenance;
	}

	public boolean isTenantInsurance() {
		return isTenantInsurance;
	}

	public void setTenantInsurance(boolean isTenantInsurance) {
		this.isTenantInsurance = isTenantInsurance;
	}

	public boolean isIslateFee() {
		return islateFee;
	}

	public void setIslateFee(boolean islateFee) {
		this.islateFee = islateFee;
	}

	public LateFeeCharging getLateFeeCharging() {
		return lateFeeCharging;
	}

	public void setLateFeeCharging(LateFeeCharging lateFeeCharging) {
		this.lateFeeCharging = lateFeeCharging;
	}

	public int getGracePeriod() {
		return gracePeriod;
	}

	public void setGracePeriod(int gracePeriod) {
		this.gracePeriod = gracePeriod;
	}

	public double getLateFeeAmount() {
		return lateFeeAmount;
	}

	public void setLateFeeAmount(double lateFeeAmount) {
		this.lateFeeAmount = lateFeeAmount;
	}

	public boolean getIsSecurityDeposit() {
		return isSecurityDeposit;
	}

	public void setIsSecurityDeposit(boolean isSecurityDeposit) {
		this.isSecurityDeposit = isSecurityDeposit;
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



	public String getBankBranch() {
		return bankBranch;
	}



	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}



	
	
	
	
    
    
}

