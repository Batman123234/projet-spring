package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Bloc;
import tn.esprit.tpfoyer.services.BlocService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/blocController")
public class BlocController {
    final BlocService blocService;

    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addOrUpdateBloc(bloc);
    }

    @PutMapping("/updateBloc")
    Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.addOrUpdateBloc(bloc);
    }

    @DeleteMapping("/deleteBloc")
    void deleteBloc(@RequestParam long idBloc) {
        blocService.deleteById(idBloc);
    }

    @GetMapping("/findAllBloc")
    List<Bloc> findAllBloc() {
        return blocService.findAllBlocs();
    }

    @GetMapping("/findBlocById")
    Bloc findBlocById(@RequestParam long idBloc) {
        return blocService.findById(idBloc);
    }
}

