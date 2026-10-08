package tn.esprit.mahjoubihamza4ssa16_2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idPaiement;
     BigDecimal montant;
     LocalDate datePaiement;
    @Enumerated(value = EnumType.STRING)
     ModePaiement modePaiement;
}
