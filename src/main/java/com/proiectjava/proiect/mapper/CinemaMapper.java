package com.proiectjava.proiect.mapper;

import com.proiectjava.proiect.dto.CreateCinemaRequestDto;
import com.proiectjava.proiect.dto.UpdateCinemaRequestDto;
import com.proiectjava.proiect.model.Cinema;
import org.springframework.stereotype.Component;

@Component
public class CinemaMapper {
    public Cinema createCinemaRequestDtoToCinema(CreateCinemaRequestDto request){
        return new Cinema(request.getName(), request.getOras());
    }

    public Cinema updateCinemaRequestDtoToCinema(UpdateCinemaRequestDto request){
        return new Cinema(request.getId_cinema(), request.getName(), request.getOras());
    }
}
