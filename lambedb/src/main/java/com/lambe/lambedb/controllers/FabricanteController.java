package com.lambe.lambedb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lambe.lambedb.entities.Fabricante;
import com.lambe.lambedb.services.IFabricanteService;

@RestController
public class FabricanteController {

    @Autowired
    private IFabricanteService service;
    
    @GetMapping("/api/fabricante")
    public List<Fabricante> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/fabricante/{id}")
    public Fabricante getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/fabricante/{id}")
    public void remove(@PathVariable Integer id) {
        service.remove(id);
    }

    @PostMapping("/api/fabricante/")
    public void save(@RequestBody Fabricante fabricante) {
        service.save(fabricante);
    }
}
