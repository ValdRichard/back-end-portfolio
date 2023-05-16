/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.demo.Mapper;

import com.api.demo.Dto.ExperienciaDto;
import com.api.demo.Model.Experiencia;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 *
 * @author valdiviaricardo
 */
@Mapper(componentModel = "spring")
public interface ExperienciaMapper {
    @Mapping(target = "id", ignore = true)
    Experiencia experienciaDtoToExperiencia(ExperienciaDto experiencia);
    
    ExperienciaDto experienciaToExperienciaDto(Experiencia experiencia);
    
    @Mapping(target = "id", ignore = true)
    Experiencia updateExperienciaFromDto(ExperienciaDto ExperienciaDto, @MappingTarget Experiencia experiencia);
    
    List<ExperienciaDto> allExperienciasToExperienciasDto(List<Experiencia> experiencias);
}
