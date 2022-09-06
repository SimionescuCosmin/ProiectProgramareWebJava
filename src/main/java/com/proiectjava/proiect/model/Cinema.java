package com.proiectjava.proiect.model;

import javax.persistence.*;

@Entity
@Table(name = "cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_cinema;

    private String name;

    private String city;

    public Cinema() {
    }

    public Cinema(long id_cinema, String name, String city) {
        this.id_cinema = id_cinema;
        this.name = name;
        this.city = city;
    }
    public Cinema( String name, String city) {
        this.name = name;
        this.city = city;
    }

    public long getId_cinema() {
        return id_cinema;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setId_cinema(long id_cinema) {
        this.id_cinema = id_cinema;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
