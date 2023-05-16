/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.demo.Service;

import com.api.demo.Dto.ExperienciaDto;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author valdiviaricardo
 */
public interface IExperienciaService {
    public ExperienciaDto createExperiencia(ExperienciaDto experienciaDto);
    
    public ResponseEntity<Void> deleteExperiencia(Long experienciaId);
    
    public ExperienciaDto updateExperiencia(Long educacionId, ExperienciaDto experienciaDto);
    
    public ExperienciaDto getExperiencia(Long id);
            
    public List<ExperienciaDto> getAllExperiencias();
}
