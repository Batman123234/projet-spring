package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addOrUpdateReservation(Reservation reservation);
    List<Reservation> findAllReservations();
    Reservation findById(String idReservation);
    void deleteById(String idReservation);
}
