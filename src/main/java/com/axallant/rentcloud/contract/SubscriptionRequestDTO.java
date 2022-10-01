package com.axallant.rentcloud.contract;

import java.util.Date;

public class SubscriptionRequestDTO {
	
	private boolean subscription;
	private long contractId;
	private String primaryLandlordId;
	private String primaryTenantId;
	private int paymentDay;
	private Date contractStartDate;
	private Date contractEndDate;
	private Date subscriptionEndDate;
	private Date subscriptionStartDate;
	private int iterations;
	private String customerId;
	private String accountId;
	private double applicationFee;
	private double rent;
	private Contract contract;
	 

	SubscriptionRequestDTO(){
		
	}


	public long getContractId() {
		return contractId;
	}


	public void setContractId(long contractId) {
		this.contractId = contractId;
	}
	


	public String getPrimaryLandlordId() {
		return primaryLandlordId;
	}


	public void setPrimaryLandlordId(String primaryLandlordId) {
		this.primaryLandlordId = primaryLandlordId;
	}


	public String getPrimaryTenantId() {
		return primaryTenantId;
	}


	public void setPrimaryTenantId(String primaryTenantId) {
		this.primaryTenantId = primaryTenantId;
	}


	public int getPaymentDay() {
		return paymentDay;
	}


	public void setPaymentDay(int paymentDay) {
		this.paymentDay = paymentDay;
	}


	public Date getContractStartDate() {
		return contractStartDate;
	}


	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}


	public Date getContractEndDate() {
		return contractEndDate;
	}


	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}


	public Date getSubscriptionEndDate() {
		return subscriptionEndDate;
	}


	public void setSubscriptionEndDate(Date subscriptionEndDate) {
		this.subscriptionEndDate = subscriptionEndDate;
	}


	public Date getSubscriptionStartDate() {
		return subscriptionStartDate;
	}


	public void setSubscriptionStartDate(Date subscriptionStartDate) {
		this.subscriptionStartDate = subscriptionStartDate;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getAccountId() {
		return accountId;
	}


	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}


	public double getApplicationFee() {
		return applicationFee;
	}


	public void setApplicationFee(double applicationFee) {
		this.applicationFee = applicationFee;
	}


	public double getRent() {
		return rent;
	}


	public void setRent(double rent) {
		this.rent = rent;
	}


	public boolean isSubscription() {
		return subscription;
	}


	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}


	public Contract getContract() {
		return contract;
	}


	public void setContract(Contract contract) {
		this.contract = contract;
	}


	public int getIterations() {
		return iterations;
	}


	public void setIterations(int iterations) {
		this.iterations = iterations;
	}
	
	
}
