package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.dto.ChambreDto;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.mapper.ChambreMapper;
import tn.esprit.tpfoyer.repositories.ChambreRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ChambreService {
    private final ChambreRepository chambreRepository;
    private final ChambreMapper chambreMapper;

    public ChambreDto addOrUpdateChambre(ChambreDto chambreDto) {
        Chambre chambre = chambreMapper.toEntity(chambreDto);
        chambre = chambreRepository.save(chambre);
        return chambreMapper.toDto(chambre);
    }

    public List<ChambreDto> findAllChambres() {
        return chambreRepository.findAll()
                .stream()
                .map(chambreMapper::toDto)
                .collect(Collectors.toList());
    }

    public ChambreDto findById(long idChambre) {
        return chambreRepository.findById(idChambre)
                .map(chambreMapper::toDto)
                .orElse(null);
    }

    public void deleteById(long idChambre) {
        chambreRepository.deleteById(idChambre);
    }
}
