package com.example.esercizio4.DAO;

import com.example.esercizio4.mapper.LibroMapper;
import com.example.esercizio4.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class LibroDAOImpl implements LibroDAO{
    JdbcTemplate jdbcTemplate;
    private final String SQL_FIND_LIBRO = "select * from libri where id=?";
    private final String SQL_DELETE_LIBRO = "delete from libri where id=?";
    private final String SQL_UPDATE_LIBRO = "update libri set titolo = ?, numero_pagine = ?, anno_di_pubblicazione = ?, id_genere = ? where id = ?";
    private final String SQL_GET_ALL = "select * from libri";
    private final String SQL_INSERT_LIBRO = "insert into libri(id, titolo, numero_pagine, anno_di_pubblicazione, id_genere) values(?,?,?,?,?)";
    private final String SQL_LIBRO_PER_GENERE = "select * from libri where id_genere = ?";
    @Autowired
    public LibroDAOImpl(DataSource dataSource) {jdbcTemplate = new JdbcTemplate(dataSource);}
    @Override
    public Libro read(int id) {
        return jdbcTemplate.queryForObject(SQL_FIND_LIBRO, new Object[] {id}, new LibroMapper());
    }

    @Override
    public List<Libro> getAll() {
        return jdbcTemplate.query(SQL_GET_ALL, new LibroMapper());
    }

    @Override
    public boolean delete(int id) {
        return jdbcTemplate.update(SQL_DELETE_LIBRO, id)>0;
    }

    @Override
    public boolean update(Libro libro) {
        return jdbcTemplate.update(SQL_UPDATE_LIBRO, libro.getTitolo(), libro.getNumeroPagine(), libro.getAnnoDiPubblicazione(), libro.getIdGenere())>0;
    }

    @Override
    public Libro create(Libro libro) {
        jdbcTemplate.update(SQL_INSERT_LIBRO, libro.getId(), libro.getTitolo(), libro.getNumeroPagine(), libro.getAnnoDiPubblicazione(), libro.getIdGenere());
        return libro;
    }

    @Override
    public List<Libro> libriPerGenere(int id) {
        return jdbcTemplate.query(SQL_LIBRO_PER_GENERE, new Object[] {id}, new LibroMapper());
    }
}
