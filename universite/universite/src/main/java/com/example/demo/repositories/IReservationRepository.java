package com.example.demo.repositories;

import com.example.demo.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation,Long> {
    @Query("SELECT r FROM Reservation r " +
            "WHERE r.anneeUniversitaire = :givenYear " +
            "AND r.bloc.foyer.universite.nomUniversite = :nomUniv")
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date givenYear,String nomUniv);
}
