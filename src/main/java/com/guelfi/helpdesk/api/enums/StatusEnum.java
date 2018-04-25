package com.guelfi.helpdesk.api.enums;

public enum StatusEnum {

	New,
	Assigned,
	Resolved,
	Approved,
	Disapproved,
	Closed;
	
	public static StatusEnum getStatus(String status) {
		switch(status) {
		case "new" : return New;
		case "Assigned" : return Assigned;
		case "Resolved" : return Resolved;
		case "Approved" : return Approved;
		case "Disapproved" : return Disapproved;
		case "Close" : return Closed;
		default : return New;
		}
	}
	
}
