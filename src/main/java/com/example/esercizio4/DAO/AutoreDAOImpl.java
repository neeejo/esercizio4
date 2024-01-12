package com.example.esercizio4.DAO;

import com.example.esercizio4.mapper.AutoreMapper;
import com.example.esercizio4.model.Autore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class AutoreDAOImpl implements AutoreDAO{
    JdbcTemplate jdbcTemplate;

    private final String SQL_FIND_AUTORE = "select * from autore where id=?";
    private final String SQL_DELETE_AUTORE = "delete from autore where id=?";
    private final String SQL_UPDATE_AUTORE = "update autore set nome = ?, cognome = ?, anno_di_nascita = ? where id = ?";
    private final String SQL_GET_ALL = "select * from autore";
    private final String SQL_INSERT_AUTORE = "insert into autore(id, nome, cognome, anno_di_nascita) values(?,?,?,?)";
    @Autowired
    public AutoreDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public Autore getById(int id) {
        return jdbcTemplate.queryForObject(SQL_FIND_AUTORE, new Object[] {id}, new AutoreMapper());
    }

    @Override
    public List<Autore> getAll() {
        return jdbcTemplate.query(SQL_GET_ALL, new AutoreMapper());
    }

    @Override
    public boolean delete(int id) {
        return jdbcTemplate.update(SQL_DELETE_AUTORE, id)>0;
    }

    @Override
    public boolean update(Autore autore) {
        return jdbcTemplate.update(SQL_UPDATE_AUTORE, autore.getNome(), autore.getCognome(), autore.getAnnoDiNascita(), autore.getId())>0;
    }

    @Override
    public Autore create(Autore autore) {
        jdbcTemplate.update(SQL_INSERT_AUTORE, autore.getId(), autore.getNome(), autore.getCognome(), autore.getAnnoDiNascita());
        return autore;
    }
}
