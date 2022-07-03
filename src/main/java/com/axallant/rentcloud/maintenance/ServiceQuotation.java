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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ServiceQuotation extends CommonFields{
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="maintenance_provider_id")
	private MaintenanceProvider maintenanceProvider;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="service_request_id")
	private ServiceRequest serviceRequest;
	
	private double estimatedCost;
	
	private Date startOn;
	private Date endOn;
	private double jobHours;
	
	@Column(columnDefinition = "LONGTEXT")
	private String description; 
	
	@OneToMany(cascade = CascadeType.ALL)
    @OrderBy("createdAt DESC")
    @Where(clause = "deleted = false")
	private List<MaintenanceFile> images;
	
	@OneToMany(cascade = CascadeType.ALL)
    @OrderBy("createdAt DESC")
    @Where(clause = "deleted = false")
	private List<MaintenanceFile> documents;
	
	@Enumerated(EnumType.STRING)
	private LandlordStatus landlordStatus;
	
	@Column(columnDefinition = "LONGTEXT")
	private String landlordDescription;
	
	@JsonIgnore
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="job_appointment_id")
	private JobAppointment jobAppointment;
	
	

}
