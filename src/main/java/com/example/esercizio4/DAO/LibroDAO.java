package com.example.esercizio4.DAO;

import com.example.esercizio4.model.Libro;

import java.util.List;

public interface LibroDAO {
Libro read(int id);
List<Libro> getAll();
boolean delete(int id);
boolean update(Libro libro);
Libro create(Libro libro);
List<Libro> libriPerGenere(int id);
}
