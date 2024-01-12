package com.example.esercizio4.service;

import com.example.esercizio4.DAO.AutoreDAOImpl;
import com.example.esercizio4.model.Autore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoreService {
    @Autowired
    AutoreDAOImpl autoreDAO;

    public Autore read(int id) {
        return autoreDAO.getById(id);
    }
    public List<Autore> getAll() {
        return autoreDAO.getAll();
    }
    public Autore insert(Autore autore) {
        List<Autore> lista = autoreDAO.getAll();
        autore.setId(lista.stream().mapToInt(Autore::getId).max().orElseThrow() + 1);
        return autoreDAO.create(autore);
    }
    public boolean update(Autore autore) {
        return autoreDAO.update(autore);
    }
    public boolean delete(int id) {
        return autoreDAO.delete(id);
    }

}
