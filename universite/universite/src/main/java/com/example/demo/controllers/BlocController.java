package com.example.demo.controllers;

import com.example.demo.entities.Bloc;
import com.example.demo.services.IBlocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/bloc")
public class BlocController {
    @Autowired
    IBlocService blocService;

    @GetMapping("/get-all")
    public List<Bloc> getAll(){
        return blocService.retrieveBlocs();
    }

    @PostMapping("/add-Bloc")
    public Bloc addBlocs(@RequestBody Bloc bloc){
        return blocService.addBloc(bloc);
    }

    @PutMapping("/update-Bloc")
    public Bloc updateBloc(@RequestBody Bloc f){
        return blocService.updateBloc(f);
    }

    @GetMapping("/get-Bloc/{id}")
    public Bloc getBloc(@PathVariable("id") Long id){
        return blocService.retrieveBloc(id);
    }
    @DeleteMapping("/delete-Bloc/{id}")
    public void removeBloc(@PathVariable("id") Long id){
        blocService.removeBloc(id);
    }

    @PutMapping("/{idBloc}/add-chambres-list")
    public Bloc addChambresToBloc(@PathVariable("idBloc") Long idBloc, @RequestBody List<Long> numChambres) {
        return blocService.addChambresToBloc(numChambres, idBloc);
    }
}
