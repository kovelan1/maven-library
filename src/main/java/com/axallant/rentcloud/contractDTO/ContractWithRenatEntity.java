package com.axallant.rentcloud.contractDTO;

import com.axallant.rentcloud.contract.Contract;
import com.axallant.rentcloud.propertiy.ViewRenatlEntity;

public class ContractWithRenatEntity {

	private Contract contract;
	private ViewRenatlEntity rentalEntity;
	
	public ContractWithRenatEntity() {
		// TODO Auto-generated constructor stub
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public ViewRenatlEntity getRentalEntity() {
		return rentalEntity;
	}

	public void setRentalEntity(ViewRenatlEntity rentalEntity) {
		this.rentalEntity = rentalEntity;
	}
	
	
}
