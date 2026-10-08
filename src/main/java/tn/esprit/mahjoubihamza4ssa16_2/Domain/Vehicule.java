package tn.esprit.mahjoubihamza4ssa16_2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicule {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
     long IdVehicule;
     String immatriculation;
     String marque;
     String modele;
     @Enumerated(value =  EnumType.STRING)
     CategorieVehicule categorie;
     BigDecimal TarifJournalier;
    @Enumerated(value =   EnumType.STRING)
     StatutVehicule statut;

}
