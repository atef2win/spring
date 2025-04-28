package com.example.demo.controllers;

import com.example.demo.entities.Chambre;
import com.example.demo.entities.TypeC;
import com.example.demo.services.IChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {
    @Autowired
    IChambreService chambreService;

    @GetMapping("/get-all")
    public List<Chambre> getAll(){
        return chambreService.retrieveAllChambres();
    }

    @PostMapping("/add-Chambre")
    public Chambre addChambres(@RequestBody Chambre chambre){
        return chambreService.addChambre(chambre);
    }

    @PutMapping("/update-Chambre")
    public Chambre updateChambre(@RequestBody Chambre f){
        return chambreService.updateChambre(f);
    }

    @GetMapping("/get-Chambre/{id}")
    public Chambre getChambre(@PathVariable("id") Long id){
        return chambreService.retrieveChambre(id);
    }

    @GetMapping("/get-Chambre-byNomUniversiteAndTypeChambre/{nomUniversite}/{typeChambre}")
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(@PathVariable("nomUniversite") String nomUniversite,
                                                                            @PathVariable("typeChambre") String  typeChambre){

        TypeC chambreType = TypeC.valueOf(typeChambre.toUpperCase());
        return chambreService.getChambresNonReserveParNomUniversiteEtTypeChambre(nomUniversite,chambreType);
    }


    @GetMapping("/getChambresParBlocEtTypeJPQL/{idBloc}/{typeChambre}")
    public List<Chambre> getChambresParBlocEtTypeJPQL(@PathVariable("nomUniversite") Long idBloc,
                                                                            @PathVariable("typeChambre") String  typeChambre){

        TypeC chambreType = TypeC.valueOf(typeChambre.toUpperCase());
        return chambreService.getChambresParBlocEtTypeJPQL(idBloc,chambreType);
    }

    @GetMapping("/getChambresParBlocEtType/{idBloc}/{typeChambre}")
    public List<Chambre> getChambresParBlocEtType(@PathVariable("idBloc") Long idBloc,
                                                                            @PathVariable("typeChambre") String typeChambre){

        TypeC chambreType = TypeC.valueOf(typeChambre.toUpperCase());
        return chambreService.getChambresByBlocIdBlocAndTypeChambre(idBloc,chambreType);
    }

}
