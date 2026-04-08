package com.example.vetiranaria.service;

import com.example.vetiranaria.dto.MascotaRequestDTO;
import com.example.vetiranaria.dto.MascotaDTO;
import java.util.List;
import java.util.Optional;

public interface MascotaService {
    MascotaDTO crearMascota(MascotaRequestDTO dto);
    List<MascotaDTO> listarTodas();
    Optional<MascotaDTO> buscarPorId(Long id);
    List<MascotaDTO> buscarPorEspecie(String especie);
    List<MascotaDTO> buscarPorDueno(String dueno);
    MascotaDTO actualizarMascota(Long id, MascotaRequestDTO dto);
    void eliminarMascota(Long id);
}