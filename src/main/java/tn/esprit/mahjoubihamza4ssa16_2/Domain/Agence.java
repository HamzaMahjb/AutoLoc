package tn.esprit.mahjoubihamza4ssa16_2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Set;

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
     @OneToMany(mappedBy = "agence")
     List<Vehicule> vehicules ;
     @OneToMany(mappedBy = "agence")
     Set<Employe> employees ;
}
