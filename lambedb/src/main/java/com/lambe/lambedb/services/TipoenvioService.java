package com.lambe.lambedb.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lambe.lambedb.entities.Tipoenvio;
import com.lambe.lambedb.repository.TipoenvioRepository;

@Service
public class TipoenvioService implements ITipoenvioService {
    @Autowired
    private TipoenvioRepository repository;

    @Override
    public List<Tipoenvio> getAll() {
       return (List<Tipoenvio>)repository.findAll();
    }

    @Override
    public Tipoenvio getById(Integer id) {
        return (Tipoenvio) repository.findById(id).get();
    }

    public void remove(Integer id) {
        repository.deleteById(id);
    }

    public void save(Tipoenvio customer) {
        repository.save(customer);
    }
}

