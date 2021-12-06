package com.axallant.rentcloud.contract;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "contract")
	private List<Tenant> tenants;
	
	private long rentalEntityId;
	private long applicationId;
	private Date startDate;
	private Date endDate;
	private String agreementType; //fixed monthly other
	private String otherAgreementType; 
	private double rent;
	private int rentCollectionDay;
	private String rentPaidOnPeriod;  // in ontrio contract No.5 (month , etc...) // if month fill the field month
	
	private boolean isSecurityDeposit;
	private double securityDeposit;
	private double keyDeposit;
	@Column(columnDefinition = "LONGTEXT")
	private String keyDepositDescription;
	
	private String moveInCheckList;
	private String moveOutCheckList;
	
	@Enumerated(EnumType.STRING)
	private ContractStatus status;
	
	private boolean parkingAcce;
	
	@Column(columnDefinition = "LONGTEXT")
	private String parkingDescription;
	
	private boolean condominium;
	private String condominiumLink;
	
	private boolean indoorSmoking;
	private boolean indoorVaping;
	@Column(columnDefinition = "LONGTEXT") 
	private String smokingDescription; 
	
	
	private boolean emailOption;
	@Column(columnDefinition = "LONGTEXT") 
	private String documentEmails;
	
	private boolean landlordEmergencyContactOption;
	private String landlordEmergencyContact;
	
	private double parkingFee;
	
	private String otherRentFee1Name;
	private double otherRentFee1;
	private String otherRentFee2Name;
	private double otherRentFee2;
	private String otherRentFee3Name;
	private double otherRentFee3;
	
	private boolean isRentDiscount;
	private double rentDiscount;
	private String rentDiscountType;  //fixed or percentage
	
	
	
	@Column(columnDefinition = "LONGTEXT") 
	private String rentDiscountDescription; 
	
	private String rentPayableTo;
	private String rentPayableMethod;
	
	private String electricityResponsible; //landlord or tenant
	private String heatResponsible;
	private String waterResponsible;
	@Column(columnDefinition = "LONGTEXT") 
	private String otherResponsible; 
	
	
	
	private boolean moveEarly;
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
	private String laundryChargeType ;
	private boolean guestParking;
	private String guestParkingType; 
	private String serviceType1;
	private String serviceType2;
	private String serviceType3;
	
	@Column(columnDefinition = "LONGTEXT") 
	private String serviceDescription; 
	
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

	
	public List<Tenant> getTenants() {
		return tenants;
	}


	public void setTenants(List<Tenant> tenants) {
		this.tenants = tenants;
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



	public String getAgreementType() {
		return agreementType;
	}



	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}



	public String getOtherAgreementType() {
		return otherAgreementType;
	}



	public void setOtherAgreementType(String otherAgreementType) {
		this.otherAgreementType = otherAgreementType;
	}



	public int getRentCollectionDay() {
		return rentCollectionDay;
	}



	public void setRentCollectionDay(int rentCollectionDay) {
		this.rentCollectionDay = rentCollectionDay;
	}



	public String getRentPaidOnPeriod() {
		return rentPaidOnPeriod;
	}



	public void setRentPaidOnPeriod(String rentPaidOnPeriod) {
		this.rentPaidOnPeriod = rentPaidOnPeriod;
	}



	public double getKeyDeposit() {
		return keyDeposit;
	}



	public void setKeyDeposit(double keyDeposit) {
		this.keyDeposit = keyDeposit;
	}



	public String getKeyDepositDescription() {
		return keyDepositDescription;
	}



	public void setKeyDepositDescription(String keyDepositDescription) {
		this.keyDepositDescription = keyDepositDescription;
	}



	public String getParkingDescription() {
		return parkingDescription;
	}



	public void setParkingDescription(String parkingDescription) {
		this.parkingDescription = parkingDescription;
	}



	public boolean isCondominium() {
		return condominium;
	}



	public void setCondominium(boolean condominium) {
		this.condominium = condominium;
	}



	public String getCondominiumLink() {
		return condominiumLink;
	}



	public void setCondominiumLink(String condominiumLink) {
		this.condominiumLink = condominiumLink;
	}



	public String getSmokingDescription() {
		return smokingDescription;
	}



	public void setSmokingDescription(String smokingDescription) {
		this.smokingDescription = smokingDescription;
	}



	public boolean isEmailOption() {
		return emailOption;
	}



	public void setEmailOption(boolean emailOption) {
		this.emailOption = emailOption;
	}



	public String getDocumentEmails() {
		return documentEmails;
	}



	public void setDocumentEmails(String documentEmails) {
		this.documentEmails = documentEmails;
	}



	public boolean isLandlordEmergencyContactOption() {
		return landlordEmergencyContactOption;
	}



	public void setLandlordEmergencyContactOption(boolean landlordEmergencyContactOption) {
		this.landlordEmergencyContactOption = landlordEmergencyContactOption;
	}



	public String getLandlordEmergencyContact() {
		return landlordEmergencyContact;
	}



	public void setLandlordEmergencyContact(String landlordEmergencyContact) {
		this.landlordEmergencyContact = landlordEmergencyContact;
	}



	public double getParkingFee() {
		return parkingFee;
	}



	public void setParkingFee(double parkingFee) {
		this.parkingFee = parkingFee;
	}



	public String getOtherRentFee1Name() {
		return otherRentFee1Name;
	}



	public void setOtherRentFee1Name(String otherRentFee1Name) {
		this.otherRentFee1Name = otherRentFee1Name;
	}



	public double getOtherRentFee1() {
		return otherRentFee1;
	}



	public void setOtherRentFee1(double otherRentFee1) {
		this.otherRentFee1 = otherRentFee1;
	}



	public String getOtherRentFee2Name() {
		return otherRentFee2Name;
	}



	public void setOtherRentFee2Name(String otherRentFee2Name) {
		this.otherRentFee2Name = otherRentFee2Name;
	}



	public double getOtherRentFee2() {
		return otherRentFee2;
	}



	public void setOtherRentFee2(double otherRentFee2) {
		this.otherRentFee2 = otherRentFee2;
	}



	public String getOtherRentFee3Name() {
		return otherRentFee3Name;
	}



	public void setOtherRentFee3Name(String otherRentFee3Name) {
		this.otherRentFee3Name = otherRentFee3Name;
	}



	public double getOtherRentFee3() {
		return otherRentFee3;
	}



	public void setOtherRentFee3(double otherRentFee3) {
		this.otherRentFee3 = otherRentFee3;
	}



	public boolean isRentDiscount() {
		return isRentDiscount;
	}



	public void setIsRentDiscount(boolean isRentDiscount) {
		this.isRentDiscount = isRentDiscount;
	}



	public double getRentDiscount() {
		return rentDiscount;
	}



	public void setRentDiscount(double rentDiscount) {
		this.rentDiscount = rentDiscount;
	}



	public String getRentDiscountType() {
		return rentDiscountType;
	}



	public void setRentDiscountType(String rentDiscountType) {
		this.rentDiscountType = rentDiscountType;
	}



	public String getRentDiscountDescription() {
		return rentDiscountDescription;
	}



	public void setRentDiscountDescription(String rentDiscountDescription) {
		this.rentDiscountDescription = rentDiscountDescription;
	}



	public String getRentPayableTo() {
		return rentPayableTo;
	}



	public void setRentPayableTo(String rentPayableTo) {
		this.rentPayableTo = rentPayableTo;
	}



	public String getRentPayableMethod() {
		return rentPayableMethod;
	}



	public void setRentPayableMethod(String rentPayableMethod) {
		this.rentPayableMethod = rentPayableMethod;
	}



	public String getElectricityResponsible() {
		return electricityResponsible;
	}



	public void setElectricityResponsible(String electricityResponsible) {
		this.electricityResponsible = electricityResponsible;
	}



	public String getHeatResponsible() {
		return heatResponsible;
	}



	public void setHeatResponsible(String heatResponsible) {
		this.heatResponsible = heatResponsible;
	}



	public String getWaterResponsible() {
		return waterResponsible;
	}



	public void setWaterResponsible(String waterResponsible) {
		this.waterResponsible = waterResponsible;
	}



	public String getOtherResponsible() {
		return otherResponsible;
	}



	public void setOtherResponsible(String otherResponsible) {
		this.otherResponsible = otherResponsible;
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



	public String getLaundryChargeType() {
		return laundryChargeType;
	}



	public void setLaundryChargeType(String laundryChargeType) {
		this.laundryChargeType = laundryChargeType;
	}



	public boolean isGuestParking() {
		return guestParking;
	}



	public void setGuestParking(boolean guestParking) {
		this.guestParking = guestParking;
	}



	public String getGuestParkingType() {
		return guestParkingType;
	}



	public void setGuestParkingType(String guestParkingType) {
		this.guestParkingType = guestParkingType;
	}



	public String getServiceType1() {
		return serviceType1;
	}



	public void setServiceType1(String serviceType1) {
		this.serviceType1 = serviceType1;
	}



	public String getServiceType2() {
		return serviceType2;
	}



	public void setServiceType2(String serviceType2) {
		this.serviceType2 = serviceType2;
	}



	public String getServiceType3() {
		return serviceType3;
	}



	public void setServiceType3(String serviceType3) {
		this.serviceType3 = serviceType3;
	}



	public String getServiceDescription() {
		return serviceDescription;
	}



	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}



	
    
}

