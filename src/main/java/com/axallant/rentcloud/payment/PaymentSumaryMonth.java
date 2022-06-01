package com.axallant.rentcloud.payment;

public class PaymentSumaryMonth {

	private String monthYear;
	private Double rent;
	private Double lateFee;
	private Double other;
	
	public PaymentSumaryMonth() {
		// TODO Auto-generated constructor stub
	}

	public PaymentSumaryMonth(String monthYear, Double rent, Double lateFee, Double other) {
		super();
		this.monthYear = monthYear;
		this.rent = rent;
		this.lateFee = lateFee;
		this.other = other;
	}

	public String getMonthYear() {
		return monthYear;
	}

	public void setMonthYear(String monthYear) {
		this.monthYear = monthYear;
	}

	public Double getRent() {
		return rent;
	}

	public void setRent(Double rent) {
		this.rent = rent;
	}

	public Double getLateFee() {
		return lateFee;
	}

	public void setLateFee(Double lateFee) {
		this.lateFee = lateFee;
	}

	public Double getOther() {
		return other;
	}

	public void setOther(Double other) {
		this.other = other;
	}
	
	
}
