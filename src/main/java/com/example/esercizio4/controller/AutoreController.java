package com.example.esercizio4.controller;

import com.example.esercizio4.model.Autore;
import com.example.esercizio4.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autore")
public class AutoreController {
    @Autowired
    AutoreService autoreService;

    @GetMapping("/read")
    public Autore getById(@RequestParam int id) {
        return autoreService.read(id);
    }
    @GetMapping("/findAll")
    public List<Autore> getAll() {
        return autoreService.getAll();
    }
    @PostMapping("/insert")
    public boolean insert(@RequestBody Autore autore) {
        return autoreService.insert(autore);
    }
    @PutMapping("/update")
    public boolean update(@RequestBody Autore autore) {
        return autoreService.update(autore);
    }
    @DeleteMapping("/delete")
    public boolean delete(@RequestParam int id) {
        return autoreService.delete(id);
    }

}
