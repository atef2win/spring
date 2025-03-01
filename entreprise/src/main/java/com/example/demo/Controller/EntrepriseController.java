package com.example.demo.Controller;

import com.example.demo.Services.IEntrepriseService;
import com.example.demo.entities.Entreprise;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entreprise")
public class EntrepriseController {
    @Autowired
    IEntrepriseService entrepriseService;

    @PostMapping("/add-entreprise")
    public Entreprise addEntreprise(@RequestBody Entreprise ent){
        return entrepriseService.addEntreprise(ent);
    }

    @GetMapping("/getall")
    public List<Entreprise> getAll(){
        return entrepriseService.listerEntreprises();
    }

}
