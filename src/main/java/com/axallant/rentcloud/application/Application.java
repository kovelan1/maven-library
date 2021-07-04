package com.axallant.rentcloud.application;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
@Table(name = "application")
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String applicant;
	private long rentalEntityId;
	@Enumerated(EnumType.STRING)
	private ApplicationStatus status;
	private String drivingLicNo;
	private int totalOccupants;
	private String emergencyNo;
	private String ssn;
	private Date dob;
	private String otherNames;
	private boolean pets;
	private String creditCheck;
	private String securityCheck;
	
	private String resPresentCity;
	private String resPresentState;
	private String resPresentZip;
	private double resPresentRent;
	private Date resPresentFrom;
	private Date resPresentTo;
	private String resPresentOwnRent;
	private String resPresentLandlord;
	private String resPresentLandlordEmail;
	private String resPresentLandlordTp;
	private String resPresentLandlordFax;
	private String resPresentApartment;
	private boolean resPresentMortgage;

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
	private boolean resPreviousMortgage;

	private String empPresentEmployer;
	private String empPresentEmployed;
	private String empPresentCity;
	private String empPresentState;
	private String empPresentZip;
	private String empPresentPhone;
	private double empPresentSalary;
	private Date empPresentFrom;
	private Date empPresentTo;
	private String empPresentPosition;
	
	private String empPreviousEmployer;
	private String empPreviousEmployed;
	private String empPreviousCity;
	private String empPreviousState;
	private String empPreviousZip;
	private String empPreviousPhone;
	private double empPreviousSalary;
	private Date empPreviousFrom;
	private Date empPreviousTo;
	private String empPreviousPosition;
	
	private String occupentsName;
	
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;


    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
	
	public Application() {}

	public Application(long applicationid, String applicant, long rentalEntityId, ApplicationStatus status, String drivingLicNo,
			int totalOccupants, String emergencyNo, String otherNames, boolean pets, String creditCheck,
			String securityCheck, String resPresentCity, String resPresentState, String resPresentZip,
			double resPresentRent, Date resPresentFrom, Date resPresentTo, String resPresentOwnRent,
			String resPresentLandlord, String resPresentLandlordEmail, String resPresentLandlordTp,
			String resPresentLandlordFax, String resPresentApartment, boolean resPresentMortgage,
			String resPreviousCity, String resPreviousState, String resPreviousZip, double resPreviousRent,
			Date resPreviousFrom, Date resPreviousTo, String resPreviousOwnRent, String resPreviousLandlord,
			String resPreviousLandlordEmail, String resPreviousLandlordTp, String resPreviousLandlordFax,
			String resPreviousApartment, boolean resPreviousMortgage, String empPresentEmployed, String empPresentCity,
			String empPresentState, String empPresentZip, String empPresentPhone, double empPresentSalary,
			Date empPresentFrom, Date empPresentTo, String empPresentPosition, String empPreviousEmployed,
			String empPreviousCity, String empPreviousState, String empPreviousZip, String empPreviousPhone,
			double empPreviousSalary, Date empPreviousFrom, Date empPreviousTo, String empPreviousPosition,
			Date createdAt, Date updatedAt) {
		super();
		this.id = applicationid;
		this.applicant = applicant;
		this.rentalEntityId = rentalEntityId;
		this.status = status;
		this.drivingLicNo = drivingLicNo;
		this.totalOccupants = totalOccupants;
		this.emergencyNo = emergencyNo;
		this.otherNames = otherNames;
		this.pets = pets;
		this.creditCheck = creditCheck;
		this.securityCheck = securityCheck;
		this.resPresentCity = resPresentCity;
		this.resPresentState = resPresentState;
		this.resPresentZip = resPresentZip;
		this.resPresentRent = resPresentRent;
		this.resPresentFrom = resPresentFrom;
		this.resPresentTo = resPresentTo;
		this.resPresentOwnRent = resPresentOwnRent;
		this.resPresentLandlord = resPresentLandlord;
		this.resPresentLandlordEmail = resPresentLandlordEmail;
		this.resPresentLandlordTp = resPresentLandlordTp;
		this.resPresentLandlordFax = resPresentLandlordFax;
		this.resPresentApartment = resPresentApartment;
		this.resPresentMortgage = resPresentMortgage;
		this.resPreviousCity = resPreviousCity;
		this.resPreviousState = resPreviousState;
		this.resPreviousZip = resPreviousZip;
		this.resPreviousRent = resPreviousRent;
		this.resPreviousFrom = resPreviousFrom;
		this.resPreviousTo = resPreviousTo;
		this.resPreviousOwnRent = resPreviousOwnRent;
		this.resPreviousLandlord = resPreviousLandlord;
		this.resPreviousLandlordEmail = resPreviousLandlordEmail;
		this.resPreviousLandlordTp = resPreviousLandlordTp;
		this.resPreviousLandlordFax = resPreviousLandlordFax;
		this.resPreviousApartment = resPreviousApartment;
		this.resPreviousMortgage = resPreviousMortgage;
		this.empPresentEmployed = empPresentEmployed;
		this.empPresentCity = empPresentCity;
		this.empPresentState = empPresentState;
		this.empPresentZip = empPresentZip;
		this.empPresentPhone = empPresentPhone;
		this.empPresentSalary = empPresentSalary;
		this.empPresentFrom = empPresentFrom;
		this.empPresentTo = empPresentTo;
		this.empPresentPosition = empPresentPosition;
		this.empPreviousEmployed = empPreviousEmployed;
		this.empPreviousCity = empPreviousCity;
		this.empPreviousState = empPreviousState;
		this.empPreviousZip = empPreviousZip;
		this.empPreviousPhone = empPreviousPhone;
		this.empPreviousSalary = empPreviousSalary;
		this.empPreviousFrom = empPreviousFrom;
		this.empPreviousTo = empPreviousTo;
		this.empPreviousPosition = empPreviousPosition;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public long getId() {
		return id;
	}

	public void setId(long applicationid) {
		this.id = applicationid;
	}

	public String getApplicant() {
		return applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public long getRentalEntityId() {
		return rentalEntityId;
	}

	public void setRentalEntityId(long rentalEntityId) {
		this.rentalEntityId = rentalEntityId;
	}

	public ApplicationStatus getStatus() {
		return status;
	}

	public void setStatus(ApplicationStatus status) {
		this.status = status;
	}

	public String getDrivingLicNo() {
		return drivingLicNo;
	}

	public void setDrivingLicNo(String drivingLicNo) {
		this.drivingLicNo = drivingLicNo;
	}

	public int getTotalOccupants() {
		return totalOccupants;
	}

	public void setTotalOccupants(int totalOccupants) {
		this.totalOccupants = totalOccupants;
	}

	public String getEmergencyNo() {
		return emergencyNo;
	}

	public void setEmergencyNo(String emergencyNo) {
		this.emergencyNo = emergencyNo;
	}

	public String getOtherNames() {
		return otherNames;
	}

	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}

	public boolean isPets() {
		return pets;
	}

	public void setPets(boolean pets) {
		this.pets = pets;
	}

	public Optional<String> getCreditCheck() {
		return Optional.ofNullable(creditCheck);
	}

	public void setCreditCheck(String creditCheck) {
		this.creditCheck = creditCheck;
	}

	public Optional<String> getSecurityCheck() {
		return Optional.ofNullable(securityCheck);
	}

	public void setSecurityCheck(String securityCheck) {
		this.securityCheck = securityCheck;
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

	public boolean isResPresentMortgage() {
		return resPresentMortgage;
	}

	public void setResPresentMortgage(boolean resPresentMortgage) {
		this.resPresentMortgage = resPresentMortgage;
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

	public String getEmpPreviousEmployed() {
		return empPreviousEmployed;
	}

	public void setEmpPreviousEmployed(String empPreviousEmployed) {
		this.empPreviousEmployed = empPreviousEmployed;
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

	public String getEmpPresentEmployer() {
		return empPresentEmployer;
	}

	public void setEmpPresentEmployer(String empPresentEmployer) {
		this.empPresentEmployer = empPresentEmployer;
	}

	public String getEmpPreviousEmployer() {
		return empPreviousEmployer;
	}

	public void setEmpPreviousEmployer(String empPreviousEmployer) {
		this.empPreviousEmployer = empPreviousEmployer;
	}

	public String getOccupentsName() {
		return occupentsName;
	}

	public void setOccupentsName(String occupentsName) {
		this.occupentsName = occupentsName;
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

	
	
}

