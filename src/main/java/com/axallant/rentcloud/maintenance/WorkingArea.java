package com.axallant.rentcloud.maintenance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WorkingArea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@JsonIgnore
	@ManyToOne
	private MaintenanceProvider maintenanceProvider;
	private String state;
	private String city;
}
