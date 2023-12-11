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
public class Reservation implements Serializable {
    @Id
    String idReservation;
    LocalDate dateReservation;
    @Enumerated(EnumType.STRING)
    ClassPlace classPlace ;
    @Enumerated(EnumType.STRING)
    EtatReservation etatReservation ;


    @ManyToOne
    Voyageur voyageur;

}
