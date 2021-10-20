package com.axallant.rentcloud.propertiy.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.axallant.rentcloud.models.Address;
import com.axallant.rentcloud.propertiy.Property;
import com.axallant.rentcloud.propertiy.PropertyType;
import com.axallant.rentcloud.propertiy.RentalEntity;

import javassist.NotFoundException;

public class PropertyDTO {

	
	private Long id;
	private String name;
	private List<RentalEnityIgPropDTO> rentalEntity;
	private PropertyType type;
	private Address address;
	private String aptUnit;
	private String coverImage;
    private Date createdAt;
    private Date updatedAt;
    private List<String> landlords;
	
	public PropertyDTO() {}
	
	public PropertyDTO transfromPramObject(Property property) throws NotFoundException {
		List<RentalEntity> rentalEntities=property.getRentalEntity();
		List<RentalEnityIgPropDTO> rentalEnityIgPropDTOs=new ArrayList<RentalEnityIgPropDTO>();
		
		rentalEntities.forEach(action->{
			rentalEnityIgPropDTOs.add(new RentalEnityIgPropDTO().transfromPramObject(action));
		});
		return new PropertyDTO(property.getId(),
				property.getName(),
				rentalEnityIgPropDTOs, 
				property.getType(), 
				property.getAddress(), 
				property.getAptUnit(), 
				property.getCoverImage().orElse(""),
				property.getCreatedAt(), 
				property.getUpdatedAt());
	}

	public PropertyDTO(Long id,String name, List<RentalEnityIgPropDTO> rentalEntity, PropertyType type, Address address, String aptUnit,
			String coverImage, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.rentalEntity = rentalEntity;
		this.type = type;
		this.address = address;
		this.aptUnit = aptUnit;
		this.coverImage = coverImage;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.name=name;
	}

	
	public List<String> getLandlords() {
		return landlords;
	}

	public void setLandlords(List<String> landlords) {
		this.landlords = landlords;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<RentalEnityIgPropDTO> getRentalEntity() {
		return rentalEntity;
	}

	public void setRentalEntity(List<RentalEnityIgPropDTO> rentalEntity) {
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

	public String getCoverImage() {
		return coverImage;
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
	
	
}
