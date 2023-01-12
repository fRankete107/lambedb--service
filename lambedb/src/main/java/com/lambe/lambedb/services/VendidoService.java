package com.lambe.lambedb.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lambe.lambedb.entities.Vendido;
import com.lambe.lambedb.repository.VendidoRepository;

@Service
public class VendidoService implements IVendidoService {
    @Autowired
    private VendidoRepository repository;

    @Override
    public List<Vendido> getAll() {
       return (List<Vendido>)repository.findAll();
    }

    @Override
    public Vendido getById(Integer id) {
        return (Vendido) repository.findById(id).get();
    }

    public void remove(Integer id) {
        repository.deleteById(id);
    }

    public void save(Vendido customer) {
        repository.save(customer);
    }
}

