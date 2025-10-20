package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Etudiant;
import tn.esprit.tpfoyer.services.EtudiantService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/etudiantController")
public class EtudiantController {
    final EtudiantService etudiantService;

    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addOrUpdateEtudiant(etudiant);
    }

    @PutMapping("/updateEtudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addOrUpdateEtudiant(etudiant);
    }

    @DeleteMapping("/deleteEtudiant")
    void deleteEtudiant(@RequestParam long idEtudiant) {
        etudiantService.deleteById(idEtudiant);
    }

    @GetMapping("/findAllEtudiant")
    List<Etudiant> findAllEtudiant() {
        return etudiantService.findAllEtudiants();
    }

    @GetMapping("/findEtudiantById")
    Etudiant findEtudiantById(@RequestParam long idEtudiant) {
        return etudiantService.findById(idEtudiant);
    }
}

