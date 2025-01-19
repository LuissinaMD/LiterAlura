package com.luissina.challenge_literalura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "idiomas")
public class Idioma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nombre;

    public Idioma(){}

    public Idioma(String nombre){
        this.nombre = nombre;
    }

    public Idioma(Idioma idioma) {
        this.nombre = idioma.getNombre();
    }

    public Idioma(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return nombre;
    }
}
