package com.example.demo.controllers;

import com.example.demo.entities.Reservation;
import com.example.demo.services.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    IReservationService reservationService;

    @GetMapping("/get-all")
    public List<Reservation> retrieveAllReservations(){
        return reservationService.retrieveAllReservations();
    }
    @PutMapping("/update-reservation")
    public Reservation updateReservation(Reservation res){
        return reservationService.updateReservation(res);
    }

    @GetMapping("/get-reservation/{id}")
    public Reservation retrieveReservation(@PathVariable("id") Long id){
        return reservationService.retrieveReservation(id);
    }
}
