package com.lambe.lambedb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lambe.lambedb.entities.Modelo;

@Repository
public interface ModeloRepository extends CrudRepository<Modelo, Integer> {
    
}
