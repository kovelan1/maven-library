package com.axallant.rentcloud.application;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import com.axallant.rentcloud.models.Address;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BusinessApplication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@JsonIgnore
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="application_id")
	private Application application;
	
	private String businessName;
	private Date establish;
	private String contactPhone;
	private String contactFax;
	private int employessCount;
	private String businessType;
	private String ownershipType;
	@Column(columnDefinition = "LONGTEXT")
	private String intend;
	private boolean parentCompany;
	private String parentCompanyName;
	@Embedded
	@AttributeOverrides( {
        @AttributeOverride(name="address", column = @Column(name="parentCompanyAddress") ),
		@AttributeOverride(name="address2", column = @Column(name="parentCompanyAddress2") ),
        @AttributeOverride(name="city", column = @Column(name="parentCompanyCity") ),
        @AttributeOverride(name="state", column = @Column(name="parentCompanyState") ),
        @AttributeOverride(name="zip", column = @Column(name="parentCompanyZip") ),
        @AttributeOverride(name="country", column = @Column(name="parentCompanyCountry") ),
        @AttributeOverride(name="lat", column = @Column(name="parentCompanyLat") ),
        @AttributeOverride(name="lng", column = @Column(name="parentCompanyLng") )
	})
	private Address parentCompanyAddress;
	
	@OneToMany(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
			mappedBy = "businessApplication")
	private List<BusinessOwners> owners;
	
	private String primaryBank;
	private String primaryBankPhone;
	@Embedded
	@AttributeOverrides( {
        @AttributeOverride(name="address", column = @Column(name="primaryBankAddress") ),
		@AttributeOverride(name="address2", column = @Column(name="primaryBankAddress2") ),
        @AttributeOverride(name="city", column = @Column(name="primaryBankCity") ),
        @AttributeOverride(name="state", column = @Column(name="primaryBankState") ),
        @AttributeOverride(name="zip", column = @Column(name="primaryBankZip") ),
        @AttributeOverride(name="country", column = @Column(name="primaryBankCountry") ),
        @AttributeOverride(name="lat", column = @Column(name="primaryBankLat") ),
        @AttributeOverride(name="lng", column = @Column(name="primaryBankLng") )
	})
	private Address primaryBankAddress;
	
	private String secondaryBank;
	private String secondaryBankPhone;
	@Embedded
	@AttributeOverrides( {
        @AttributeOverride(name="address", column = @Column(name="secondaryBankAddress") ),
		@AttributeOverride(name="address2", column = @Column(name="secondaryBankAddress2") ),
        @AttributeOverride(name="city", column = @Column(name="secondaryBankCity") ),
        @AttributeOverride(name="state", column = @Column(name="secondaryBankState") ),
        @AttributeOverride(name="zip", column = @Column(name="secondaryBankZip") ),
        @AttributeOverride(name="country", column = @Column(name="secondaryBankCountry") ),
        @AttributeOverride(name="lat", column = @Column(name="secondaryBankLat") ),
        @AttributeOverride(name="lng", column = @Column(name="secondaryBankLng") )
	})
	private Address secondaryBankAddress;
	
	
	@OneToMany(
			fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "businessApplication")
	private List<CreditReference> creditReferences;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Application getApplication() {
		return application;
	}


	public void setApplication(Application application) {
		this.application = application;
	}


	public String getBusinessName() {
		return businessName;
	}


	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}


	public Date getEstablish() {
		return establish;
	}


	public void setEstablish(Date establish) {
		this.establish = establish;
	}


	public String getContactPhone() {
		return contactPhone;
	}


	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}


	public String getContactFax() {
		return contactFax;
	}


	public void setContactFax(String contactFax) {
		this.contactFax = contactFax;
	}


	public int getEmployessCount() {
		return employessCount;
	}


	public void setEmployessCount(int employessCount) {
		this.employessCount = employessCount;
	}


	public String getBusinessType() {
		return businessType;
	}


	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}


	public String getOwnershipType() {
		return ownershipType;
	}


	public void setOwnershipType(String ownershipType) {
		this.ownershipType = ownershipType;
	}


	public String getIntend() {
		return intend;
	}


	public void setIntend(String intend) {
		this.intend = intend;
	}


	public boolean isParentCompany() {
		return parentCompany;
	}


	public void setParentCompany(boolean parentCompany) {
		this.parentCompany = parentCompany;
	}


	public String getParentCompanyName() {
		return parentCompanyName;
	}


	public void setParentCompanyName(String parentCompanyName) {
		this.parentCompanyName = parentCompanyName;
	}


	public Address getParentCompanyAddress() {
		return parentCompanyAddress;
	}


	public void setParentCompanyAddress(Address parentCompanyAddress) {
		this.parentCompanyAddress = parentCompanyAddress;
	}


	public List<BusinessOwners> getOwners() {
		return owners;
	}


	public void setOwners(List<BusinessOwners> owners) {
		this.owners = owners;
	}


	public String getPrimaryBank() {
		return primaryBank;
	}


	public void setPrimaryBank(String primaryBank) {
		this.primaryBank = primaryBank;
	}


	public String getPrimaryBankPhone() {
		return primaryBankPhone;
	}


	public void setPrimaryBankPhone(String primaryBankPhone) {
		this.primaryBankPhone = primaryBankPhone;
	}


	public Address getPrimaryBankAddress() {
		return primaryBankAddress;
	}


	public void setPrimaryBankAddress(Address primaryBankAddress) {
		this.primaryBankAddress = primaryBankAddress;
	}


	public String getSecondaryBank() {
		return secondaryBank;
	}


	public void setSecondaryBank(String secondaryBank) {
		this.secondaryBank = secondaryBank;
	}


	public String getSecondaryBankPhone() {
		return secondaryBankPhone;
	}


	public void setSecondaryBankPhone(String secondaryBankPhone) {
		this.secondaryBankPhone = secondaryBankPhone;
	}


	public Address getSecondaryBankAddress() {
		return secondaryBankAddress;
	}


	public void setSecondaryBankAddress(Address secondaryBankAddress) {
		this.secondaryBankAddress = secondaryBankAddress;
	}


	public List<CreditReference> getCreditReferences() {
		return creditReferences;
	}


	public void setCreditReferences(List<CreditReference> creditReferences) {
		this.creditReferences = creditReferences;
	}
	
	

}
