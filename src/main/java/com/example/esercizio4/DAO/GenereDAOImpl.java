package com.example.esercizio4.DAO;

import com.example.esercizio4.mapper.GenereMapper;
import com.example.esercizio4.model.Genere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class GenereDAOImpl implements GenereDAO{
    JdbcTemplate jdbcTemplate;
    private final String SQL_FIND_GENERE = "select * from genere where id=?";
    private final String SQL_DELETE_GENERE = "delete from genere where id=?";
    private final String SQL_UPDATE_GENERE = "update genere set descrizione = ? where id = ?";
    private final String SQL_GET_ALL = "select * from genere";
    private final String SQL_INSERT_GENERE = "insert into genere(id, descrizione) values(?,?)";

    @Autowired
    public GenereDAOImpl(DataSource dataSource) {jdbcTemplate = new JdbcTemplate(dataSource);}

    @Override
    public Genere read(int id) {
        return jdbcTemplate.queryForObject(SQL_FIND_GENERE, new Object[] {id}, new GenereMapper());
    }

    @Override
    public List<Genere> getALl() {
        return jdbcTemplate.query(SQL_GET_ALL, new GenereMapper());
    }

    @Override
    public boolean delete(int id) {
        return jdbcTemplate.update(SQL_DELETE_GENERE, id)>0;
    }

    @Override
    public boolean update(Genere genere) {
        return jdbcTemplate.update(SQL_UPDATE_GENERE, genere.getDescrizione(), genere.getId())>0;
    }

    @Override
    public boolean create(Genere genere) {
        return jdbcTemplate.update(SQL_INSERT_GENERE, genere.getId(),genere.getDescrizione())>0;
    }
}
