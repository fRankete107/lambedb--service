package com.lambe.lambedb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lambe.lambedb.entities.Stock;

@Repository
public interface StockRepository extends CrudRepository<Stock, Integer> {
    
}
