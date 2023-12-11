package com.example.oumaimazanteniexblanc.DAO.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Aeroport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idAeroport ;
    String nom;
    String codeAITA ;
    long telephone ;

    @OneToMany(mappedBy = "aeroport")
    private List<Vol> vols = new ArrayList<>();

    @OneToMany(mappedBy = "aeroport")
    private List<Vol> volss =new ArrayList<>();
}
