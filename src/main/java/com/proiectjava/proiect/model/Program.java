package com.proiectjava.proiect.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_program;
    private Date data;
    private Time ora;
    private int id_cinema;
    private int id_film;

    public Program() {
    }

    public Program(int id_program, Date data, Time ora, int id_cinema, int id_film) {
        this.id_program = id_program;
        this.data = data;
        this.ora = ora;
        this.id_cinema = id_cinema;
        this.id_film = id_film;
    }

    public int getId_program() {
        return id_program;
    }

    public void setId_program(int id_program) {
        this.id_program = id_program;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getOra() {
        return ora;
    }

    public void setOra(Time ora) {
        this.ora = ora;
    }

    public int getId_cinema() {
        return id_cinema;
    }

    public void setId_cinema(int id_cinema) {
        this.id_cinema = id_cinema;
    }

    public int getId_film() {
        return id_film;
    }

    public void setId_film(int id_film) {
        this.id_film = id_film;
    }
}
