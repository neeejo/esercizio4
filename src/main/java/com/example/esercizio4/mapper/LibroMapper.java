package com.example.esercizio4.mapper;

import com.example.esercizio4.model.Libro;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LibroMapper implements RowMapper<Libro> {

    @Override
    public Libro mapRow(ResultSet rs, int rowNum) throws SQLException {
        Libro libro = new Libro();
        libro.setId(rs.getInt("id"));
        libro.setTitolo(rs.getString("titolo"));
        libro.setNumeroPagine(rs.getInt("numero_pagine"));
        libro.setAnnoDiPubblicazione(rs.getDate("anno_di_pubblicazione"));
        libro.setIdGenere(rs.getInt("id_genere"));
        return libro;
    }
}
