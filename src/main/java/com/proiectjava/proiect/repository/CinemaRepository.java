package com.proiectjava.proiect.repository;

import com.proiectjava.proiect.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long>
{
    List<Cinema> findByName(String name);
    List<Cinema> findByCity(String city);
    List<Cinema> findByNameAndCity(String name,String city);

}
