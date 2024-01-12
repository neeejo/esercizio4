package com.example.esercizio4.DAO;

import com.example.esercizio4.model.Genere;

import java.util.List;

public interface GenereDAO {
    Genere read(int id);
    List<Genere> getALl();
    boolean delete(int id);
    boolean update(Genere genere);
    Genere create(Genere genere);
}
