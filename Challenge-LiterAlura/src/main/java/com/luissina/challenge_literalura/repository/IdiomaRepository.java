package com.luissina.challenge_literalura.repository;
import com.luissina.challenge_literalura.model.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IdiomaRepository extends JpaRepository<Idioma,Long> {

    Optional<Idioma> findByNombreIgnoreCase(String idioma);

    List<Idioma> findAll();
}
