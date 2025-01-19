package com.luissina.challenge_literalura.repository;

import com.luissina.challenge_literalura.model.Idioma;
import com.luissina.challenge_literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro,Long> {

    Optional<Libro> findByTituloIgnoreCase(String titulo);

    List<Libro> findAll();

    @Query("SELECT l FROM Libro l WHERE l.idioma = :idioma")
    List<Libro> libroPorIdioma(Idioma idioma);

    List<Libro> findTop10ByOrderByDownloadCountDesc();

}
