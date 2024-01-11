package com.example.esercizio4.controller;

import com.example.esercizio4.model.Genere;
import com.example.esercizio4.service.GenereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genere")
public class GenereController {
    @Autowired
    GenereService genereService;

    @GetMapping("/read")
    public Genere read(@RequestParam int id) {return genereService.read(id);}
    @GetMapping("/findAll")
    public List<Genere> getAll() {return genereService.getALl();}
    @PostMapping("/insert")
    public boolean insert(@RequestBody Genere genere) {return genereService.insert(genere);}
    @PutMapping("/update")
    public boolean update(@RequestBody Genere genere) {return genereService.update(genere);}
    @DeleteMapping("/delete")
    public boolean delete(@RequestParam int id) {return genereService.delete(id);}
}
