package org.iesvdm.tutorial;

import org.iesvdm.tutorial.domain.Pelicula;
import org.iesvdm.tutorial.repository.CategoriaRepository;
import org.iesvdm.tutorial.repository.PeliculaCategoriaRepository;
import org.iesvdm.tutorial.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class PeliculaCategoriaTests {
    @Autowired
    PeliculaRepository peliculaRepository;

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    PeliculaCategoriaRepository peliculaCategoriaRepository;
}
