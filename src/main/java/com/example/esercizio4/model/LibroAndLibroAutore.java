package com.example.esercizio4.model;

public class LibroAndLibroAutore {
    private Libro libro;
    private LibroAutore libroAutore;

    public LibroAndLibroAutore(Libro libro, LibroAutore libroAutore) {
        this.libro = libro;
        this.libroAutore = libroAutore;
    }
    public LibroAndLibroAutore() {
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LibroAutore getLibroAutore() {
        return libroAutore;
    }

    public void setLibroAutore(LibroAutore libroAutore) {
        this.libroAutore = libroAutore;
    }

    @Override
    public String toString() {
        return "LibroAndLibroAutore{" +
                "libro=" + libro +
                ", libroAutore=" + libroAutore +
                '}';
    }
}
