package com.axallant.rentcloud.maintenance;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedBy;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class EventRecord extends CommonFields{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="service_request_id")
	private ServiceRequest serviceRequest;
	
	@Enumerated(EnumType.STRING)
	private MaintenanceEvent maintenanceEvent;
	
	private long eventId;
	
	@CreatedBy
	private String actionBy;
	
	private String actionById;
	
	
}
