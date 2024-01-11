package com.example.esercizio4.model;

import java.util.Date;

public class Libro {
    private int id;
    private String titolo;
    private int numeroPagine;
    private Date annoDiPubblicazione;
    private int idGenere;

    public Libro(int id, String titolo, int numeroPagine, Date annoDiPubblicazione, int idGenere) {
        this.id = id;
        this.titolo = titolo;
        this.numeroPagine = numeroPagine;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.idGenere = idGenere;
    }

    public Libro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public Date getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(Date annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public int getIdGenere() {
        return idGenere;
    }

    public void setIdGenere(int idGenere) {
        this.idGenere = idGenere;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", numeroPagine=" + numeroPagine +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", idGenere=" + idGenere +
                '}';
    }
}
