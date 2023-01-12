package com.lambe.lambedb.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lambe.lambedb.entities.Facturaventa;
import com.lambe.lambedb.repository.FacturaventaRepository;

@Service
public class FacturaventaService implements IFacturaventaService {
    @Autowired
    private FacturaventaRepository repository;

    @Override
    public List<Facturaventa> getAll() {
       return (List<Facturaventa>)repository.findAll();
    }

    @Override
    public Facturaventa getById(Integer id) {
        return (Facturaventa) repository.findById(id).get();
    }

    public void remove(Integer id) {
        repository.deleteById(id);
    }

    public void save(Facturaventa customer) {
        repository.save(customer);
    }
}

