package com.lambe.lambedb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lambe.lambedb.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    
}
