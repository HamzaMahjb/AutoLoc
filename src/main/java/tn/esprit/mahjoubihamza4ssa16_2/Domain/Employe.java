package tn.esprit.mahjoubihamza4ssa16_2.Domain;

import jakarta.persistence.*;
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
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long IdEmploye;
     String nom;
     String prenom;
     @Enumerated(value =  EnumType.STRING)
     RoleEmploye role;
}
