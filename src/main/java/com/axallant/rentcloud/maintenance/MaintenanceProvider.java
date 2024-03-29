package com.axallant.rentcloud.maintenance;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Where;

import com.axallant.rentcloud.models.Address;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(uniqueConstraints = {
	    @UniqueConstraint(columnNames = {
	        "email"
	    })
	})
public class MaintenanceProvider extends CommonFields{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	private String lastName;
	private String companyName;
	@Enumerated(EnumType.STRING)
	private AddedBy addedBy;
	
	private String addedById;
	private String email;
	private String mobile;
	private Address address;
	@OneToMany(mappedBy = "maintenanceProvider", cascade = CascadeType.ALL)
	private List<WorkingArea> workingAreas;
	private String skills;
	private String image;
	
	@Column(columnDefinition = "LONGTEXT")
	private String about;
	
	private String profileImage;

	@JsonIgnore
	@OneToMany(mappedBy = "maintenanceProvider", cascade = CascadeType.ALL)
    @Where(clause = "deleted = false")
	private List<ServiceQuotation> serviceQuotations;
	
	@JsonIgnore
	@OneToMany(mappedBy = "maintenanceProvider", cascade = CascadeType.ALL)
    @Where(clause = "deleted = false")
	private List<JobAppointment> jobAppointments;
}
