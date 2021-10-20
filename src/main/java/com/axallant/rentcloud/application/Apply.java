package com.axallant.rentcloud.application;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Apply {

	@EmbeddedId
	private ApplyKey id;
	
	@JsonIgnore
	@ManyToOne
	@MapsId("applicantionId")
	@JoinColumn(name="application_id")
	private Application application;
	
	@ManyToOne
	@MapsId("applicantId")
	@JoinColumn(name="applicant_id")
	private Applicant applicant;
	
	private int applicantOrder;
	
	public Apply() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Apply( Application application, Applicant applicant, int applicantOrder) {
		super();
		this.id = new ApplyKey(application.getId(), applicant.getUsername());
		this.application = application;
		this.applicant = applicant;
		this.applicantOrder = applicantOrder;
	}



	public ApplyKey getId() {
		return id;
	}

	public void setId(ApplyKey id) {
		this.id = id;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public int getApplicantOrder() {
		return applicantOrder;
	}

	public void setApplicantOrder(int applicantOrder) {
		this.applicantOrder = applicantOrder;
	}
	
	
	
	
}
