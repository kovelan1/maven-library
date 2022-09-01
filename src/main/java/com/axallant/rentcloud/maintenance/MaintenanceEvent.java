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
	QuatationApproved,
	QuatationRejected,
	QuotationModificationRequested,
	QuatationUpdated,
	QuatationCanceled,
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
