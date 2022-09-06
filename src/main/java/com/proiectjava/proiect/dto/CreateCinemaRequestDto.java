package com.proiectjava.proiect.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateCinemaRequestDto {
    @NotBlank
    @Size(max = 100)
    private String name;
    @NotBlank
    @Size(max = 100)
    private String oras;

    public CreateCinemaRequestDto(String name, String oras) {
        this.name = name;
        this.oras = oras;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }
}
