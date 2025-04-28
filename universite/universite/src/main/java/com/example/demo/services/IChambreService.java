package com.example.demo.services;

import com.example.demo.entities.Chambre;
import com.example.demo.entities.TypeC;

import java.util.List;

public interface IChambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre addChambre(Chambre c);
    public Chambre updateChambre(Chambre c);
    public Chambre retrieveChambre(Long idChambre) ;
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeC typeChambre) ;

    List<Chambre> getChambresByBlocIdBlocAndTypeChambre (Long bloc, TypeC c) ;
    List<Chambre> getChambresParBlocEtTypeJPQL (Long idBloc, TypeC typeChambre) ;


}
