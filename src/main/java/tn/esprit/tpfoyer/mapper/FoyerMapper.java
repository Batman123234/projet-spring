package tn.esprit.tpfoyer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tn.esprit.tpfoyer.dto.FoyerDto;
import tn.esprit.tpfoyer.entities.Foyer;

@Mapper(componentModel = "spring")
public interface FoyerMapper {
    FoyerMapper INSTANCE = Mappers.getMapper(FoyerMapper.class);

    FoyerDto toDto(Foyer foyer);
    Foyer toEntity(FoyerDto foyerDto);
}
