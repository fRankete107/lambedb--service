package com.lambe.lambedb.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lambe.lambedb.entities.Fabricante;
import com.lambe.lambedb.repository.FabricanteRepository;

@Service
public class FabricanteService implements IFabricanteService {
    @Autowired
    private FabricanteRepository repository;

    @Override
    public List<Fabricante> getAll() {
       return (List<Fabricante>)repository.findAll();
    }

    @Override
    public Fabricante getById(Integer id) {
        return (Fabricante) repository.findById(id).get();
    }

    public void remove(Integer id) {
        repository.deleteById(id);
    }

    public void save(Fabricante customer) {
        repository.save(customer);
    }
}

