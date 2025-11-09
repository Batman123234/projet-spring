package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.dto.FoyerDto;
import tn.esprit.tpfoyer.services.FoyerService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/foyerController")
public class FoyerController {
    private final FoyerService foyerService;

    @PostMapping("/addFoyer")
    public FoyerDto addFoyer(@RequestBody FoyerDto foyerDto) {
        return foyerService.addOrUpdateFoyer(foyerDto);
    }

    @PutMapping("/updateFoyer")
    public FoyerDto updateFoyer(@RequestBody FoyerDto foyerDto) {
        return foyerService.addOrUpdateFoyer(foyerDto);
    }

    @DeleteMapping("/deleteFoyer")
    public void deleteFoyer(@RequestParam long idFoyer) {
        foyerService.deleteById(idFoyer);
    }

    public List<FoyerDto> findAllFoyer() {
        return foyerService.findAllFoyers();
    }

    @GetMapping("/findFoyerById")
    public FoyerDto findFoyerById(@RequestParam Long idFoyer) {
        return foyerService.findById(idFoyer);
    }
}
