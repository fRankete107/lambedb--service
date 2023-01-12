package com.lambe.lambedb.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lambe.lambedb.entities.Formadepago;
import com.lambe.lambedb.repository.FormadepagoRepository;

@Service
public class FormadepagoService implements IFormadepagoService {
    @Autowired
    private FormadepagoRepository repository;

    @Override
    public List<Formadepago> getAll() {
       return (List<Formadepago>)repository.findAll();
    }

    @Override
    public Formadepago getById(Integer id) {
        return (Formadepago) repository.findById(id).get();
    }

    public void remove(Integer id) {
        repository.deleteById(id);
    }

    public void save(Formadepago customer) {
        repository.save(customer);
    }
}

