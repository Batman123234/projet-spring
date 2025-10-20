package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Chambre;
import tn.esprit.tpfoyer.services.IChambreService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/chambre")
public class ChambreController {
    final IChambreService chambreService;

    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addOrUpdateChambre(chambre);
    }

    @PutMapping("/update")
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.addOrUpdateChambre(chambre);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteChambre(@PathVariable long id) {
        chambreService.deleteById(id);
    }

    @GetMapping("/all")
    public List<Chambre> getAllChambres() {
        return chambreService.findAllChambres();
    }

    @GetMapping("/{id}")
    public Chambre getChambreById(@PathVariable long id) {
        return chambreService.findById(id);
    }
}
