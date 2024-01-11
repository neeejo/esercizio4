package com.example.esercizio4.model;

public class LibroAutore {
    private int idAutore;
    private int idLibro;

    public LibroAutore(int idAutore, int idLibro) {
        this.idAutore = idAutore;
        this.idLibro = idLibro;
    }

    public LibroAutore() {
    }

    public int getIdAutore() {
        return idAutore;
    }

    public void setIdAutore(int idAutore) {
        this.idAutore = idAutore;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    @Override
    public String toString() {
        return "LibroAutore{" +
                "idAutore=" + idAutore +
                ", idLibro=" + idLibro +
                '}';
    }
}
