package com.example.bus_nav.Controller;

import com.example.bus_nav.Service.BusEntityService;
import com.example.bus_nav.entity.BusEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manage")
@CrossOrigin
public class BusEntityController  {
    @Autowired
    private BusEntityService busEntityService;
    @PostMapping("/add")
    public BusEntity addBusDetails(@RequestBody BusEntity busEntity){
        return busEntityService.saveBus(busEntity);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteBusEntity(@PathVariable long id){
        busEntityService.deleteBus(id);
    }

}
