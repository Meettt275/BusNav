package com.example.bus_nav.Repository;

import com.example.bus_nav.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long>{

}
