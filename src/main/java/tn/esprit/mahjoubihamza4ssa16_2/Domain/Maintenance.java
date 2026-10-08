package tn.esprit.mahjoubihamza4ssa16_2.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String description;
}
