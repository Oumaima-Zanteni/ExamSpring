package com.example.oumaimazanteniexblanc.RestController;

import com.example.oumaimazanteniexblanc.DAO.Entity.Voyageur;
import com.example.oumaimazanteniexblanc.DAO.Repository.AeroportRepository;
import com.example.oumaimazanteniexblanc.DAO.Repository.ReservationRepository;
import com.example.oumaimazanteniexblanc.DAO.Repository.VolRepository;
import com.example.oumaimazanteniexblanc.DAO.Repository.VoyageurRepository;
import com.example.oumaimazanteniexblanc.Service.IExamenService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ExamenRestController {
   IExamenService iExamenService ;

    @PostMapping("ajouterVoyageur")
    public List<Voyageur> ajouterVoyageur(@RequestBody List<Voyageur> voyageurs){
       return iExamenService.ajouterVoyageur(voyageurs);

    }
}
