package com.example.esercizio4.DAO;

import com.example.esercizio4.mapper.LibroMapper;
import com.example.esercizio4.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class LibroDAOImpl implements LibroDAO{
    JdbcTemplate jdbcTemplate;
    private final String SQL_FIND_LIBRO = "select * from libro where id=?";
    private final String SQL_DELETE_LIBRO = "delete from libro where id=?";
    private final String SQL_UPDATE_LIBRO = "update libro set titolo = ?, numero_pagine = ?, anno_di_pubblicazione = ?, id_genere = ? where id = ?";
    private final String SQL_GET_ALL = "select * from libro";
    private final String SQL_INSERT_LIBRO = "insert into libro(id, titolo, numero_pagine, anno_di_pubblicazione, id_genere) values(?,?,?,?,?)";
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
    public boolean create(Libro libro) {
        return jdbcTemplate.update(SQL_INSERT_LIBRO, libro.getId(), libro.getTitolo(), libro.getNumeroPagine(), libro.getAnnoDiPubblicazione(), libro.getIdGenere())>0;
    }
}
