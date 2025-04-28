package com.example.demo.services;

import com.example.demo.entities.Chambre;
import com.example.demo.entities.TypeC;
import com.example.demo.repositories.IChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChambreService implements IChambreService {
    @Autowired
    IChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return (List<Chambre>) chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeC typeChambre) {
        return chambreRepository.getChambresNonReserveParNomUniversiteEtTypeChambre(nomUniversite, typeChambre);
    }

    @Override
    public List<Chambre> getChambresByBlocIdBlocAndTypeChambre(Long bloc, TypeC c) {
        return chambreRepository.getChambresByBlocIdBlocAndTypeChambre(bloc,c);
    }


    @Override
    public List<Chambre> getChambresParBlocEtTypeJPQL(Long idBloc, TypeC typeChambre) {
        return chambreRepository.getChambresParBlocEtType(idBloc,typeChambre);
    }
}
