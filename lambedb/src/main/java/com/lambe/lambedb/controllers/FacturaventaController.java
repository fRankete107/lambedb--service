package com.lambe.lambedb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lambe.lambedb.entities.Facturaventa;
import com.lambe.lambedb.services.IFacturaventaService;

@RestController
public class FacturaventaController {

    @Autowired
    private IFacturaventaService service;
    
    @GetMapping("/api/facturaventa")
    public List<Facturaventa> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/facturaventa/{id}")
    public Facturaventa getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/facturaventa/{id}")
    public void remove(@PathVariable Integer id) {
        service.remove(id);
    }

    @PostMapping("/api/facturaventa/")
    public void save(@RequestBody Facturaventa facturaventa) {
        service.save(facturaventa);
    }
}
