/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.demo.Mapper;

import com.api.demo.Dto.PersonaDto;
import com.api.demo.Model.Persona;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 *
 * @author valdiviaricardo
 */
@Mapper(componentModel = "spring")
public interface PersonaMapper {
    @Mapping(target="id", ignore = true)
    Persona personaDtoToPersona(PersonaDto personaDto);
    
    PersonaDto personaToPersonaDto(Persona persona);
    
    @Mapping(target = "id", ignore = true)
    Persona updatePersonaFromDto(PersonaDto personaDto, @MappingTarget Persona persona);
    
    List<PersonaDto> allPersonasToPersonasDto(List<Persona> personas);   
}
