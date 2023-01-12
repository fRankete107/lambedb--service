package com.lambe.lambedb.services;

import java.util.List;

import com.lambe.lambedb.entities.Stock;

public interface IStockService {
    List<Stock> getAll();
    Stock getById(Integer id);
    void remove(Integer id);
    void save(Stock customer);
}

