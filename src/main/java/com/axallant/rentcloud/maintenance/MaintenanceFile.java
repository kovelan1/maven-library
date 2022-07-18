package com.axallant.rentcloud.maintenance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.SQLDelete;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SQLDelete(sql = "UPDATE contract_file SET deleted = true WHERE id=?")
@FilterDef(name = "deletedContract_fileFilter", parameters = @ParamDef(name = "isDeleted", type = "boolean"))
@Filter(name = "deletedContract_fileFilter", condition = "deleted = :isDeleted")
public class MaintenanceFile extends CommonFields{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@JoinColumn(name="service_request_id")
	private ServiceRequest serviceRequest;
	
	@ManyToOne
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@JoinColumn(name="service_quotation_id")
	private ServiceQuotation serviceQuotation;
	
	private String fileName;
	
	private String category;
	
	private String uploadBy;
	
	private String fileType;
	
	private boolean tenantAccess;
	
	private boolean landlordAccess;
	
	private boolean deleted;
	
    private int version;
    

    
    
}
