package com.proiectjava.proiect.exception;

public class CinemaNotFoundException extends RuntimeException{
    public CinemaNotFoundException() {
        super("cinema-ul nu exista.");
    }
}
