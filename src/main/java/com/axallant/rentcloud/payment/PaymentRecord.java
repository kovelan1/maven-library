package com.axallant.rentcloud.payment;

import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long contractId;
	private String yearAndMonth;
	private Date paymentDueDate;
	private double dueAmount;
	private String tenantId;
	private String landlordId;
	private double paidAmount;
	private LocalDateTime paidDate;
	private String status;
	private String chargeId;
	private String paymentType;
	private double transferToLandload;
	private double axallantCharge;
	private double stripeCharge;
	private String tenantReceipt;
	private String landloadReceipt;
	
	public PaymentRecord() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getContractId() {
		return contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	

	public String getYearAndMonth() {
		return yearAndMonth;
	}

	public void setYearAndMonth(String yearAndMonth) {
		this.yearAndMonth = yearAndMonth;
	}

	public Date getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public double getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getLandlordId() {
		return landlordId;
	}

	public void setLandlordId(String landlordId) {
		this.landlordId = landlordId;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public LocalDateTime getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(LocalDateTime paidDate) {
		this.paidDate = paidDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getChargeId() {
		return chargeId;
	}

	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getTransferToLandload() {
		return transferToLandload;
	}

	public void setTransferToLandload(double transferToLandload) {
		this.transferToLandload = transferToLandload;
	}

	public double getAxallantCharge() {
		return axallantCharge;
	}

	public void setAxallantCharge(double axallantCharge) {
		this.axallantCharge = axallantCharge;
	}

	public double getStripeCharge() {
		return stripeCharge;
	}

	public void setStripeCharge(double stripeCharge) {
		this.stripeCharge = stripeCharge;
	}

	public String getTenantReceipt() {
		return tenantReceipt;
	}

	public void setTenantReceipt(String tenantReceipt) {
		this.tenantReceipt = tenantReceipt;
	}

	public String getLandloadReceipt() {
		return landloadReceipt;
	}

	public void setLandloadReceipt(String landloadReceipt) {
		this.landloadReceipt = landloadReceipt;
	}
	
	
	
	
}
