package com.lambe.lambedb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lambe.lambedb.entities.Tipoenvio;

@Repository
public interface TipoenvioRepository extends CrudRepository<Tipoenvio, Integer> {
    
}
