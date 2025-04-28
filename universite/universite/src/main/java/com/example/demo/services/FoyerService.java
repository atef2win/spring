package com.example.demo.services;

import com.example.demo.entities.Bloc;
import com.example.demo.entities.Foyer;
import com.example.demo.entities.Universite;
import com.example.demo.repositories.IFoyerRepository;
import com.example.demo.repositories.IUniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoyerService implements IFoyerService{

    @Autowired
    IFoyerRepository foyerRepository;

    @Autowired
    IUniversiteRepository universiteRepository;


    @Override
    public List<Foyer> retrieveAllFoyers() {
        return (List<Foyer>) foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public Foyer affecterUniversite(Foyer foyer, Long idUniversite) {
        Universite univ = universiteRepository.findById(idUniversite).orElse(null);
        if (univ != null) {
            foyer.setUniversite(univ);
            return foyerRepository.save(foyer);
        }
        return null;
    }
}
