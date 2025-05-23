package com.example.demo.services;

import com.example.demo.entities.Foyer;
import com.example.demo.entities.Universite;
import com.example.demo.repositories.IFoyerRepository;
import com.example.demo.repositories.IUniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversiteService implements IUniversiteService{
    @Autowired
    IUniversiteRepository universiteRepository;
    @Autowired
    IFoyerRepository foyerRepository;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return (List<Universite>) universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite UpdateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite addFoyerToUniversite(long idFoyer, String nomUniversite) {
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        Universite universite = universiteRepository.findByNomUniversite(nomUniversite);

        if (foyer == null || universite == null) {
            return null;
        }
        universite.setFoyer(foyer);
        return universiteRepository.save(universite);
    }

    @Override
    public Universite RemoveFoyerFromUniversite(long idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        if (universite==null)
            return null;
        universite.setFoyer(null);
        return universiteRepository.save(universite);
    }
}
