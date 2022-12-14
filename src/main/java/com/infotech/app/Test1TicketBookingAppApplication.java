package com.infotech.app;

import java.util.Date;

import javax.sql.DataSource;
import javax.swing.Spring;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infotech.app.Entity.Test1TicketBookingAppEntity;
import com.infotech.app.service.Test1TicketBookingAppService;




@SpringBootApplication
public class Test1TicketBookingAppApplication implements CommandLineRunner {

	@Autowired
	private Test1TicketBookingAppService ticketBookingService;
	
	@Autowired
	//provides connection object for transactions
	private DataSource dataSource;
	

	public static void main(String[] args)
	{
	
		SpringApplication.run(Test1TicketBookingAppApplication.class, args);	
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Test1TicketBookingAppEntity ticket=new Test1TicketBookingAppEntity();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Mumbai");
		ticket.setSourceStation("Pune");
		ticket.setPassenger_name("Aadhavan");
		ticket.setEmail("Aadhavan@gmail.com");
		ticketBookingService.create(ticket);
		System.out.println("DataSource: "+dataSource);
	
	}
}
