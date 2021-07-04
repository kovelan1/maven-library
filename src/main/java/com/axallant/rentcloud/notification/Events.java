package com.axallant.rentcloud.notification;

public enum Events {
	application_received,
	application_rejected,
	application_rejected_system,
	application_approved,
	application_canceled,
	contract_created,  //by LL
	contract_updated,
	contract_terminated, //by sys 
	contract_approved, //by LL
	contract_canceled, //by TN
	contract_accepted, //by Tn
	backgroud_chk_received,
	credit_chk_received,
	viewing_req_received, 
	viewing_req_rejected, //by LL
	viewing_req_canceled, //by TN
	viewing_req_approved, //by LL
	maintenance_req_posted,
	maintenance_req_approved,
	maintenance_req_accepted,
	maintenance_req_porArranged,
	maintenance_req_finish
	
}
