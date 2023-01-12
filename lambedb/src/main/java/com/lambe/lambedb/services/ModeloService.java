package com.lambe.lambedb.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lambe.lambedb.entities.Modelo;
import com.lambe.lambedb.repository.ModeloRepository;

@Service
public class ModeloService implements IModeloService {
    @Autowired
    private ModeloRepository repository;

    @Override
    public List<Modelo> getAll() {
       return (List<Modelo>)repository.findAll();
    }

    @Override
    public Modelo getById(Integer id) {
        return (Modelo) repository.findById(id).get();
    }

    public void remove(Integer id) {
        repository.deleteById(id);
    }

    public void save(Modelo customer) {
        repository.save(customer);
    }
}

