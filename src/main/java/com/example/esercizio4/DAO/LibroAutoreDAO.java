package com.example.esercizio4.DAO;

import com.example.esercizio4.model.LibroAutore;

import java.util.List;

public interface LibroAutoreDAO {
    LibroAutore read(int id);
    List<LibroAutore> getAll();
    boolean delete(int id);
    boolean update(LibroAutore libroAutore);
    boolean create(LibroAutore libroAutore);
}
