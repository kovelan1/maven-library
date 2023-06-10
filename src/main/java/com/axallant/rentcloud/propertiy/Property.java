package com.axallant.rentcloud.propertiy;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import com.axallant.rentcloud.models.Address;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "property")
@SQLDelete(sql = "UPDATE property SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class Property {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@OneToMany(mappedBy = "property", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnore
	private List<RentalEntity> rentalEntity;
	
	@Enumerated(EnumType.STRING)
	private PropertyType type;
	private Address address;
	private String aptUnit;
	private String coverImage;
	private String managerName;
	private String managerPhone;
	private int applicationFee;
	private int platformFee;
	private boolean enable;
	private boolean deleted = Boolean.FALSE;
	private String currency;

	private boolean isManageByProfessional;
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;


    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
	
	public Property() {}


	public Property(Long id, String name, List<RentalEntity> rentalEntity, PropertyType type, Address address,
			String aptUnit, String coverImage,String managerName,String managerPhone, int applicationFee, int platformFee, boolean enable, String currency,
					boolean isManageByProfessional,Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.rentalEntity = rentalEntity;
		this.type = type;
		this.address = address;
		this.aptUnit = aptUnit;
		this.coverImage = coverImage;
		this.managerName=managerName;
		this.managerPhone=managerPhone;
		this.applicationFee = applicationFee;
		this.platformFee = platformFee;
		this.enable = enable;
		this.currency = currency;
		this.isManageByProfessional=isManageByProfessional;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}





	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<RentalEntity> getRentalEntity() {
		return rentalEntity;
	}

	public void setRentalEntity(List<RentalEntity> rentalEntity) {
		this.rentalEntity = rentalEntity;
	}

	public PropertyType getType() {
		return type;
	}

	public void setType(PropertyType type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getAptUnit() {
		return aptUnit;
	}

	public void setAptUnit(String aptUnit) {
		this.aptUnit = aptUnit;
	}

	public Optional<String> getCoverImage() {
		return Optional.ofNullable(coverImage);
	}

	public String setCoverImage(String coverImage) {
		return this.coverImage=coverImage;
		
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getApplicationFee() {
		return applicationFee;
	}



	public void setApplicationFee(int applicationFee) {
		this.applicationFee = applicationFee;
	}



	public int getPlatformFee() {
		return platformFee;
	}



	public void setPlatformFee(int platformFee) {
		this.platformFee = platformFee;
	}



	public boolean isEnable() {
		return enable;
	}



	public void setEnable(boolean enable) {
		this.enable = enable;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public String getManagerName() {
		return managerName;
	}


	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}


	public String getManagerPhone() {
		return managerPhone;
	}


	public void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}


	public boolean isDeleted() {
		return deleted;
	}


	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public boolean isManageByProfessional() {
		return isManageByProfessional;
	}

	public void setManageByProfessional(boolean manageByProfessional) {
		isManageByProfessional = manageByProfessional;
	}
}
