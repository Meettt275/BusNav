package com.example.bus_nav.Repository;

import com.example.bus_nav.entity.BusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusEntityRepository extends JpaRepository<BusEntity,Long> {
}
