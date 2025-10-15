package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addOrUpdateChambre(Chambre chambre);
    List<Chambre> findAllChambres();
    Chambre findById(long idChambre);
    void deleteById(long idChambre);
}
