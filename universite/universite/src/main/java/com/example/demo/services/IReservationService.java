package com.example.demo.services;

import com.example.demo.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation updateReservation(Reservation r);
    public Reservation retrieveReservation(Long idReservation);
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversite, String nomUniversite) ;


    Reservation createReservation(Reservation res);
}
