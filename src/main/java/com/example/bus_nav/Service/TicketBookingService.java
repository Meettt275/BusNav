package com.example.bus_nav.Service;

import com.example.bus_nav.Repository.TicketRepository;
import com.example.bus_nav.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TicketBookingService {
    @Autowired
public TicketRepository ticketRepository;
    public String bookTicket(String passengerName, String seatNumber) {
        // Generate a unique ticket number
        String ticketNumber = UUID.randomUUID().toString();

        // Save the booked ticket to the database
        Ticket ticket = new Ticket();
        ticket.setPassengerName(passengerName);
        ticket.setSeatNumber(seatNumber);
        ticket.setTicketNumber(ticketNumber);
        // Set other ticket details as needed
        ticketRepository.save(ticket);

        // Return the generated ticket number
        return ticketNumber;
    }


}
