package com.flight_reservation_app.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight_reservation_app.dto.ReservationRequest;
import com.flight_reservation_app.entity.Flight;
import com.flight_reservation_app.entity.Passenger;
import com.flight_reservation_app.entity.Reservation;
import com.flight_reservation_app.repository.FlightRepository;
import com.flight_reservation_app.repository.PassengerRepository;
import com.flight_reservation_app.repository.ReservationRepository;
import com.flight_reservation_app.util.EmailUtil;
import com.flight_reservation_app.util.PDFgenerator;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	@Autowired
	private PDFgenerator pdfGenerator;
	
	@Autowired
	private EmailUtil emailUtil;



	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		
		
		Passenger passenger= new Passenger();
		passenger.setFirstName(request.getFirstName());
		passenger.setLastName(request.getLastName());
		passenger.setMiddleName(request.getLastName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		passengerRepo.save(passenger);
		
		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		
		
		String filePath = "D:\\sb_code\\flight_reservation_app\\tickets\\reservation"+reservation.getId()+".pdf";
		
		Reservation savedReservation = reservationRepo.save(reservation);
		
	
		pdfGenerator.generateItinerary(reservation, filePath);
		emailUtil.sendItinerary(passenger.getEmail(), filePath);

		
		return savedReservation;
		
		
	}

}
