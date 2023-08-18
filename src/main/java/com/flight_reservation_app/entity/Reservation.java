package com.flight_reservation_app.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity {
	
	private boolean checkedIn;
	
	private long numberOfBags;
	
	@OneToOne
	private Passenger passenger; //passenger table is mapped to reservation table
	@OneToOne
    private Flight flight; //flight table is mapped to reservation table

	 
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public long getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(long numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}
