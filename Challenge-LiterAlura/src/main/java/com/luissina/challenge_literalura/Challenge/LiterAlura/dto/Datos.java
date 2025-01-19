package com.luissina.challenge_literalura.Challenge.LiterAlura.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Datos(
        int count,
        List<DatosLibro> results
) {}

