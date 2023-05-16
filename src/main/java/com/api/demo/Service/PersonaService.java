/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.demo.Service;

import com.api.demo.Dto.PersonaDto;
import com.api.demo.Mapper.PersonaMapper;
import com.api.demo.Model.Persona;
import com.api.demo.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author valdiviaricardo
 */

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    
    @Autowired
    private PersonaMapper mapper;
    
    @Override
    public PersonaDto createPersona(PersonaDto personaDto) {
        Persona persona = personaRepository.save(mapper.personaDtoToPersona(personaDto));
        return mapper.personaToPersonaDto(persona);
    }

    @Override
    public ResponseEntity<Void> deletePersona(Long personaId) {
        personaRepository.deleteById(personaId);
        return ResponseEntity.ok().build();
    }

    @Override
    public PersonaDto updatePersona(Long personaId, PersonaDto personaDto) {
        Persona persona = personaRepository.getReferenceById(personaId);
        personaRepository.save(mapper.updatePersonaFromDto(personaDto, persona));
        return mapper.personaToPersonaDto(persona);
    }

    @Override
    public PersonaDto getPersona(Long id) {
        return mapper.personaToPersonaDto(personaRepository.getReferenceById(id));
    }

    @Override
    public List<PersonaDto> getAllPersonas() {
        return mapper.allPersonasToPersonasDto(personaRepository.findAll());
    }
}