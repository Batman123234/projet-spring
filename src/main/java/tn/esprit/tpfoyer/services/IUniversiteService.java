package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addOrUpdateUniversite(Universite universite);
    List<Universite> findAllUniversites();
    Universite findById(long idUniversite);
    void deleteById(long idUniversite);
}
