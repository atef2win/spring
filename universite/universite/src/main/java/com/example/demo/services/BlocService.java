package com.example.demo.services;

import com.example.demo.entities.Bloc;
import com.example.demo.entities.Chambre;
import com.example.demo.repositories.IBlocRepository;
import com.example.demo.repositories.IChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlocService implements IBlocService{
    @Autowired
    IBlocRepository blocRepository;
    @Autowired
    IChambreRepository chambreRepository;
    @Override
    public List<Bloc> retrieveBlocs() {
        return (List<Bloc>) blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(Long idBloc) {
            blocRepository.deleteById(idBloc);
    }

    @Override
    public Bloc addChambresToBloc(List<Long> numChambres, Long idBloc) {
        Bloc blc = blocRepository.findById(idBloc).orElse(null);
        List<Chambre> chambres=chambreRepository.findAllById(numChambres);
        if (blc!=null && !chambres.isEmpty()){
            blc.setChambres(chambres);
            return blocRepository.save(blc);
        }
        return null;
    }
}
