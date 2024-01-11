package com.example.esercizio4.model;

public class Genere {
    private int id;
    private String descrizione;

    public Genere(int id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }

    public Genere() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Genere{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
