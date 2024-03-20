package com.example.bus_nav.Controller;

import com.example.bus_nav.Service.TicketBookingService;
import com.example.bus_nav.entity.BookingRequest;
import com.example.bus_nav.entity.Ticket;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class BookingController {

@Autowired
    public TicketBookingService bookingService;
    @PostMapping("/book-ticket")
    public ResponseEntity<String> bookTicket(@RequestBody BookingRequest bookingRequest) {
        String ticketNumber = bookingService.bookTicket(bookingRequest.getPassengerName(), bookingRequest.getSeatNumber());
        return new ResponseEntity<>(ticketNumber, HttpStatus.CREATED);
    }





}
