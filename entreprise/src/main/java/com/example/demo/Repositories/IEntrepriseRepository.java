package com.example.demo.Repositories;

import com.example.demo.entities.Entreprise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntrepriseRepository extends CrudRepository<Entreprise,Long> {
}
