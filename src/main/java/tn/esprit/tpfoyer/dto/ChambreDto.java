package tn.esprit.tpfoyer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.esprit.tpfoyer.entities.TypeChambre;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChambreDto {
    private Long idChambre;
    private Long numeroChambre;
    private TypeChambre typeChambre;
}
