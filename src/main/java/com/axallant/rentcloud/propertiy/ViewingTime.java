package com.axallant.rentcloud.propertiy;

import java.sql.Time;
import java.time.DayOfWeek;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "viewingTime")
public class ViewingTime {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "rentalEntity_id")
	@JsonIgnore
	private RentalEntity rentalEntity;
	
	private Date date;
	private DayOfWeek dayOfWeek;
	private Time time;
	
	public ViewingTime() {}

	public ViewingTime(Long id, RentalEntity rentalEntity, Date date, DayOfWeek dayOfWeek, Time time) {
		super();
		this.id = id;
		this.rentalEntity = rentalEntity;
		this.date = date;
		this.dayOfWeek = dayOfWeek;
		this.time = time;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RentalEntity getRentalEntity() {
		return rentalEntity;
	}

	public void setRentalEntity(RentalEntity rentalEntity) {
		this.rentalEntity = rentalEntity;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
	
}
