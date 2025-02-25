package com.example.demo.Services;

import com.example.demo.entities.Entreprise;

import java.util.List;

public interface IEntrepriseService{
    public Entreprise addEntreprise(Entreprise ent);
    public List<Entreprise> listerEntreprises();
    public Entreprise getEntrepriseById(Long id);
    public void deleteEntrepriseById(Long id);

}
