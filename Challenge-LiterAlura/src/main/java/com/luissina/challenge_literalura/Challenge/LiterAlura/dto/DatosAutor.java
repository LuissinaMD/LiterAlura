package com.luissina.challenge_literalura.Challenge.LiterAlura.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutor(
        String name,
        int birth_year,
        int death_year) {
}
