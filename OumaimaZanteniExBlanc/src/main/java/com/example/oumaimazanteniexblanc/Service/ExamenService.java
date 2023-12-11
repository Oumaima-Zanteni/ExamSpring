package com.example.oumaimazanteniexblanc.Service;

import com.example.oumaimazanteniexblanc.DAO.Entity.Reservation;
import com.example.oumaimazanteniexblanc.DAO.Entity.Vol;
import com.example.oumaimazanteniexblanc.DAO.Entity.Voyageur;
import com.example.oumaimazanteniexblanc.DAO.Repository.AeroportRepository;
import com.example.oumaimazanteniexblanc.DAO.Repository.ReservationRepository;
import com.example.oumaimazanteniexblanc.DAO.Repository.VolRepository;
import com.example.oumaimazanteniexblanc.DAO.Repository.VoyageurRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
@Slf4j
public class ExamenService implements IExamenService {
    AeroportRepository aeroportRepository ;
    ReservationRepository reservationRepository ;
    VolRepository volRepository ;
    VoyageurRepository voyageurRepository;
@Override
public List<Voyageur> ajouterVoyageur(List<Voyageur> voyageurs){
  return voyageurRepository.saveAll(voyageurs);
}




 /*   @Override
    public void annulerReservation() {
         reservationRepository.findByEtatReservation();

        if (Reservation  reservations ) {

        }
        log.info("Reservation annulée");
    }*/
/*@Override
    Map<Integer , List<Voyageur>> getVoyageurByVol(){
    return voyageurs;
}*/
}
