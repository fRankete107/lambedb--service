package com.lambe.lambedb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lambe.lambedb.entities.Vendido;

@Repository
public interface VendidoRepository extends CrudRepository<Vendido, Integer> {
    
}
