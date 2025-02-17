package org.iesvdm.tutorial.domain;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;
import org.iesvdm.tutorial.serializer.PeliculaSerializer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Builder
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id", scope = Pelicula.class)
@JsonSerialize(using = PeliculaSerializer.class)
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    private String titulo;

    private Integer anyoLanzamiento;

    @ManyToOne
    @ToString.Exclude
    private Idioma idiomaOriginal;

    @ManyToOne
    //@JsonBackReference
    @ToString.Exclude
    private Idioma idioma;
    //@ManyToMany
    //private Set<Categoria> categorias;


    private Integer duracionAlquiler;

    @Column(precision = 4, scale = 2)
    private BigDecimal rentalRate;

    @Column(precision = 5, scale = 2)
    private BigDecimal replacementCost;

    private Short duracion;

    private ClasificacionEnum clasificacionEnum;

    private String caracteristicas;

    @ManyToMany(mappedBy = "peliculas")
    private Set<CaracteristicaEspecial> caracteristicaEspeciales;

    private LocalDateTime ultimaActualizacion;


    @OneToMany(mappedBy = "pelicula")
    private Set<PeliculaCategoria> peliculaCategorias;

    @ManyToMany(mappedBy = "peliculas")
    private Set<Actor> actores;


}
