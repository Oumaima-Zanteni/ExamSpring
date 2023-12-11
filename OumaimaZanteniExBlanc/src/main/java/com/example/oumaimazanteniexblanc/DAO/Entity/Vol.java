package com.example.oumaimazanteniexblanc.DAO.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVol ;
    LocalDate dateDepart ;
    LocalDate dateArrive ;


    @ManyToOne
    Aeroport aeroport ;

}
