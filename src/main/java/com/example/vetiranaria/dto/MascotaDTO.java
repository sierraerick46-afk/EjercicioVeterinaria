package com.example.vetiranaria.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class MascotaDTO {
    private Long id;
    private String nombre;
    private String especie;
    private String raza;
    private Integer edad;
    private String dueno;
    private String telefono;
}