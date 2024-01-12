package com.example.esercizio4.mapper;

import com.example.esercizio4.model.Libro;
import com.example.esercizio4.model.LibroAutore;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LibroAutoreMapper implements RowMapper<LibroAutore> {
    @Override
    public LibroAutore mapRow(ResultSet rs, int rowNum) throws SQLException {

            LibroAutore libroAutore = new LibroAutore();
            libroAutore.setIdAutore(rs.getInt("id_autore"));
            libroAutore.setIdLibro(rs.getInt("id_libro"));
            return libroAutore;
    }
}
