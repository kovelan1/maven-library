package com.axallant.rentcloud.maintenance;

public enum MaintenanceEvent {
	JobStatusPending,
	JobStatusVisited,
	JobStatusJobstarted,
	JobStatusCanceled,
	JobStatusFinished,
	JobStatusRejected,
	ServiceRequestCreated,
	ServiceRequestApproved,
	ServiceRequestRejected,
	ServiceRequestCanceled,
	ServiceRequestUpdatedByTenant,
	ServiceRequestUpdatedByLandlord,
	ServiceRequestModificationRequested,
	ProviderInvited,
	QuotationReceived,
	QuotationApproved,
	QuotationRejected,
	QuotationModificationRequested,
	QuotationUpdated,
	QuotationCanceled,
	JobAssigned,
	JobAssignedUpdated,
	JobFinishedByProvider,
	JobFinishedApprovedByTenant,
	JobCanceled,
	JobDelayRequest,
	JobDelayNotified;
	
	
	public static MaintenanceEvent JobStatusChange(JobStatus jobStatus) {
		return MaintenanceEvent.values()[jobStatus.ordinal()];
	}
	
	
	 
	 
	 
	 
}
