package com.example.bus_nav.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passengerId;
    private String passenger_name;
    private String passenger_email;
    private String passenger_gender;


    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getGender() {
        return passenger_gender;
    }

    public void setGender(String gender) {
        passenger_gender = gender;
    }

//    @OneToMany(mappedBy = "passenger")
//    private List<Ticket> tickets;

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return passenger_name;
    }

    public void setName(String name) {
        this.passenger_name = name;
    }

    public String getEmail() {
        return passenger_email;
    }

    public void setEmail(String email) {
        this.passenger_email = email;
    }

//    public List<Ticket> getTickets() {
//        return tickets;
//    }
//
//    public void setTickets(List<Ticket> tickets) {
//        this.tickets = tickets;
//    }
}
