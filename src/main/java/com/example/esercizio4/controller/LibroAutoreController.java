package com.example.esercizio4.controller;

import com.example.esercizio4.model.LibroAndLibroAutore;
import com.example.esercizio4.model.LibroAutore;
import com.example.esercizio4.service.LibroAutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libroautore")
public class LibroAutoreController {
    @Autowired
    LibroAutoreService libroAutoreService;

    @GetMapping("/read")
    public LibroAutore read(@RequestParam int id) {return libroAutoreService.read(id);}
    @GetMapping("/findAll")
    public List<LibroAutore> getAll() {return libroAutoreService.getAll();}
    @PostMapping("/insert")
    public boolean insert(@RequestBody LibroAutore libroAutore) {return libroAutoreService.insert(libroAutore);}
    @PutMapping("/update")
    public boolean update(@RequestBody LibroAutore libroAutore) {return libroAutoreService.update(libroAutore);}
    @DeleteMapping("/delete")
    public boolean delete(@RequestParam int id) {return libroAutoreService.delete(id);}
    @GetMapping("/findByAuthor")
    public List<LibroAndLibroAutore> getAllByAuthor(@RequestParam int id) {return libroAutoreService.getAllByAuthor(id);}
}
