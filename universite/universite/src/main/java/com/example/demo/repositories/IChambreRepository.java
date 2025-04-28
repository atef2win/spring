package com.example.demo.repositories;

import com.example.demo.entities.Chambre;
import com.example.demo.entities.TypeC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IChambreRepository extends JpaRepository<Chambre,Long> {

    @Query("SELECT c FROM Chambre c " +
            "WHERE c.bloc.foyer.universite.nomUniversite = :nomUniversite " +
            "AND c.typeChambre = :type " +
            "AND c.reservations IS EMPTY")
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeC type);

    public List<Chambre> getChambresByBlocIdBlocAndTypeChambre(Long bloc, TypeC c);
    @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :idBloc AND c.typeChambre = :type")
    public List<Chambre> getChambresParBlocEtType(Long idBloc, TypeC type);
}
