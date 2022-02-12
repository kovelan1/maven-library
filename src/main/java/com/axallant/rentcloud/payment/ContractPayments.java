package com.axallant.rentcloud.payment;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

@Entity
public class ContractPayments {

	@Id
	private String contractPaymentId;
	private String type;
	private double amount;
	private LocalDateTime paymentDate;
	private Date dueDate;
	private String source;
	private String payee;
	private String payer;
	private long contractId;
	private String status;
	
	@Column(columnDefinition = "LONGTEXT")
	private String receiptLink;
	
	public ContractPayments() {}

	public ContractPayments(String contractPaymentId, String type, double amount, LocalDateTime paymentDate,
			String source, String payee, String payer, long contractId, String status,String receiptLink, Date dueDate) {
		super();
		this.contractPaymentId = contractPaymentId;
		this.type = type;
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.source = source;
		this.payee = payee;
		this.payer = payer;
		this.contractId = contractId;
		this.status = status;
		this.receiptLink=receiptLink;
		this.dueDate=dueDate;
	}

	public String getContractPaymentId() {
		return contractPaymentId;
	}

	public void setContractPaymentId(String contractPaymentId) {
		this.contractPaymentId = contractPaymentId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public long getContractId() {
		return contractId;
	}

	public void setContractId(long contractId) {
		this.contractId = contractId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReceiptLink() {
		return receiptLink;
	}

	public void setReceiptLink(String receiptLink) {
		this.receiptLink = receiptLink;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	
	
}
