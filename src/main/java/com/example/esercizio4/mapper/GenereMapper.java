package com.example.esercizio4.mapper;

import com.example.esercizio4.model.Genere;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenereMapper implements RowMapper<Genere> {

    @Override
    public Genere mapRow(ResultSet rs, int rowNum) throws SQLException {
        Genere genere = new Genere();
        genere.setId(rs.getInt("id"));
        genere.setDescrizione(rs.getString("descrizione"));
        return genere;
    }
}
