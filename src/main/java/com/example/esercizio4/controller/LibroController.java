package com.example.esercizio4.controller;

import com.example.esercizio4.model.Libro;
import com.example.esercizio4.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
public class LibroController {
    @Autowired
    LibroService libroService;
    @GetMapping("/read")
    public Libro read(@RequestParam int id) {return libroService.read(id);}
    @GetMapping("/findAll")
    public List<Libro> getAll() {return libroService.getAll();}
    @PostMapping("/insert")
    public boolean insert(@RequestBody Libro libro) {return libroService.insert(libro);}
    @PutMapping("/update")
    public boolean update(@RequestBody Libro libro) {return libroService.update(libro);}
    @DeleteMapping("/delete")
    public boolean delete(@RequestParam int id) {return libroService.delete(id);}
    @GetMapping("/libropergenere")
    public List<Libro> libriPerGenere(@RequestParam int id) {return libroService.libroPerGenere(id);}
}
