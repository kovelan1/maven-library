package com.axallant.rentcloud.maintenance;

import javax.persistence.PostPersist;

public class ServicerRequestListener {

	@PostPersist
	void onServiceRequestCreate(ServiceRequest serviceRequest) {
		System.out.println("on service request creation");
	}
}
