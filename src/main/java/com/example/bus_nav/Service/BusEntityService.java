package com.example.bus_nav.Service;

import com.example.bus_nav.entity.Bus;
import com.example.bus_nav.entity.BusEntity;

import java.util.List;
import java.util.Optional;

public interface BusEntityService {
    public BusEntity saveBus(BusEntity bus);
    public List<BusEntity> getAllBus();

    public Optional<BusEntity> getBus(long id);

    public void deleteBus(long id);
}
