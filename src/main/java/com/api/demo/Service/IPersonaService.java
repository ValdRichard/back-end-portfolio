/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.demo.Service;
import com.api.demo.Dto.PersonaDto;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author valdiviaricardo
 */

public interface IPersonaService {
    
    public PersonaDto createPersona(PersonaDto personaDto);
    
    public PersonaDto updatePersona(Long id, PersonaDto personaDto);
    
    public ResponseEntity<Void> deletePersona(Long personaId) ;
    
    public PersonaDto getPersona(Long id);
    
    public List<PersonaDto> getAllPersonas();
}