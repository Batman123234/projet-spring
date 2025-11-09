package tn.esprit.tpfoyer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import tn.esprit.tpfoyer.dto.BlocDto;
import tn.esprit.tpfoyer.entities.Bloc;

@Mapper(componentModel = "spring")
public interface BlocMapper {
    BlocMapper INSTANCE = Mappers.getMapper(BlocMapper.class);

    BlocDto toDto(Bloc bloc);

    Bloc toEntity(BlocDto blocDto);
}
