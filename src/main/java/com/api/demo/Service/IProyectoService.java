/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.demo.Service;

import com.api.demo.Dto.ProyectoDto;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author valdiviaricardo
 */
public interface IProyectoService {
    public ProyectoDto createProyecto(ProyectoDto proyectoDto);
    
    public ResponseEntity<Void> deleteProyecto(Long proyectoId);
    
    public ProyectoDto updateProyecto(Long proyectoId, ProyectoDto proyectoDto);
    
    public ProyectoDto getProyecto(Long id);
            
    public List<ProyectoDto> getAllProyectos();
}
