package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private Date anneeUniversitaire ;
    private boolean estValide;

    @ManyToOne
    private Bloc bloc;

    @ManyToMany
    private List<Etudiant> etudiants;


}
