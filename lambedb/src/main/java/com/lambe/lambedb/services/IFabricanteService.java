package com.lambe.lambedb.services;

import java.util.List;

import com.lambe.lambedb.entities.Fabricante;

public interface IFabricanteService {
    List<Fabricante> getAll();
    Fabricante getById(Integer id);
    void remove(Integer id);
    void save(Fabricante customer);
}

