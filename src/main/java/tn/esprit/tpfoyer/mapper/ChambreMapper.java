package tn.esprit.tpfoyer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tn.esprit.tpfoyer.dto.ChambreDto;
import tn.esprit.tpfoyer.entities.Chambre;

@Mapper(componentModel = "spring")
public interface ChambreMapper {
    ChambreMapper INSTANCE = Mappers.getMapper(ChambreMapper.class);

    ChambreDto toDto(Chambre chambre);
    Chambre toEntity(ChambreDto chambreDto);
}
