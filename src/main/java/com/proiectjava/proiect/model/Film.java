package com.proiectjava.proiect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_film;
    private String nume;
    private long id_cinema;

    public Film() {
    }

    public Film(long id_film, String nume, long id_cinema) {
        this.id_film = id_film;
        this.nume = nume;
        this.id_cinema = id_cinema;
    }

    public long getId_film() {
        return id_film;
    }

    public void setId_film(long id_film) {
        this.id_film = id_film;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public long getId_cinema() {
        return id_cinema;
    }

    public void setId_cinema(long id_cinema) {
        this.id_cinema = id_cinema;
    }
}
