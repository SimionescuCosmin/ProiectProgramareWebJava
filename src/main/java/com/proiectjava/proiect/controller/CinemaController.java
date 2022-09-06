package com.proiectjava.proiect.controller;

import com.proiectjava.proiect.dto.CreateCinemaRequestDto;
import com.proiectjava.proiect.dto.UpdateCinemaRequestDto;
import com.proiectjava.proiect.exception.InvalidUpdateRequestException;
import com.proiectjava.proiect.mapper.CinemaMapper;
import com.proiectjava.proiect.model.Cinema;
import com.proiectjava.proiect.service.CinemaService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cinemas")
@Validated
public class CinemaController {

    private CinemaService cinemaService;

    private CinemaMapper cinemaMapper;

    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @PostMapping
    public ResponseEntity<Cinema> create(
            @Valid
            @RequestBody CreateCinemaRequestDto request)
    {

        Cinema cinema = cinemaService.create(cinemaMapper.createCinemaRequestDtoToCinema(request));
        return ResponseEntity.created(URI.create("/cinema/"+cinema.getId_cinema())).body(cinema);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cinema> update(
            @PathVariable long cinema_id,
            @Valid
            @RequestBody UpdateCinemaRequestDto request) {
        if( cinema_id != request.getId_cinema()) {
            throw new InvalidUpdateRequestException();
        }
        return ResponseEntity.ok(   cinemaService.update(cinemaMapper.updateCinemaRequestDtoToCinema(request)));

    }

    @GetMapping
    public List<Cinema> get(@RequestParam String name, @RequestParam String city) {
        return cinemaService.get(name,city);

    }

}
