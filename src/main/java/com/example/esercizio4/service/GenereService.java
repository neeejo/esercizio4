package com.example.esercizio4.service;

import com.example.esercizio4.DAO.GenereDAOImpl;
import com.example.esercizio4.model.Genere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenereService {
    @Autowired
    GenereDAOImpl genereDAO;

    public Genere read(int id) {return genereDAO.read(id);}
    public List<Genere> getALl() {return genereDAO.getALl();}
    public Genere insert(Genere genere) {
        List<Genere> lista = genereDAO.getALl();
        genere.setId(lista.stream().mapToInt(Genere::getId).max().orElseThrow()+1);
        return genereDAO.create(genere);
    }
    public boolean update(Genere genere) {return genereDAO.update(genere);}
    public boolean delete(int id) {return genereDAO.delete(id);}
}

