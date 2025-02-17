package org.iesvdm.tutorial.repository;

import org.iesvdm.tutorial.domain.PeliculaCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaCategoriaRepository extends JpaRepository<PeliculaCategoria, Long> {

}
