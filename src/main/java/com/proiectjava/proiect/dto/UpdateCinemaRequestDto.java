package com.proiectjava.proiect.dto;

import javax.validation.constraints.NotNull;

public class UpdateCinemaRequestDto extends CreateCinemaRequestDto {

    @NotNull
    private long id_cinema;

    public UpdateCinemaRequestDto(String name, String oras, long id_cinema) {
        super(name, oras);
        this.id_cinema = id_cinema;
    }

    public long getId_cinema() {
        return id_cinema;
    }

    public void setId_cinema(long id_cinema) {
        this.id_cinema = id_cinema;
    }
}
