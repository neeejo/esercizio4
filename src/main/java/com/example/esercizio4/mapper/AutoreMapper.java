package com.example.esercizio4.mapper;

import com.example.esercizio4.model.Autore;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AutoreMapper implements RowMapper<Autore> {

    @Override
    public Autore mapRow(ResultSet rs, int rowNum) throws SQLException {
        Autore autore = new Autore();
        autore.setId(rs.getInt("id"));
        autore.setNome(rs.getString("nome"));
        autore.setCognome(rs.getString("cognome"));
        autore.setAnnoDiNascita(rs.getInt("anno_di_nascita"));
        return autore;
    }
}
