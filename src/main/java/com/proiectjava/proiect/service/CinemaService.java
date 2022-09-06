package com.proiectjava.proiect.service;

import antlr.StringUtils;
import com.proiectjava.proiect.exception.CinemaNotFoundException;
import com.proiectjava.proiect.model.Cinema;
import com.proiectjava.proiect.repository.CinemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService {

    private CinemaRepository cinemaRepository;

    public CinemaService(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    public Cinema create(Cinema cinema) {
       return  cinemaRepository.save(cinema);

    }

    public Cinema update(Cinema cinema) {
        cinemaRepository.findById(cinema.getId_cinema()).orElseThrow(()->new CinemaNotFoundException());
        return cinemaRepository.save(cinema);
    }

    public List<Cinema> get(String name, String city) {
        if(name!=null){
            if(city!=null){
                return cinemaRepository.findByNameAndCity(name,city);
            }
            return  cinemaRepository.findByName(name);
        }
        if(city!=null){
            return cinemaRepository.findByCity(city);


        }
        return cinemaRepository.findAll();

    }
}
