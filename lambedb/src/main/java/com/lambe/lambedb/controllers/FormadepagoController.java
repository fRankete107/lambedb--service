package com.lambe.lambedb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lambe.lambedb.entities.Formadepago;
import com.lambe.lambedb.services.IFormadepagoService;

@RestController
public class FormadepagoController {

    @Autowired
    private IFormadepagoService service;
    
    @GetMapping("/api/formadepago")
    public List<Formadepago> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/formadepago/{id}")
    public Formadepago getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/formadepago/{id}")
    public void remove(@PathVariable Integer id) {
        service.remove(id);
    }

    @PostMapping("/api/formadepago/")
    public void save(@RequestBody Formadepago formadepago) {
        service.save(formadepago);
    }
}
