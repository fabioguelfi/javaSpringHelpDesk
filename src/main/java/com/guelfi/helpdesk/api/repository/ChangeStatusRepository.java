package com.guelfi.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.guelfi.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatus(String ticketId);
	
}