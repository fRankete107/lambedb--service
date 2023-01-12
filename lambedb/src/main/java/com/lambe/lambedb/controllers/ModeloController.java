package com.lambe.lambedb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lambe.lambedb.entities.Modelo;
import com.lambe.lambedb.services.IModeloService;

@RestController
public class ModeloController {

    @Autowired
    private IModeloService service;
    
    @GetMapping("/api/modelo")
    public List<Modelo> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/modelo/{id}")
    public Modelo getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/modelo/{id}")
    public void remove(@PathVariable Integer id) {
        service.remove(id);
    }

    @PostMapping("/api/modelo/")
    public void save(@RequestBody Modelo modelo) {
        service.save(modelo);
    }
}
