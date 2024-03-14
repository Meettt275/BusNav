package com.example.bus_nav.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passengerId;
    private String passengerName;
    private String passengerEmail;
    private String passengerGender;

    public String getGender() {
        return passengerGender;
    }

    public void setGender(String gender) {
        passengerGender = gender;
    }

    @OneToMany(mappedBy = "passenger")
    private List<Ticket> tickets;

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return passengerName;
    }

    public void setName(String name) {
        this.passengerName = name;
    }

    public String getEmail() {
        return passengerEmail;
    }

    public void setEmail(String email) {
        this.passengerEmail = email;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
