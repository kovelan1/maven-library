package com.axallant.rentcloud.maintenance;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.Where;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ServiceRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Tenant id shouldn't be empty")
	private String tenantId;
	
	@NotBlank(message = "Landlord id shouldn't be empty")
	private String landlordId;
	
	@NotNull(message = "Contract id shouldn't be empty")
	private long contractId;
	
	@NotNull(message = "Rental Entity id shouldn't be null")
	private long rentalEntityId;
	
	@NotBlank(message = "Category shouldn't be empty or null")
	private String category;
	
	private String subCategory;
	
	@Column(columnDefinition = "LONGTEXT")
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL)
    @OrderBy("createdAt DESC")
	private List<MaintenanceFile> images;
	
	@OneToMany(mappedBy = "serviceRequest", cascade = CascadeType.ALL)
	private List<ProviderInvite> providerInvites;
	
	@OneToMany(mappedBy = "serviceRequest", cascade = CascadeType.ALL)
	private List<ServiceQuotation> serviceQuotations;
	
	@Enumerated(EnumType.STRING)
	private LandlordStatus landlordApprovel;
	
	@Enumerated(EnumType.STRING)
	private RequestStatus status;
	
	@Enumerated(EnumType.STRING)
	private WorkerStatus workerStatus; // use to store the maintenance provider status 
	
	private boolean jobAssigned;
	private String outsourceId;
	private double cost;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="job_appointment_id")
	private JobAppointment jobAppointment;
	
	private Date approvedOn;
	private Date completedOn;
	
	@OneToMany(mappedBy = "serviceRequest",cascade = CascadeType.ALL)
    @OrderBy("createdAt DESC")
	private List<EventRecord> eventRecords; 
	
	
	
}
