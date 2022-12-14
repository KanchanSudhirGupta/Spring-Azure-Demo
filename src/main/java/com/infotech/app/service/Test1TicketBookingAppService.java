package com.infotech.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.app.Entity.Test1TicketBookingAppEntity;
import com.infotech.app.dao.Test1TicketBookingAppDao;

@Service
public class Test1TicketBookingAppService {

	@Autowired
	
	Test1TicketBookingAppDao  test1TicketBookingAppDao;
	public Test1TicketBookingAppEntity create(Test1TicketBookingAppEntity test1TicketBookingAppEntity) {
		// TODO Auto-generated method stub
		return test1TicketBookingAppDao.save(test1TicketBookingAppEntity);
	}
	public Test1TicketBookingAppEntity getTicket(Integer ticketId) {
		// TODO Auto-generated method stub
		return test1TicketBookingAppDao.findOne(ticketId);
	}
	public Iterable<Test1TicketBookingAppEntity> allTickets() {
		// TODO Auto-generated method stub
		return test1TicketBookingAppDao.findAll();
	}
	public Test1TicketBookingAppEntity test1TicketBookingAppService(Integer ticketId, String newEmail) {
		// TODO Auto-generated method stub
		Test1TicketBookingAppEntity ticket= test1TicketBookingAppDao.findOne(ticketId);
		ticket.setEmail(newEmail);
		return test1TicketBookingAppDao.save(ticket);
	}
	public void deleteTicket(Integer ticketId) {
		// TODO Auto-generated method stub
		test1TicketBookingAppDao.delete(ticketId);
	}

}
