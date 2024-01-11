package com.example.esercizio4.model;

public class Autore {
    private int id;
    private String nome;
    private String cognome;
    private int annoDiNascita;

    public Autore() {};

    public Autore(int id, String nome, String cognome, int annoDiNascita) {
        this.id=id;
        this.nome=nome;
        this.cognome=cognome;
        this.annoDiNascita=annoDiNascita;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome=nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome=cognome;
    }

    public int getAnnoDiNascita() {
        return annoDiNascita;
    }

    public void setAnnoDiNascita(int annoDiNascita) {
        this.annoDiNascita = annoDiNascita;
    }

    @Override
    public String toString() {
        return "Autore{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", annoDiNascita=" + annoDiNascita +
                '}';
    }
}
