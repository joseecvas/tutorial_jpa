package org.iesvdm.tutorial.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    private String numero;

    private LocalDate fechaCaducidad;

    @OneToOne
    @JoinColumn(name = "socio___id", referencedColumnName = "id")
    private Socio socio;
}
