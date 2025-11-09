package tn.esprit.tpfoyer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlocDto {
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;
}

