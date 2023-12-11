package com.example.oumaimazanteniexblanc.DAO.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Fournissuer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idFournissuer ;
    String nomFournissuer ;
}
