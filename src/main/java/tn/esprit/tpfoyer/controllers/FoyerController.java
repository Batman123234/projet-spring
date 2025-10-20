package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Foyer;
import tn.esprit.tpfoyer.services.FoyerService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/foyerController")
public class FoyerController {
    final FoyerService foyerService;

    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.addOrUpdateFoyer(foyer);
    }

    @PutMapping("/updateFoyer")
    Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.addOrUpdateFoyer(foyer);
    }

    @DeleteMapping("/deleteFoyer")
    void deleteFoyer(@RequestParam long idFoyer) {
        foyerService.deleteById(idFoyer);
    }

    @GetMapping("/findAllFoyer")
    List<Foyer> findAllFoyer() {
        return foyerService.findAllFoyers();
    }

    @GetMapping("/findFoyerById")
    Foyer findFoyerById(@RequestParam long idFoyer) {
        return foyerService.findById(idFoyer);
    }
}

