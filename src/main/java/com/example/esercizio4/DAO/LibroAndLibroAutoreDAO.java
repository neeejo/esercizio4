package com.example.esercizio4.DAO;

import com.example.esercizio4.model.LibroAndLibroAutore;

import java.util.List;

public interface LibroAndLibroAutoreDAO {

    List<LibroAndLibroAutore> getAllByAuthor(int id);
}
