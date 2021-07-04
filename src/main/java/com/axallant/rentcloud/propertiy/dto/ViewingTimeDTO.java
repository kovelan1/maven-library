package com.axallant.rentcloud.propertiy.dto;

import java.sql.Time;
import java.time.DayOfWeek;
import java.util.Date;

import com.axallant.rentcloud.propertiy.RentalEntity;
import com.axallant.rentcloud.propertiy.ViewingTime;

public class ViewingTimeDTO {
	
	private Long id;
	
	private RentalEntity rentalEntity;
	
	private Date date;
	private DayOfWeek dayOfWeek;
	private Time time;
	
	public ViewingTimeDTO() {}
	
	public ViewingTimeDTO transfromPramObject(ViewingTime viewingTime) {
		return new ViewingTimeDTO(viewingTime.getId(), viewingTime.getRentalEntity(), viewingTime.getDate(), viewingTime.getDayOfWeek(), viewingTime.getTime());
	}

	public ViewingTimeDTO(Long id, RentalEntity rentalEntity, Date date, DayOfWeek dayOfWeek, Time time) {
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
