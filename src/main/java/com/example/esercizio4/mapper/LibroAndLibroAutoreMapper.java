package com.example.esercizio4.mapper;

import com.example.esercizio4.model.Libro;
import com.example.esercizio4.model.LibroAndLibroAutore;
import com.example.esercizio4.model.LibroAutore;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LibroAndLibroAutoreMapper implements RowMapper<LibroAndLibroAutore> {
    @Override
    public LibroAndLibroAutore mapRow(ResultSet rs, int rowNum) throws SQLException {
        LibroAndLibroAutore libroAndLibroAutore = new LibroAndLibroAutore();
        Libro libro = new Libro();
        libro.setId(rs.getInt("id"));
        libro.setTitolo(rs.getString("titolo"));
        libro.setNumeroPagine(rs.getInt("numero_pagine"));
        libro.setAnnoDiPubblicazione(rs.getDate("anno_di_pubblicazione"));
        libro.setIdGenere(rs.getInt("id_genere"));
        LibroAutore libroAutore = new LibroAutore();
        libroAutore.setIdLibro(rs.getInt("id_libro"));
        libroAutore.setIdAutore(rs.getInt("id_autore"));
        libroAndLibroAutore.setLibro(libro);
        libroAndLibroAutore.setLibroAutore(libroAutore);
        return libroAndLibroAutore;
    }
}
