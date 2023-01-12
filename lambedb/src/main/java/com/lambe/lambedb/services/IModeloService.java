package com.lambe.lambedb.services;

import java.util.List;

import com.lambe.lambedb.entities.Modelo;

public interface IModeloService {
    List<Modelo> getAll();
    Modelo getById(Integer id);
    void remove(Integer id);
    void save(Modelo customer);
}

