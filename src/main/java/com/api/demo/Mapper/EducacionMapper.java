/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.demo.Mapper;

import com.api.demo.Dto.EducacionDto;
import com.api.demo.Model.Educacion;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 *
 * @author valdiviaricardo
 */
@Mapper(componentModel = "spring")
public interface EducacionMapper {
    @Mapping(target = "id", ignore = true)
    Educacion educacionDtoToEducacion(EducacionDto educacion);

    EducacionDto educacionToEducacionDto(Educacion educacion);

    @Mapping(target = "id", ignore = true)
    Educacion updateEducacionFromDto(EducacionDto educacionDto, @MappingTarget Educacion educacion);

    List<EducacionDto> allEducacionesToEducacionesDto(List<Educacion> educaciones);
}
