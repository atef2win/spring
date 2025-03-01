package com.example.demo.repositories;

import com.example.demo.entities.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEtudiantRepository extends CrudRepository<Etudiant,Long> {
}
