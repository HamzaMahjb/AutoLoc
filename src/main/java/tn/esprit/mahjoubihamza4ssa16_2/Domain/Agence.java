package tn.esprit.mahjoubihamza4ssa16_2.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long IdAgence;
     String nom;
     String ville;
     String adresse;
     String telephone;
}
