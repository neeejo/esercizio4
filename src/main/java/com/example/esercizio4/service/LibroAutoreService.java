package com.example.esercizio4.service;

import com.example.esercizio4.DAO.LibroAndLibroAutoreDAOImpl;
import com.example.esercizio4.DAO.LibroAutoreDAOImpl;
import com.example.esercizio4.model.LibroAndLibroAutore;
import com.example.esercizio4.model.LibroAutore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroAutoreService {
    @Autowired
    LibroAutoreDAOImpl libroAutoreDAO;
    @Autowired
    LibroAndLibroAutoreDAOImpl libroAndLibroAutoreDAO;

    public LibroAutore read(int id) {return libroAutoreDAO.read(id);}

    public List<LibroAutore> getAll() {return libroAutoreDAO.getAll();}
    public LibroAutore insert(LibroAutore libroAutore) {return libroAutoreDAO.create(libroAutore);}
    public boolean update(LibroAutore libroAutore) {return libroAutoreDAO.update(libroAutore);}
    public boolean delete(int id) {return libroAutoreDAO.delete(id);}
    public List<LibroAndLibroAutore> getAllByAuthor(int id) {return libroAndLibroAutoreDAO.getAllByAuthor(id);}
}
