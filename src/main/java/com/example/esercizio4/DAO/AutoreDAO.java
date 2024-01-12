package com.example.esercizio4.DAO;

import com.example.esercizio4.model.Autore;

import java.util.List;

public interface AutoreDAO {
    Autore getById(int id);

    List<Autore> getAll();

    boolean delete(int id);
    boolean update(Autore autore);

    Autore create(Autore autore);

}
