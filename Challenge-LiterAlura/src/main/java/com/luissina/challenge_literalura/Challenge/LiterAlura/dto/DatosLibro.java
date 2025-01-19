package com.luissina.challenge_literalura.Challenge.LiterAlura.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.luissina.challenge_literalura.model.Idioma;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
        Long id,
        String title,
        List<DatosAutor>  authors,
        List<String> subjects,
        List<String> bookshelves,
        List<Idioma> languages,
        String detail,
        Long download_count
) {}
