package com.axallant.rentcloud.payment;

import javax.persistence.*;

@Entity
public class UserBankAccount {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String user;
	private String bankAccountId;
	
	public UserBankAccount() {}
	
	public UserBankAccount(Long id, String user, String bankAccountId) {
		super();
		this.id = id;
		this.user = user;
		this.bankAccountId = bankAccountId;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user_id) {
		this.user = user_id;
	}
	public String getBankAccountId() {
		return bankAccountId;
	}
	public void setBankAccountId(String bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	
	
}
