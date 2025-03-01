package com.example.demo.entities;

import jakarta.persistence.*;

import lombok.*;

@Entity
        @Getter
        @Setter
        @NoArgsConstructor
        @AllArgsConstructor

public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

    @OneToOne
    private Foyer foyer;



}
