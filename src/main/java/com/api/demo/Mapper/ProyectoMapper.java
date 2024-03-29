/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.demo.Mapper;

import com.api.demo.Dto.ProyectoDto;
import com.api.demo.Model.Proyecto;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 *
 * @author valdiviaricardo
 */
@Mapper(componentModel = "spring")
public interface ProyectoMapper {
    @Mapping(target = "id", ignore = true)
    Proyecto proyectoDtoToProyecto(ProyectoDto proyecto);
    
    ProyectoDto proyectoToProyectoDto(Proyecto proyecto);
    
    @Mapping(target = "id", ignore = true)
    Proyecto updateProyectoFromDto(ProyectoDto ProyectoDto, @MappingTarget Proyecto proyecto);
    
    List<ProyectoDto> allProyectosToProyectosDto(List<Proyecto> proyectos);
}
