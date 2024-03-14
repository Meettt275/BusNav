package com.example.bus_nav.Controller;

import com.example.bus_nav.Service.PassengerService;
import com.example.bus_nav.entity.Bus;
import com.example.bus_nav.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Passenger")
@CrossOrigin
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @PostMapping("/add")
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        return passengerService.savePassenger(passenger);
    }

    @GetMapping("/getAll")
    public List<Passenger> getAllPassenger(){
        return passengerService.getAllPassenger();
    }

    @GetMapping("/get/{id}")
    public Optional<Passenger> getPassenger(@PathVariable long id){
        return passengerService.getPassenger(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePassenger(@PathVariable long id) {
        passengerService.deletePassenger(id);
    }
}
