package com.example.esercizio4.service;

import com.example.esercizio4.DAO.LibroDAOImpl;
import com.example.esercizio4.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    LibroDAOImpl libroDAO;

    public Libro read(int id) {return libroDAO.read(id);}
    public List<Libro> getAll() {return libroDAO.getAll();}
    public boolean insert(Libro libro) {
        List<Libro> lista = libroDAO.getAll();
        libro.setId(lista.stream().mapToInt(Libro::getId).max().orElseThrow() + 1);
        return libroDAO.create(libro);
    }
    public boolean update(Libro libro) {return libroDAO.update(libro);}
    public boolean delete(int id) {return libroDAO.delete(id);}
}
