package com.lambe.lambedb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lambe.lambedb.entities.Vendido;
import com.lambe.lambedb.services.IVendidoService;

@RestController
public class VendidoController {

    @Autowired
    private IVendidoService service;
    
    @GetMapping("/api/vendido")
    public List<Vendido> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/vendido/{id}")
    public Vendido getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/vendido/{id}")
    public void remove(@PathVariable Integer id) {
        service.remove(id);
    }

    @PostMapping("/api/vendido/")
    public void save(@RequestBody Vendido vendido) {
        service.save(vendido);
    }
}
