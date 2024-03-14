package com.example.bus_nav.Service;

import com.example.bus_nav.entity.Bus;
import com.example.bus_nav.entity.Passenger;

import java.util.List;
import java.util.Optional;

public interface PassengerService {

    public Passenger savePassenger(Passenger passenger);
    public List<Passenger> getAllPassenger();

    public Optional<Passenger> getPassenger(long id);

    public void deletePassenger(long id);
}
