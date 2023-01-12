package com.lambe.lambedb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lambe.lambedb.entities.Facturaventa;

@Repository
public interface FacturaventaRepository extends CrudRepository<Facturaventa, Integer> {
    
}
