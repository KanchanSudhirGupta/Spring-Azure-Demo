package com.infotech.app.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test1TicketBookingAppEntity")
public class Test1TicketBookingAppEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TicketId")	
	private Integer TicketId; 
	
	@Column(name="passenger_name",nullable=false)
	private String passenger_name;
	
	@Column(name="booking_date")
	private Date bookingDate;
	
	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="dest_station")
	private String destStation;
	
	@Column(name="email")
	private String email;

	public void setTicketId(Integer ticketId) {
		TicketId = ticketId;
	}

	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTicketId() {
		return TicketId;
	}

	public String getPassenger_name() {
		return passenger_name;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public String getDestStation() {
		return destStation;
	}

	public String getEmail() {
		return email;
	}
	
	public String toString(String source_station, String dest_station)
	{
		return "[ TicketId= "+TicketId+" ,passenger_name =" +passenger_name+" ,booking_date= "
	              +bookingDate+" ,source_station= "+ sourceStation+" ,dest_station= "+destStation+
	              " ,email= "+email+"]";
	}

}
