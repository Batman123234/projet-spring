package tn.esprit.tpfoyer.controllers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Universite;
import tn.esprit.tpfoyer.services.UniversiteService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/universiteController")
public class UniversiteController {
    final UniversiteService universiteService;

    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addOrUpdateUniversite(universite);
    }

    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.addOrUpdateUniversite(universite);
    }

    @DeleteMapping("/deleteUniversite")
    void deleteUniversite(@RequestParam long idUniversite) {
        universiteService.deleteById(idUniversite);
    }

    @GetMapping("/findAllUniversite")
    List<Universite> findAllUniversite() {
        return universiteService.findAllUniversites();
    }

    @GetMapping("/findUniversiteById")
    Universite findUniversiteById(@RequestParam long idUniversite) {
        return universiteService.findById(idUniversite);
    }
}

