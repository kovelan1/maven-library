package com.axallant.rentcloud.maintenance;

public enum MaintenanceEvent {

	ServiceRequestCreated,
	ServiceRequestApproved,
	ServiceRequestRejected,
	ServiceRequestCanceled,
	ServiceRequestUpdatedByTenant,
	ServiceRequestUpdatedByLandlord,
	ServiceRequestModificationRequested,
	QuotationReceived,
	QuatationApproved,
	QuatationRejected,
	QuotationModificationRequested,
	QuatationUpdated,
	QuatationCanceled,
	JobAssigned,
	JobAssignedUpdated,
	JobFinished,
	JobCanceled,
	JobDelayRequest,
	JobDelayNotified
}
