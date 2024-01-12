package com.example.esercizio4.DAO;

import com.example.esercizio4.mapper.LibroAndLibroAutoreMapper;
import com.example.esercizio4.model.LibroAndLibroAutore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class LibroAndLibroAutoreDAOImpl implements LibroAndLibroAutoreDAO{
    JdbcTemplate jdbcTemplate;
    private final String SQL_GET_ALL_BYAUTHOR = "select * from libri join libro_autore la on libri.id=la.id_libro  where la.id_autore = ?";
    @Autowired
    public LibroAndLibroAutoreDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<LibroAndLibroAutore> getAllByAuthor(int id) {
        return jdbcTemplate.query(SQL_GET_ALL_BYAUTHOR, new Object[] {id}, new LibroAndLibroAutoreMapper());
    }
}
