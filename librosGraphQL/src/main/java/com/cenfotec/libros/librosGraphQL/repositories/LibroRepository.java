package com.cenfotec.libros.librosGraphQL.repositories;

import com.cenfotec.libros.librosGraphQL.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {
}
