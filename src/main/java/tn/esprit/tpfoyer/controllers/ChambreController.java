package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.dto.ChambreDto;
import tn.esprit.tpfoyer.services.ChambreService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/chambreController")
public class ChambreController {
    private final ChambreService chambreService;

    @PostMapping("/addChambre")
    public ChambreDto addChambre(@RequestBody ChambreDto chambreDto) {
        return chambreService.addOrUpdateChambre(chambreDto);
    }

    @PutMapping("/updateChambre")
    public ChambreDto updateChambre(@RequestBody ChambreDto chambreDto) {
        return chambreService.addOrUpdateChambre(chambreDto);
    }

    @DeleteMapping("/deleteChambre")
    public void deleteChambre(@RequestParam long idChambre) {
        chambreService.deleteById(idChambre);
    }

    @GetMapping("/findAllChambre")
    public List<ChambreDto> findAllChambres() {
        return chambreService.findAllChambres();
    }

    @GetMapping("/findChambreById")
    public ChambreDto findChambreById(@RequestParam Long idChambre) {
        return chambreService.findById(idChambre);
    }
}
