package com.example.bus_nav.Service;

import com.example.bus_nav.Repository.PassengerRepository;
import com.example.bus_nav.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PassengerServiceImpl implements PassengerService{
    @Autowired
    private PassengerRepository passengerRepository;


    @Override
    public Passenger savePassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public List<Passenger> getAllPassenger() {
        return passengerRepository.findAll();
    }

    @Override
    public Optional<Passenger> getPassenger(long id) {
        return passengerRepository.findById(id);
    }

    @Override
    public void deletePassenger(long id) {
        passengerRepository.deleteById(id);
    }
}
