package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addOrUpdateBloc(Bloc bloc);
    //Bloc updateBloc(Bloc bloc);
    List<Bloc> findAllBlocs();
    Bloc findById(long idBloc);
    void deleteById(long idBloc);


}
