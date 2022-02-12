package com.axallant.rentcloud.payment;

import java.util.List;

public class BulkPaymentRequest {

	public List<PaymentRecord> paymentRecords;
	public List<PaymentRecord> aditionalPayments;
	
	public BulkPaymentRequest() {
		// TODO Auto-generated constructor stub
	}
	
	public List<PaymentRecord> getPaymentRecords() {
		return paymentRecords;
	}
	public void setPaymentRecords(List<PaymentRecord> paymentRecords) {
		this.paymentRecords = paymentRecords;
	}
	public List<PaymentRecord> getAditionalPayments() {
		return aditionalPayments;
	}
	public void setAditionalPayments(List<PaymentRecord> aditionalPayments) {
		this.aditionalPayments = aditionalPayments;
	}
	
	
}
