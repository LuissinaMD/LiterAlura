package com.luissina.challenge_literalura.repository;

import com.luissina.challenge_literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor,Long> {

    Optional<Autor> findByNameIgnoreCase(String name);

    List<Autor> findAll();

    @Query("SELECT a FROM Autor a WHERE :anio >= a.birthYear AND :anio <= a.deathYear")
    List<Autor> autoresVivosPorAnio(Integer anio);

    List<Autor> findByNameContainingIgnoreCase(String nombre);
}
