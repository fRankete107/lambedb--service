package com.lambe.lambedb.services;

import java.util.List;

import com.lambe.lambedb.entities.Formadepago;

public interface IFormadepagoService {
    List<Formadepago> getAll();
    Formadepago getById(Integer id);
    void remove(Integer id);
    void save(Formadepago customer);
}

