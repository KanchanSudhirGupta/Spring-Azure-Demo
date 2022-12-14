package com.infotech.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.app.Entity.Test1TicketBookingAppEntity;
import com.infotech.app.service.Test1TicketBookingAppService;

@RestController
@RequestMapping(value="/app/ticket")
public class Test1TicketBookingAppController {
	
	@Autowired
	Test1TicketBookingAppService test1TicketBookingAppService;
	
	@PostMapping(value="/create")
	public Test1TicketBookingAppEntity createTicket(@RequestBody Test1TicketBookingAppEntity test1TicketBookingAppEntity)
	{
		return test1TicketBookingAppService.create(test1TicketBookingAppEntity);
	}
	
	@GetMapping(value="/getTicket/{ticketId}")
	public Test1TicketBookingAppEntity getTicket(@PathVariable("ticketId") Integer ticketID)
	{
		return test1TicketBookingAppService.getTicket(ticketID);
	}
	
	@GetMapping(value="/allTickets")
	public Iterable<Test1TicketBookingAppEntity> allTickets()
	{
		return test1TicketBookingAppService.allTickets();
	}
	
	@PutMapping(value="/update/{ticketId}/{newEmail .+}")
	public Test1TicketBookingAppEntity updateTicket(@PathVariable("ticketId") Integer ticketId,@PathVariable("newEmail") String newEmail)
    {
		return test1TicketBookingAppService.test1TicketBookingAppService(ticketId,newEmail);
    }
	
	@DeleteMapping(value="/delete/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId)
	{
		test1TicketBookingAppService.deleteTicket(ticketId);
	}


}
