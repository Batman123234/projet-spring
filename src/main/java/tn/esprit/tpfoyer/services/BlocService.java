package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.dto.BlocDto;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.mapper.BlocMapper;
import tn.esprit.tpfoyer.repositories.BlocRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BlocService {
    private final BlocRepository blocRepository;
    private final BlocMapper blocMapper;

    public BlocDto addOrUpdateBloc(BlocDto blocDto) {
        Bloc bloc = blocMapper.toEntity(blocDto);
        bloc = blocRepository.save(bloc);
        return blocMapper.toDto(bloc);
    }


    public List<BlocDto> findAllBlocs() {
        return blocRepository.findAll()
                .stream()
                .map(blocMapper::toDto)
                .collect(Collectors.toList());
    }

    public BlocDto findById(long idBloc) {
        return blocRepository.findById(idBloc)
                .map(blocMapper::toDto)
                .orElse(null);

    }


    public void deleteById(long idBloc) {
        blocRepository.deleteById(idBloc);

    }
}
