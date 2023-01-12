package com.lambe.lambedb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lambe.lambedb.entities.Formadepago;

@Repository
public interface FormadepagoRepository extends CrudRepository<Formadepago, Integer> {
    
}
