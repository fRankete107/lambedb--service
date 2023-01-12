package com.lambe.lambedb.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lambe.lambedb.entities.Cliente;
import com.lambe.lambedb.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> getAll() {
       return (List<Cliente>)repository.findAll();
    }

    @Override
    public Cliente getById(Integer id) {
        return (Cliente) repository.findById(id).get();
    }

    public void remove(Integer id) {
        repository.deleteById(id);
    }

    public void save(Cliente customer) {
        repository.save(customer);
    }
}

