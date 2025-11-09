package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.dto.FoyerDto;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.mapper.FoyerMapper;
import tn.esprit.tpfoyer.repositories.FoyerRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FoyerService {
    private final FoyerRepository foyerRepository;
    private final FoyerMapper foyerMapper;

    public FoyerDto addOrUpdateFoyer(FoyerDto foyerDto) {
        Foyer foyer = foyerMapper.toEntity(foyerDto);
        foyer = foyerRepository.save(foyer);
        return foyerMapper.toDto(foyer);
    }

    public List<FoyerDto> findAllFoyers() {
        return foyerRepository.findAll()
                .stream()
                .map(foyerMapper::toDto)
                .collect(Collectors.toList());
    }

    public FoyerDto findById(long idFoyer) {
        return foyerRepository.findById(idFoyer)
                .map(foyerMapper::toDto)
                .orElse(null);
    }

    public void deleteById(long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
}
