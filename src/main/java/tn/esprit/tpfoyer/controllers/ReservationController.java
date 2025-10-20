package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entities.Reservation;
import tn.esprit.tpfoyer.services.ReservationService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/reservationController")
public class ReservationController {
    final ReservationService reservationService;

    @PostMapping("/addReservation")
    Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addOrUpdateReservation(reservation);
    }

    @PutMapping("/updateReservation")
    Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.addOrUpdateReservation(reservation);
    }

    @DeleteMapping("/deleteReservation")
    void deleteReservation(@RequestParam String idReservation) {
        reservationService.deleteById(idReservation);
    }

    @GetMapping("/findAllReservation")
    List<Reservation> findAllReservation() {
        return reservationService.findAllReservations();
    }

    @GetMapping("/findReservationById")
    Reservation findReservationById(@RequestParam String idReservation) {
        return reservationService.findById(idReservation);
    }
}

