package com.example.esercizio4.DAO;

import com.example.esercizio4.mapper.LibroAutoreMapper;
import com.example.esercizio4.model.LibroAutore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class LibroAutoreDAOImpl implements LibroAutoreDAO{
    JdbcTemplate jdbcTemplate;
    private final String SQL_FIND_LIBROAUTORE = "select * from libro_autore where id_libro=?";
    private final String SQL_DELETE_LIBROAUTORE = "delete from libro_autore where id_libro=?";
    private final String SQL_UPDATE_LIBROAUTORE = "update libro_autore set id_autore = ? where id_libro = ?";
    private final String SQL_GET_ALL = "select * from libro_autore";
    private final String SQL_INSERT_LIBROAUTORE = "insert into libro_autore(id_autore, id_libro) values(?,?)";

    @Autowired
    public LibroAutoreDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public LibroAutore read(int id) {
        return jdbcTemplate.queryForObject(SQL_FIND_LIBROAUTORE, new Object[] {id}, new LibroAutoreMapper());
    }

    @Override
    public List<LibroAutore> getAll() {
        return jdbcTemplate.query(SQL_GET_ALL, new LibroAutoreMapper());
    }

    @Override
    public boolean delete(int id) {
        return jdbcTemplate.update(SQL_DELETE_LIBROAUTORE, id)>0;
    }

    @Override
    public boolean update(LibroAutore libroAutore) {
        return jdbcTemplate.update(SQL_UPDATE_LIBROAUTORE, libroAutore.getIdAutore(), libroAutore.getIdLibro())>0;
    }

    @Override
    public LibroAutore create(LibroAutore libroAutore) {
        jdbcTemplate.update(SQL_INSERT_LIBROAUTORE, libroAutore.getIdAutore(), libroAutore.getIdLibro());
        return libroAutore;
    }


}
