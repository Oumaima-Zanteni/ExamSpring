package com.example.oumaimazanteniexblanc.Service;

import com.example.oumaimazanteniexblanc.DAO.Entity.Vol;
import com.example.oumaimazanteniexblanc.DAO.Entity.Voyageur;

import java.util.List;
import java.util.Map;

public interface IExamenService {


  //  String ajouterVolEtAeroport(Vol vol );
    List<Voyageur> ajouterVoyageur(List<Voyageur> voyageurs);
  //  Map<Integer , List<Voyageur>>getVoyageurByVol();


}
