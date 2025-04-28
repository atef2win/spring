package com.example.demo.services;

import com.example.demo.entities.Reservation;
import com.example.demo.repositories.IReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ReservationService implements IReservationService{
    @Autowired
    IReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveAllReservations() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversite, String nomUniversite) {
        return reservationRepository.getReservationParAnneeUniversitaireEtNomUniversite(anneeUniversite,nomUniversite);
    }

    @Override
    public Reservation createReservation(Reservation res) {
        return reservationRepository.save(res);
    }
}
