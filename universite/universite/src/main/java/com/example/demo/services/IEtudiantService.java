package com.example.demo.services;

import com.example.demo.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> retrieveAllEtudiants();
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants);
    public Etudiant updateEtudiant(Etudiant e);
    public Etudiant retrieveEtudiant(Long idEtudiant);
    public void removeEtudiant(Long idEtudiant);
    public Etudiant addEtudiant(Etudiant et);
}
