package com.lambe.lambedb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lambe.lambedb.entities.Stock;
import com.lambe.lambedb.services.IStockService;

@RestController
public class StockController {

    @Autowired
    private IStockService service;
    
    @GetMapping("/api/stock")
    public List<Stock> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/stock/{id}")
    public Stock getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/stock/{id}")
    public void remove(@PathVariable Integer id) {
        service.remove(id);
    }

    @PostMapping("/api/stock/")
    public void save(@RequestBody Stock stock) {
        service.save(stock);
    }
}
