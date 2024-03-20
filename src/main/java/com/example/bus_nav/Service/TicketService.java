package com.example.bus_nav.Service;

import com.example.bus_nav.Repository.TicketRepository;
import com.example.bus_nav.entity.Ticket;
import com.example.bus_nav.entity.TicketRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Long bookTicket(TicketRequest ticketRequest) {
        Ticket ticket = new Ticket();
        ticket.setPassengerName(ticketRequest.getPassengerName());
        ticket.setSeatNumber(ticketRequest.getSeatNumber());
        // Additional logic to generate ticket number or handle seat availability

        // Save the ticket to the database
        ticketRepository.save(ticket);

        // Return the ticket ID or number
        return ticket.getTicketId();
    }


    public void saveTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }
}
