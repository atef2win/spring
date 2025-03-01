package com.example.demo.services;

import com.example.demo.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    public List<Foyer> retrieveAllFoyers();
    public Foyer addFoyer(Foyer f);
    public Foyer updateFoyer(Foyer f);
    public Foyer retrieveFoyer(Long idFoyer);
    public void removeFoyer(Long idFoyer);
}
