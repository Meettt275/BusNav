package com.example.bus_nav.Service;

import com.example.bus_nav.Repository.BusEntityRepository;
import com.example.bus_nav.entity.BusEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusEntityServiceImpl implements BusEntityService {

    @Autowired
    public BusEntityRepository busEntityRepository;
    @Override
    public BusEntity saveBus(BusEntity bus) {
        return busEntityRepository.save(bus);
    }

    @Override
    public List<BusEntity> getAllBus() {
        return busEntityRepository.findAll();
    }

    @Override
    public Optional<BusEntity> getBus(long id) {
        return busEntityRepository.findById(id);
    }

    @Override
    public void deleteBus(long id) {
        busEntityRepository.deleteById(id);
    }
}
