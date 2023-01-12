package com.lambe.lambedb.services;

import java.util.List;

import com.lambe.lambedb.entities.Tipoenvio;

public interface ITipoenvioService {
    List<Tipoenvio> getAll();
    Tipoenvio getById(Integer id);
    void remove(Integer id);
    void save(Tipoenvio customer);
}

