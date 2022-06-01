package com.axallant.rentcloud.payment;

import java.sql.Date;
import java.time.YearMonth;
import java.util.List;
import java.util.Map;

public class PaymentDashboard {
	
	private double totalRentMonth;
	private double collectedRentMonth;
	private double pendingRentMonth;
	private int month;
	private int year;
	private YearMonth yearmonth;
	private Date startDate;
	private Date endDate;
	private int totalOccupiedMonth;
	private int rentReceivedOccupiedMonth;
	private int rentPendingOccupiedMonth;
	private double totalInflowMonth;
	private double axallantChargeMonth;
	private List<PaymentSumaryMonth> rentalSumarry;
	
	public PaymentDashboard() {
		// TODO Auto-generated constructor stub
	}

	public PaymentDashboard(double totalRentMonth, double collectedRentMonth, double pendingRentMonth, int month,
			int year, YearMonth yearmonth, Date startDate, Date endDate, int totalOccupiedMonth,
			int rentReceivedOccupiedMonth, int rentPendingOccupiedMonth, double totalInflowMonth,
			double axallantChargeMonth, List<PaymentSumaryMonth> rentalSumarry) {
		super();
		this.totalRentMonth = totalRentMonth;
		this.collectedRentMonth = collectedRentMonth;
		this.pendingRentMonth = pendingRentMonth;
		this.month = month;
		this.year = year;
		this.yearmonth = yearmonth;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalOccupiedMonth = totalOccupiedMonth;
		this.rentReceivedOccupiedMonth = rentReceivedOccupiedMonth;
		this.rentPendingOccupiedMonth = rentPendingOccupiedMonth;
		this.totalInflowMonth = totalInflowMonth;
		this.axallantChargeMonth = axallantChargeMonth;
		this.rentalSumarry = rentalSumarry;
	}

	public double getTotalRentMonth() {
		return totalRentMonth;
	}

	public void setTotalRentMonth(double totalRentMonth) {
		this.totalRentMonth = totalRentMonth;
	}

	public double getCollectedRentMonth() {
		return collectedRentMonth;
	}

	public void setCollectedRentMonth(double collectedRentMonth) {
		this.collectedRentMonth = collectedRentMonth;
	}

	public double getPendingRentMonth() {
		return pendingRentMonth;
	}

	public void setPendingRentMonth(double pendingRentMonth) {
		this.pendingRentMonth = pendingRentMonth;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public YearMonth getYearmonth() {
		return yearmonth;
	}

	public void setYearmonth(YearMonth yearmonth) {
		this.yearmonth = yearmonth;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getTotalOccupiedMonth() {
		return totalOccupiedMonth;
	}

	public void setTotalOccupiedMonth(int totalOccupiedMonth) {
		this.totalOccupiedMonth = totalOccupiedMonth;
	}

	public int getRentReceivedOccupiedMonth() {
		return rentReceivedOccupiedMonth;
	}

	public void setRentReceivedOccupiedMonth(int rentReceivedOccupiedMonth) {
		this.rentReceivedOccupiedMonth = rentReceivedOccupiedMonth;
	}

	public int getRentPendingOccupiedMonth() {
		return rentPendingOccupiedMonth;
	}

	public void setRentPendingOccupiedMonth(int rentPendingOccupiedMonth) {
		this.rentPendingOccupiedMonth = rentPendingOccupiedMonth;
	}

	public double getTotalInflowMonth() {
		return totalInflowMonth;
	}

	public void setTotalInflowMonth(double totalInflowMonth) {
		this.totalInflowMonth = totalInflowMonth;
	}

	public double getAxallantChargeMonth() {
		return axallantChargeMonth;
	}

	public void setAxallantChargeMonth(double axallantChargeMonth) {
		this.axallantChargeMonth = axallantChargeMonth;
	}

	public List<PaymentSumaryMonth> getRentalSumarry() {
		return rentalSumarry;
	}

	public void setRentalSumarry(List<PaymentSumaryMonth> rentalSumarry) {
		this.rentalSumarry = rentalSumarry;
	}
	
	

}
