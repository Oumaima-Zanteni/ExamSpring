package com.example.oumaimazanteniexblanc.DAO.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.mapping.Set;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Voyageur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idVoyageur;
    String nom;
    String prenom;
    LocalDate dateNaissance;

    @OneToMany( mappedBy="voyageur")
    private List<Reservation> reservation;
}
