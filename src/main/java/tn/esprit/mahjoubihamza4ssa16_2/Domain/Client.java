package tn.esprit.mahjoubihamza4ssa16_2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idClient;
     String nom;
     String prenom;
     String email;
     String telephne;
     String numPermis;
     LocalDate dateinscription;
     @OneToMany (mappedBy = "client")
     Set<Reservation> reservations;
}
