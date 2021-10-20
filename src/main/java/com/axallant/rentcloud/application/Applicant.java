package com.axallant.rentcloud.application;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Applicant {

	@Id
	private String username;
	
	@OneToMany(mappedBy = "applicant")
	private List<Apply> apply;
	
	private ApplicationType type;
	
	private String drivingLicNo;
	private String emergencyNo;
	private String ssn;
	private Date dob;
	private String otherName;
	private String gender;
	
	private String resPresentAddress;
	private String resPresentCity;
	private String resPresentState;
	private String resPresentZip;
	private String resPresentPhone;
	private String resPresentFax;
	private double resPresentRent;
	private Date resPresentFrom;
	private Date resPresentTo;
	private String resPresentOwnRent;
	private String resPresentLandlord;
	private String resPresentLandlordEmail;
	private String resPresentLandlordTp;
	private String resPresentLandlordFax;
	private String resPresentApartment;
	private String resPresentUnitType;
	private boolean resPresentMortgage;
	private String resPresentReasonLeaving;
	private String resPresentLandlordIDProof;

	private String resPreviousAddress;
	private String resPreviousCity;
	private String resPreviousState;
	private String resPreviousZip;
	private double resPreviousRent;
	private Date resPreviousFrom;
	private Date resPreviousTo;
	private String resPreviousOwnRent;
	private String resPreviousLandlord;
	private String resPreviousLandlordEmail;
	private String resPreviousLandlordTp;
	private String resPreviousLandlordFax;
	private String resPreviousApartment;
	private String resPreviousUnitType;
	private boolean resPreviousMortgage;
	private String resPreviousReasonLeaving;

	private String empPresentEmployed;
	private String empPresentEmail;
	private String empPresentAddress;
	private String empPresentCity;
	private String empPresentState;
	private String empPresentZip;
	private String empPresentPhone;
	private double empPresentSalary;
	private Date empPresentFrom;
	private Date empPresentTo;
	private String empPresentPosition;
	private double empPresentAnnualIncome;
	
	private String empPreviousEmployed;
	private String empPreviousEmail;
	private String empPreviousAddress;
	private String empPreviousCity;
	private String empPreviousState;
	private String empPreviousZip;
	private String empPreviousPhone;
	private double empPreviousSalary;
	private Date empPreviousFrom;
	private Date empPreviousTo;
	private String empPreviousPosition;
	private double empPreviousAnnualIncome;
	
	private String emp2PreviousEmployed;
	private String emp2PreviousEmail;
	private String emp2PreviousAddress;
	private String emp2PreviousCity;
	private String emp2PreviousState;
	private String emp2PreviousZip;
	private String emp2PreviousPhone;
	private double emp2PreviousSalary;
	private Date emp2PreviousFrom;
	private Date emp2PreviousTo;
	private String emp2PreviousPosition;
	private double emp2PreviousAnnualIncome;
	
	private String spousesEmployer;
	private String spousesEmployerAddress;
	private double spousesIncome;
	
	private String referenceName;
	private String referenceAddress;
	private String referenceTelephone;
	
	private String referenceName2;
	private String referenceAddress2;
	private String referenceTelephone2;
	
	private String emergencyContactName;
	private String emergencyContactPhone;
	private String emergencyContactFax;
	private String emergencyContactRelation;
	
	private String primaryBankName;
	private String primaryBankBranch;
	private String primaryBankAccType;
	private String primaryBankAccNo;
	private String secondaryBankName;
	private String secondaryBankBranch;
	private String secondaryBankAccType;
	private String secondaryBankAccNo;   
	
	private String relativeNum;
	private String relativeName;
	private String additionalIncome;
	private boolean bankruptcy;
	private boolean crimeCheck;
	private boolean evicted; 
	private boolean smoke;
	private String homePhone;
	
	private int resPresentYears;
	private int resPresentMonths;
	private int resPreviousYear;
	private int resPreviousMonth;
	
	private int empPresentYears;
	private int empPresentMonths;
	private int empPreviousYear;
	private int empPreviousMonth;
	
	private boolean vehicle;
	private String vehicleType;
	private String vehicleMadeBy;
	private String vehicleModel;
	private String vehicleYear;
	private String vehicleLicenseNumber;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;


    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    public Applicant() {}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Apply> getApply() {
		return apply;
	}

	public void setApply(List<Apply> apply) {
		this.apply = apply;
	}

	public String getDrivingLicNo() {
		return drivingLicNo;
	}

	public void setDrivingLicNo(String drivingLicNo) {
		this.drivingLicNo = drivingLicNo;
	}

	public String getEmergencyNo() {
		return emergencyNo;
	}

	public void setEmergencyNo(String emergencyNo) {
		this.emergencyNo = emergencyNo;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getResPresentAddress() {
		return resPresentAddress;
	}

	public void setResPresentAddress(String resPresentAddress) {
		this.resPresentAddress = resPresentAddress;
	}

	public String getResPresentCity() {
		return resPresentCity;
	}

	public void setResPresentCity(String resPresentCity) {
		this.resPresentCity = resPresentCity;
	}

	public String getResPresentState() {
		return resPresentState;
	}

	public void setResPresentState(String resPresentState) {
		this.resPresentState = resPresentState;
	}

	public String getResPresentZip() {
		return resPresentZip;
	}

	public void setResPresentZip(String resPresentZip) {
		this.resPresentZip = resPresentZip;
	}

	public double getResPresentRent() {
		return resPresentRent;
	}

	public void setResPresentRent(double resPresentRent) {
		this.resPresentRent = resPresentRent;
	}

	public Date getResPresentFrom() {
		return resPresentFrom;
	}

	public void setResPresentFrom(Date resPresentFrom) {
		this.resPresentFrom = resPresentFrom;
	}

	public Date getResPresentTo() {
		return resPresentTo;
	}

	public void setResPresentTo(Date resPresentTo) {
		this.resPresentTo = resPresentTo;
	}

	public String getResPresentOwnRent() {
		return resPresentOwnRent;
	}

	public void setResPresentOwnRent(String resPresentOwnRent) {
		this.resPresentOwnRent = resPresentOwnRent;
	}

	public String getResPresentLandlord() {
		return resPresentLandlord;
	}

	public void setResPresentLandlord(String resPresentLandlord) {
		this.resPresentLandlord = resPresentLandlord;
	}

	public String getResPresentLandlordEmail() {
		return resPresentLandlordEmail;
	}

	public void setResPresentLandlordEmail(String resPresentLandlordEmail) {
		this.resPresentLandlordEmail = resPresentLandlordEmail;
	}

	public String getResPresentLandlordTp() {
		return resPresentLandlordTp;
	}

	public void setResPresentLandlordTp(String resPresentLandlordTp) {
		this.resPresentLandlordTp = resPresentLandlordTp;
	}

	public String getResPresentLandlordFax() {
		return resPresentLandlordFax;
	}

	public void setResPresentLandlordFax(String resPresentLandlordFax) {
		this.resPresentLandlordFax = resPresentLandlordFax;
	}

	public String getResPresentApartment() {
		return resPresentApartment;
	}

	public void setResPresentApartment(String resPresentApartment) {
		this.resPresentApartment = resPresentApartment;
	}

	public String getResPresentUnitType() {
		return resPresentUnitType;
	}

	public void setResPresentUnitType(String resPresentUnitType) {
		this.resPresentUnitType = resPresentUnitType;
	}

	public boolean isResPresentMortgage() {
		return resPresentMortgage;
	}

	public void setResPresentMortgage(boolean resPresentMortgage) {
		this.resPresentMortgage = resPresentMortgage;
	}

	public String getResPresentReasonLeaving() {
		return resPresentReasonLeaving;
	}

	public void setResPresentReasonLeaving(String resPresentReasonLeaving) {
		this.resPresentReasonLeaving = resPresentReasonLeaving;
	}

	public String getResPresentLandlordIDProof() {
		return resPresentLandlordIDProof;
	}

	public void setResPresentLandlordIDProof(String resPresentLandlordIDProof) {
		this.resPresentLandlordIDProof = resPresentLandlordIDProof;
	}

	public String getResPreviousAddress() {
		return resPreviousAddress;
	}

	public void setResPreviousAddress(String resPreviousAddress) {
		this.resPreviousAddress = resPreviousAddress;
	}

	public String getResPreviousCity() {
		return resPreviousCity;
	}

	public void setResPreviousCity(String resPreviousCity) {
		this.resPreviousCity = resPreviousCity;
	}

	public String getResPreviousState() {
		return resPreviousState;
	}

	public void setResPreviousState(String resPreviousState) {
		this.resPreviousState = resPreviousState;
	}

	public String getResPreviousZip() {
		return resPreviousZip;
	}

	public void setResPreviousZip(String resPreviousZip) {
		this.resPreviousZip = resPreviousZip;
	}

	public double getResPreviousRent() {
		return resPreviousRent;
	}

	public void setResPreviousRent(double resPreviousRent) {
		this.resPreviousRent = resPreviousRent;
	}

	public Date getResPreviousFrom() {
		return resPreviousFrom;
	}

	public void setResPreviousFrom(Date resPreviousFrom) {
		this.resPreviousFrom = resPreviousFrom;
	}

	public Date getResPreviousTo() {
		return resPreviousTo;
	}

	public void setResPreviousTo(Date resPreviousTo) {
		this.resPreviousTo = resPreviousTo;
	}

	public String getResPreviousOwnRent() {
		return resPreviousOwnRent;
	}

	public void setResPreviousOwnRent(String resPreviousOwnRent) {
		this.resPreviousOwnRent = resPreviousOwnRent;
	}

	public String getResPreviousLandlord() {
		return resPreviousLandlord;
	}

	public void setResPreviousLandlord(String resPreviousLandlord) {
		this.resPreviousLandlord = resPreviousLandlord;
	}

	public String getResPreviousLandlordEmail() {
		return resPreviousLandlordEmail;
	}

	public void setResPreviousLandlordEmail(String resPreviousLandlordEmail) {
		this.resPreviousLandlordEmail = resPreviousLandlordEmail;
	}

	public String getResPreviousLandlordTp() {
		return resPreviousLandlordTp;
	}

	public void setResPreviousLandlordTp(String resPreviousLandlordTp) {
		this.resPreviousLandlordTp = resPreviousLandlordTp;
	}

	public String getResPreviousLandlordFax() {
		return resPreviousLandlordFax;
	}

	public void setResPreviousLandlordFax(String resPreviousLandlordFax) {
		this.resPreviousLandlordFax = resPreviousLandlordFax;
	}

	public String getResPreviousApartment() {
		return resPreviousApartment;
	}

	public void setResPreviousApartment(String resPreviousApartment) {
		this.resPreviousApartment = resPreviousApartment;
	}

	public String getResPreviousUnitType() {
		return resPreviousUnitType;
	}

	public void setResPreviousUnitType(String resPreviousUnitType) {
		this.resPreviousUnitType = resPreviousUnitType;
	}

	public boolean isResPreviousMortgage() {
		return resPreviousMortgage;
	}

	public void setResPreviousMortgage(boolean resPreviousMortgage) {
		this.resPreviousMortgage = resPreviousMortgage;
	}

	public String getEmpPresentEmployed() {
		return empPresentEmployed;
	}

	public void setEmpPresentEmployed(String empPresentEmployed) {
		this.empPresentEmployed = empPresentEmployed;
	}

	public String getEmpPresentEmail() {
		return empPresentEmail;
	}

	public void setEmpPresentEmail(String empPresentEmail) {
		this.empPresentEmail = empPresentEmail;
	}

	public String getEmpPresentAddress() {
		return empPresentAddress;
	}

	public void setEmpPresentAddress(String empPresentAddress) {
		this.empPresentAddress = empPresentAddress;
	}

	public String getEmpPresentCity() {
		return empPresentCity;
	}

	public void setEmpPresentCity(String empPresentCity) {
		this.empPresentCity = empPresentCity;
	}

	public String getEmpPresentState() {
		return empPresentState;
	}

	public void setEmpPresentState(String empPresentState) {
		this.empPresentState = empPresentState;
	}

	public String getEmpPresentZip() {
		return empPresentZip;
	}

	public void setEmpPresentZip(String empPresentZip) {
		this.empPresentZip = empPresentZip;
	}

	public String getEmpPresentPhone() {
		return empPresentPhone;
	}

	public void setEmpPresentPhone(String empPresentPhone) {
		this.empPresentPhone = empPresentPhone;
	}

	public double getEmpPresentSalary() {
		return empPresentSalary;
	}

	public void setEmpPresentSalary(double empPresentSalary) {
		this.empPresentSalary = empPresentSalary;
	}

	public Date getEmpPresentFrom() {
		return empPresentFrom;
	}

	public void setEmpPresentFrom(Date empPresentFrom) {
		this.empPresentFrom = empPresentFrom;
	}

	public Date getEmpPresentTo() {
		return empPresentTo;
	}

	public void setEmpPresentTo(Date empPresentTo) {
		this.empPresentTo = empPresentTo;
	}

	public String getEmpPresentPosition() {
		return empPresentPosition;
	}

	public void setEmpPresentPosition(String empPresentPosition) {
		this.empPresentPosition = empPresentPosition;
	}

	public double getEmpPresentAnnualIncome() {
		return empPresentAnnualIncome;
	}

	public void setEmpPresentAnnualIncome(double empPresentAnnualIncome) {
		this.empPresentAnnualIncome = empPresentAnnualIncome;
	}

	public String getEmpPreviousEmployed() {
		return empPreviousEmployed;
	}

	public void setEmpPreviousEmployed(String empPreviousEmployed) {
		this.empPreviousEmployed = empPreviousEmployed;
	}

	public String getEmpPreviousEmail() {
		return empPreviousEmail;
	}

	public void setEmpPreviousEmail(String empPreviousEmail) {
		this.empPreviousEmail = empPreviousEmail;
	}

	public String getEmpPreviousAddress() {
		return empPreviousAddress;
	}

	public void setEmpPreviousAddress(String empPreviousAddress) {
		this.empPreviousAddress = empPreviousAddress;
	}

	public String getEmpPreviousCity() {
		return empPreviousCity;
	}

	public void setEmpPreviousCity(String empPreviousCity) {
		this.empPreviousCity = empPreviousCity;
	}

	public String getEmpPreviousState() {
		return empPreviousState;
	}

	public void setEmpPreviousState(String empPreviousState) {
		this.empPreviousState = empPreviousState;
	}

	public String getEmpPreviousZip() {
		return empPreviousZip;
	}

	public void setEmpPreviousZip(String empPreviousZip) {
		this.empPreviousZip = empPreviousZip;
	}

	public String getEmpPreviousPhone() {
		return empPreviousPhone;
	}

	public void setEmpPreviousPhone(String empPreviousPhone) {
		this.empPreviousPhone = empPreviousPhone;
	}

	public double getEmpPreviousSalary() {
		return empPreviousSalary;
	}

	public void setEmpPreviousSalary(double empPreviousSalary) {
		this.empPreviousSalary = empPreviousSalary;
	}

	public Date getEmpPreviousFrom() {
		return empPreviousFrom;
	}

	public void setEmpPreviousFrom(Date empPreviousFrom) {
		this.empPreviousFrom = empPreviousFrom;
	}

	public Date getEmpPreviousTo() {
		return empPreviousTo;
	}

	public void setEmpPreviousTo(Date empPreviousTo) {
		this.empPreviousTo = empPreviousTo;
	}

	public String getEmpPreviousPosition() {
		return empPreviousPosition;
	}

	public void setEmpPreviousPosition(String empPreviousPosition) {
		this.empPreviousPosition = empPreviousPosition;
	}

	public double getEmpPreviousAnnualIncome() {
		return empPreviousAnnualIncome;
	}

	public void setEmpPreviousAnnualIncome(double empPreviousAnnualIncome) {
		this.empPreviousAnnualIncome = empPreviousAnnualIncome;
	}

	public String getEmp2PreviousEmployed() {
		return emp2PreviousEmployed;
	}

	public void setEmp2PreviousEmployed(String emp2PreviousEmployed) {
		this.emp2PreviousEmployed = emp2PreviousEmployed;
	}

	public String getEmp2PreviousEmail() {
		return emp2PreviousEmail;
	}

	public void setEmp2PreviousEmail(String emp2PreviousEmail) {
		this.emp2PreviousEmail = emp2PreviousEmail;
	}

	public String getEmp2PreviousAddress() {
		return emp2PreviousAddress;
	}

	public void setEmp2PreviousAddress(String emp2PreviousAddress) {
		this.emp2PreviousAddress = emp2PreviousAddress;
	}

	public String getEmp2PreviousCity() {
		return emp2PreviousCity;
	}

	public void setEmp2PreviousCity(String emp2PreviousCity) {
		this.emp2PreviousCity = emp2PreviousCity;
	}

	public String getEmp2PreviousState() {
		return emp2PreviousState;
	}

	public void setEmp2PreviousState(String emp2PreviousState) {
		this.emp2PreviousState = emp2PreviousState;
	}

	public String getEmp2PreviousZip() {
		return emp2PreviousZip;
	}

	public void setEmp2PreviousZip(String emp2PreviousZip) {
		this.emp2PreviousZip = emp2PreviousZip;
	}

	public String getEmp2PreviousPhone() {
		return emp2PreviousPhone;
	}

	public void setEmp2PreviousPhone(String emp2PreviousPhone) {
		this.emp2PreviousPhone = emp2PreviousPhone;
	}

	public double getEmp2PreviousSalary() {
		return emp2PreviousSalary;
	}

	public void setEmp2PreviousSalary(double emp2PreviousSalary) {
		this.emp2PreviousSalary = emp2PreviousSalary;
	}

	public Date getEmp2PreviousFrom() {
		return emp2PreviousFrom;
	}

	public void setEmp2PreviousFrom(Date emp2PreviousFrom) {
		this.emp2PreviousFrom = emp2PreviousFrom;
	}

	public Date getEmp2PreviousTo() {
		return emp2PreviousTo;
	}

	public void setEmp2PreviousTo(Date emp2PreviousTo) {
		this.emp2PreviousTo = emp2PreviousTo;
	}

	public String getEmp2PreviousPosition() {
		return emp2PreviousPosition;
	}

	public void setEmp2PreviousPosition(String emp2PreviousPosition) {
		this.emp2PreviousPosition = emp2PreviousPosition;
	}

	public double getEmp2PreviousAnnualIncome() {
		return emp2PreviousAnnualIncome;
	}

	public void setEmp2PreviousAnnualIncome(double emp2PreviousAnnualIncome) {
		this.emp2PreviousAnnualIncome = emp2PreviousAnnualIncome;
	}

	public String getSpousesEmployer() {
		return spousesEmployer;
	}

	public void setSpousesEmployer(String spousesEmployer) {
		this.spousesEmployer = spousesEmployer;
	}

	public String getSpousesEmployerAddress() {
		return spousesEmployerAddress;
	}

	public void setSpousesEmployerAddress(String spousesEmployerAddress) {
		this.spousesEmployerAddress = spousesEmployerAddress;
	}

	public double getSpousesIncome() {
		return spousesIncome;
	}

	public void setSpousesIncome(double spousesIncome) {
		this.spousesIncome = spousesIncome;
	}

	public String getReferenceName() {
		return referenceName;
	}

	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}

	public String getReferenceAddress() {
		return referenceAddress;
	}

	public void setReferenceAddress(String referenceAddress) {
		this.referenceAddress = referenceAddress;
	}

	public String getReferenceTelephone() {
		return referenceTelephone;
	}

	public void setReferenceTelephone(String referenceTelephone) {
		this.referenceTelephone = referenceTelephone;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}

	public String getEmergencyContactFax() {
		return emergencyContactFax;
	}

	public void setEmergencyContactFax(String emergencyContactFax) {
		this.emergencyContactFax = emergencyContactFax;
	}

	public String getEmergencyContactRelation() {
		return emergencyContactRelation;
	}

	public void setEmergencyContactRelation(String emergencyContactRelation) {
		this.emergencyContactRelation = emergencyContactRelation;
	}

	public String getPrimaryBankName() {
		return primaryBankName;
	}

	public void setPrimaryBankName(String primaryBankName) {
		this.primaryBankName = primaryBankName;
	}

	public String getPrimaryBankBranch() {
		return primaryBankBranch;
	}

	public void setPrimaryBankBranch(String primaryBankBranch) {
		this.primaryBankBranch = primaryBankBranch;
	}

	public String getPrimaryBankAccType() {
		return primaryBankAccType;
	}

	public void setPrimaryBankAccType(String primaryBankAccType) {
		this.primaryBankAccType = primaryBankAccType;
	}

	public String getPrimaryBankAccNo() {
		return primaryBankAccNo;
	}

	public void setPrimaryBankAccNo(String primaryBankAccNo) {
		this.primaryBankAccNo = primaryBankAccNo;
	}

	public String getSecondaryBankName() {
		return secondaryBankName;
	}

	public void setSecondaryBankName(String secondaryBankName) {
		this.secondaryBankName = secondaryBankName;
	}

	public String getSecondaryBankBranch() {
		return secondaryBankBranch;
	}

	public void setSecondaryBankBranch(String secondaryBankBranch) {
		this.secondaryBankBranch = secondaryBankBranch;
	}

	public String getSecondaryBankAccType() {
		return secondaryBankAccType;
	}

	public void setSecondaryBankAccType(String secondaryBankAccType) {
		this.secondaryBankAccType = secondaryBankAccType;
	}

	public String getSecondaryBankAccNo() {
		return secondaryBankAccNo;
	}

	public void setSecondaryBankAccNo(String secondaryBankAccNo) {
		this.secondaryBankAccNo = secondaryBankAccNo;
	}

	public String getRelativeNum() {
		return relativeNum;
	}

	public void setRelativeNum(String relativeNum) {
		this.relativeNum = relativeNum;
	}

	public String getRelativeName() {
		return relativeName;
	}

	public void setRelativeName(String relativeName) {
		this.relativeName = relativeName;
	}

	public String getAdditionalIncome() {
		return additionalIncome;
	}

	public void setAdditionalIncome(String additionalIncome) {
		this.additionalIncome = additionalIncome;
	}

	public boolean isBankruptcy() {
		return bankruptcy;
	}

	public void setBankruptcy(boolean bankruptcy) {
		this.bankruptcy = bankruptcy;
	}

	public boolean isCrimeCheck() {
		return crimeCheck;
	}

	public void setCrimeCheck(boolean crimeCheck) {
		this.crimeCheck = crimeCheck;
	}

	public boolean isEvicted() {
		return evicted;
	}

	public void setEvicted(boolean evicted) {
		this.evicted = evicted;
	}

	public boolean isSmoke() {
		return smoke;
	}

	public void setSmoke(boolean smoke) {
		this.smoke = smoke;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public int getResPresentYears() {
		return resPresentYears;
	}

	public void setResPresentYears(int resPresentYears) {
		this.resPresentYears = resPresentYears;
	}

	public int getResPresentMonths() {
		return resPresentMonths;
	}

	public void setResPresentMonths(int resPresentMonths) {
		this.resPresentMonths = resPresentMonths;
	}

	public int getResPreviousYear() {
		return resPreviousYear;
	}

	public void setResPreviousYear(int resPreviousYear) {
		this.resPreviousYear = resPreviousYear;
	}

	public int getResPreviousMonth() {
		return resPreviousMonth;
	}

	public void setResPreviousMonth(int resPreviousMonth) {
		this.resPreviousMonth = resPreviousMonth;
	}

	public int getEmpPresentYears() {
		return empPresentYears;
	}

	public void setEmpPresentYears(int empPresentYears) {
		this.empPresentYears = empPresentYears;
	}

	public int getEmpPresentMonths() {
		return empPresentMonths;
	}

	public void setEmpPresentMonths(int empPresentMonths) {
		this.empPresentMonths = empPresentMonths;
	}

	public int getEmpPreviousYear() {
		return empPreviousYear;
	}

	public void setEmpPreviousYear(int empPreviousYear) {
		this.empPreviousYear = empPreviousYear;
	}

	public int getEmpPreviousMonth() {
		return empPreviousMonth;
	}

	public void setEmpPreviousMonth(int empPreviousMonth) {
		this.empPreviousMonth = empPreviousMonth;
	}

	public boolean isVehicle() {
		return vehicle;
	}

	public void setVehicle(boolean vehicle) {
		this.vehicle = vehicle;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleMadeBy() {
		return vehicleMadeBy;
	}

	public void setVehicleMadeBy(String vehicleMadeBy) {
		this.vehicleMadeBy = vehicleMadeBy;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleYear() {
		return vehicleYear;
	}

	public void setVehicleYear(String vehicleYear) {
		this.vehicleYear = vehicleYear;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getResPresentPhone() {
		return resPresentPhone;
	}

	public void setResPresentPhone(String resPresentPhone) {
		this.resPresentPhone = resPresentPhone;
	}

	public String getResPresentFax() {
		return resPresentFax;
	}

	public void setResPresentFax(String resPresentFax) {
		this.resPresentFax = resPresentFax;
	}

	public String getResPreviousReasonLeaving() {
		return resPreviousReasonLeaving;
	}

	public void setResPreviousReasonLeaving(String resPreviousReasonLeaving) {
		this.resPreviousReasonLeaving = resPreviousReasonLeaving;
	}

	public String getVehicleLicenseNumber() {
		return vehicleLicenseNumber;
	}

	public void setVehicleLicenseNumber(String vehicleLicenseNumber) {
		this.vehicleLicenseNumber = vehicleLicenseNumber;
	}

	public String getReferenceName2() {
		return referenceName2;
	}

	public void setReferenceName2(String referenceName2) {
		this.referenceName2 = referenceName2;
	}

	public String getReferenceAddress2() {
		return referenceAddress2;
	}

	public void setReferenceAddress2(String referenceAddress2) {
		this.referenceAddress2 = referenceAddress2;
	}

	public String getReferenceTelephone2() {
		return referenceTelephone2;
	}

	public void setReferenceTelephone2(String referenceTelephone2) {
		this.referenceTelephone2 = referenceTelephone2;
	}

	public ApplicationType getType() {
		return type;
	}

	public void setType(ApplicationType type) {
		this.type = type;
	}
	
	
	
	
}
