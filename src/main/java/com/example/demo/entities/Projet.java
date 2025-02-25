package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Projet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sujet;

    @ManyToMany(mappedBy = "projets")
    List<Equipe> equipe ;

    @OneToOne(mappedBy = "projet")
    ProjetDetail projetDetail;
}
