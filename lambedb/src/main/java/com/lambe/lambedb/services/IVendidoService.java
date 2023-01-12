package com.lambe.lambedb.services;

import java.util.List;

import com.lambe.lambedb.entities.Vendido;

public interface IVendidoService {
    List<Vendido> getAll();
    Vendido getById(Integer id);
    void remove(Integer id);
    void save(Vendido customer);
}

