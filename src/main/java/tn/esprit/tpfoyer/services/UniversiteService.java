package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {
    final UniversiteRepository universiteRepository;

    @Override
    public Universite addOrUpdateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> findAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite findById(long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public void deleteById(long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
}
