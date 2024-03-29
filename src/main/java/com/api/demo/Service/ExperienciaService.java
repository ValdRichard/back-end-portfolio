/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.demo.Service;

import com.api.demo.Dto.ExperienciaDto;
import com.api.demo.Mapper.ExperienciaMapper;
import com.api.demo.Model.Experiencia;
import com.api.demo.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author valdiviaricardo
 */
@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    private ExperienciaRepository experienciaRepository;
    
    @Autowired
    private ExperienciaMapper mapper;
    
    @Override
    public ExperienciaDto createExperiencia(ExperienciaDto experienciaDto) {
        Experiencia experiencia = experienciaRepository.save(mapper.experienciaDtoToExperiencia(experienciaDto));
        return mapper.experienciaToExperienciaDto(experiencia);
    }

    @Override
    public ResponseEntity<Void> deleteExperiencia(Long experienciaId) {
        experienciaRepository.deleteById(experienciaId);
        return ResponseEntity.ok().build();
    }

    @Override
    public ExperienciaDto updateExperiencia(Long experienciaId, ExperienciaDto experienciaDto) {
        Experiencia experiencia = experienciaRepository.getReferenceById(experienciaId);
        experienciaRepository.save(mapper.updateExperienciaFromDto(experienciaDto, experiencia));
        return mapper.experienciaToExperienciaDto(experiencia);
    }

    @Override
    public ExperienciaDto getExperiencia(Long id) {
        return mapper.experienciaToExperienciaDto(experienciaRepository.getReferenceById(id));
    }

    @Override
    public List<ExperienciaDto> getAllExperiencias() {
        return mapper.allExperienciasToExperienciasDto(experienciaRepository.findAll());
    }
}