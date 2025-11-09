package tn.esprit.tpfoyer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoyerDto {
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;
}
