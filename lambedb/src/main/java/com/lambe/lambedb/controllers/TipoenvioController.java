package com.lambe.lambedb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lambe.lambedb.entities.Tipoenvio;
import com.lambe.lambedb.services.ITipoenvioService;

@RestController
public class TipoenvioController {

    @Autowired
    private ITipoenvioService service;
    
    @GetMapping("/api/tipoenvio")
    public List<Tipoenvio> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/tipoenvio/{id}")
    public Tipoenvio getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/tipoenvio/{id}")
    public void remove(@PathVariable Integer id) {
        service.remove(id);
    }

    @PostMapping("/api/tipoenvio/")
    public void save(@RequestBody Tipoenvio tipoenvio) {
        service.save(tipoenvio);
    }
}
