package com.example.demo.Services;

import com.example.demo.Repositories.IEntrepriseRepository;
import com.example.demo.entities.Entreprise;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@AllArgsConstructor
public class EntrepriseService implements IEntrepriseService{
    @Autowired
    IEntrepriseRepository  entrepriseRepository;
    @Override
    public Entreprise addEntreprise(Entreprise ent) {
        return entrepriseRepository.save(ent);
    }

    @Override
    public List<Entreprise> listerEntreprises() {
        return (List<Entreprise>) entrepriseRepository.findAll();
    }

    @Override
    public Entreprise getEntrepriseById(Long id) {
        return entrepriseRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEntrepriseById(Long id) {
            entrepriseRepository.deleteById(id);
    }

}
