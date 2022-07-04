package com.axallant.rentcloud.maintenance;

import com.axallant.rentcloud.common.UserDetails;
import com.axallant.rentcloud.contract.Contract;
import com.axallant.rentcloud.models.Address;
import com.axallant.rentcloud.propertiy.ViewRenatlEntity;
import com.axallant.rentcloud.user.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MaintenanaceProviderViewDTO {

	private String unit;
	private Address propertyAddress;
	private UserDetails landlord;
	private UserDetails tenant;
	private ServiceRequest serviceRequest;
}
