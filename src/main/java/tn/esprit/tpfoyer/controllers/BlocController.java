package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.dto.BlocDto;
import tn.esprit.tpfoyer.services.BlocService;
import tn.esprit.tpfoyer.repositories.BlocRepository;

import tn.esprit.tpfoyer.mapper.BlocMapper;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/blocController")
public class BlocController {
    private final BlocService blocService;

    @PostMapping("/addBloc")
    public BlocDto addBloc(@RequestBody BlocDto blocDto) {
        return blocService.addOrUpdateBloc(blocDto);
    }

    @PutMapping("/updateBloc")
    public BlocDto updateBloc(@RequestBody BlocDto blocDto) {
        return blocService.addOrUpdateBloc(blocDto);
    }

    @DeleteMapping("/deleteBloc")
    void deleteBloc(@RequestParam long idBloc) {
        blocService.deleteById(idBloc);
    }

    @GetMapping("/findAllBloc")
    public List<BlocDto> findAllBlocs() {
        return blocService.findAllBlocs();
    }

    @GetMapping("/findBlocById")
    public BlocDto findBlocById(@RequestParam Long idBloc) {
        return blocService.findById(idBloc);
    }
}


