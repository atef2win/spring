package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private typeC TypeChambre;

    @ManyToOne
    private Bloc bloc;

    @OneToMany
    private List<Reservation> reservations;



}
