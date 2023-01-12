package com.lambe.lambedb.services;

import java.util.List;

import com.lambe.lambedb.entities.Cliente;

public interface IClienteService {
    List<Cliente> getAll();
    Cliente getById(Integer id);
    void remove(Integer id);
    void save(Cliente customer);
}

