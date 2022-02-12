package com.axallant.rentcloud.payment;

public class ApplicationFeeModel {
	
	private int amount;
	private String  userName;
	private String customerId;
	private long contractId;
	private String currency;
	
	
	public ApplicationFeeModel() {}


	public ApplicationFeeModel(int amount, String userName, String customerId, long contractId, String currency) {
		super();
		this.amount = amount;
		this.userName = userName;
		this.customerId = customerId;
		this.contractId = contractId;
		this.currency = currency;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public long getContractId() {
		return contractId;
	}


	public void setContractId(long contractId) {
		this.contractId = contractId;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}

	
	

}
