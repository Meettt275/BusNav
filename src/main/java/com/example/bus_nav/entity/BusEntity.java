package com.example.bus_nav.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import org.springframework.data.annotation.Id;
import jakarta.persistence.Id;


import java.time.LocalDateTime;

@Entity
public class BusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Properties from Bus entity
    private String busname;
    private String busregistrationnumber;
    private String busDescription;
    private int totalseats;

    // Properties from Passenger entity
    private String passengerName;
    private String passengerEmail;

    // Properties from Route entity
    private String routeOrigin;
    private String routeDestination;

    // Properties from Schedule entity
    private LocalDateTime scheduleDepartureTime;
    private LocalDateTime scheduleArrivalTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public String getBusregistrationnumber() {
        return busregistrationnumber;
    }

    public void setBusregistrationnumber(String busregistrationnumber) {
        this.busregistrationnumber = busregistrationnumber;
    }

    public String getBusDescription() {
        return busDescription;
    }

    public void setBusDescription(String busDescription) {
        this.busDescription = busDescription;
    }

    public int getTotalseats() {
        return totalseats;
    }

    public void setTotalseats(int totalseats) {
        this.totalseats = totalseats;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerEmail() {
        return passengerEmail;
    }

    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }

    public String getRouteOrigin() {
        return routeOrigin;
    }

    public void setRouteOrigin(String routeOrigin) {
        this.routeOrigin = routeOrigin;
    }

    public String getRouteDestination() {
        return routeDestination;
    }

    public void setRouteDestination(String routeDestination) {
        this.routeDestination = routeDestination;
    }

    public LocalDateTime getScheduleDepartureTime() {
        return scheduleDepartureTime;
    }

    public void setScheduleDepartureTime(LocalDateTime scheduleDepartureTime) {
        this.scheduleDepartureTime = scheduleDepartureTime;
    }

    public LocalDateTime getScheduleArrivalTime() {
        return scheduleArrivalTime;
    }

    public void setScheduleArrivalTime(LocalDateTime scheduleArrivalTime) {
        this.scheduleArrivalTime = scheduleArrivalTime;
    }

    public String getTicketSeatNumber() {
        return ticketSeatNumber;
    }

    public void setTicketSeatNumber(String ticketSeatNumber) {
        this.ticketSeatNumber = ticketSeatNumber;
    }

    // Properties from Ticket entity
    private String ticketSeatNumber;

}
