package com.example.demo.services;

import com.example.demo.entities.Bloc;

import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveBlocs();
    public Bloc updateBloc(Bloc bloc);
    public Bloc addBloc(Bloc bloc);
    public Bloc retrieveBloc(Long idBloc);
    public void removeBloc(Long idBloc);
}
