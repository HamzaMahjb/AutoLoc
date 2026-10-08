package tn.esprit.mahjoubihamza4ssa16_2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idReservation;
     LocalDate dateDebut;
     LocalDate dateFin;
    @Enumerated(value = EnumType.STRING)
     StatutReservation statut;
}
