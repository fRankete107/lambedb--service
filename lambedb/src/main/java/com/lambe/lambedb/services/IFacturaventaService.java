package com.lambe.lambedb.services;

import java.util.List;

import com.lambe.lambedb.entities.Facturaventa;

public interface IFacturaventaService {
    List<Facturaventa> getAll();
    Facturaventa getById(Integer id);
    void remove(Integer id);
    void save(Facturaventa customer);
}

