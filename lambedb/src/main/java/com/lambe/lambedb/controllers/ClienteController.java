package com.lambe.lambedb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lambe.lambedb.entities.Cliente;
import com.lambe.lambedb.services.IClienteService;

@RestController
public class ClienteController {

    @Autowired
    private IClienteService service;
    
    @GetMapping("/api/cliente")
    public List<Cliente> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/cliente/{id}")
    public Cliente getById(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @DeleteMapping("/api/cliente/{id}")
    public void remove(@PathVariable Integer id) {
        service.remove(id);
    }

    @PostMapping("/api/cliente/")
    public void save(@RequestBody Cliente cliente) {
        service.save(cliente);
    }
}
