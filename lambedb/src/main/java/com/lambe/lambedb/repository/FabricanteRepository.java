package com.lambe.lambedb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lambe.lambedb.entities.Fabricante;

@Repository
public interface FabricanteRepository extends CrudRepository<Fabricante, Integer> {
    
}
