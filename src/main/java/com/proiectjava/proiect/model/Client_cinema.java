package com.proiectjava.proiect.model;

public class Client_cinema {
    private int id_cinema;
    private int id_client;

    public Client_cinema() {
    }

    public Client_cinema(int id_cinema, int id_client) {
        this.id_cinema = id_cinema;
        this.id_client = id_client;
    }

    public int getId_cinema() {
        return id_cinema;
    }

    public void setId_cinema(int id_cinema) {
        this.id_cinema = id_cinema;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }
}
