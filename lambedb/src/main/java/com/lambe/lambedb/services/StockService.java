package com.lambe.lambedb.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lambe.lambedb.entities.Stock;
import com.lambe.lambedb.repository.StockRepository;

@Service
public class StockService implements IStockService {
    @Autowired
    private StockRepository repository;

    @Override
    public List<Stock> getAll() {
       return (List<Stock>)repository.findAll();
    }

    @Override
    public Stock getById(Integer id) {
        return (Stock) repository.findById(id).get();
    }

    public void remove(Integer id) {
        repository.deleteById(id);
    }

    public void save(Stock customer) {
        repository.save(customer);
    }
}

