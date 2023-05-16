package com.api.demo.Mapper;

import com.api.demo.Dto.PersonaDto;
import com.api.demo.Model.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-16T10:53:09-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class PersonaMapperImpl implements PersonaMapper {

    @Override
    public Persona personaDtoToPersona(PersonaDto personaDto) {
        if ( personaDto == null ) {
            return null;
        }

        Persona persona = new Persona();

        persona.setImageBanner( personaDto.getImageBanner() );
        persona.setImageFotoPerfil( personaDto.getImageFotoPerfil() );
        persona.setImageGithub( personaDto.getImageGithub() );
        persona.setImageLinkedin( personaDto.getImageLinkedin() );
        persona.setUrlGithub( personaDto.getUrlGithub() );
        persona.setUrlLinkedin( personaDto.getUrlLinkedin() );
        persona.setMail( personaDto.getMail() );
        persona.setNombreyApellido( personaDto.getNombreyApellido() );
        persona.setDescripcion( personaDto.getDescripcion() );

        return persona;
    }

    @Override
    public PersonaDto personaToPersonaDto(Persona persona) {
        if ( persona == null ) {
            return null;
        }

        PersonaDto personaDto = new PersonaDto();

        personaDto.setId( persona.getId() );
        personaDto.setImageBanner( persona.getImageBanner() );
        personaDto.setImageFotoPerfil( persona.getImageFotoPerfil() );
        personaDto.setImageGithub( persona.getImageGithub() );
        personaDto.setImageLinkedin( persona.getImageLinkedin() );
        personaDto.setUrlGithub( persona.getUrlGithub() );
        personaDto.setUrlLinkedin( persona.getUrlLinkedin() );
        personaDto.setMail( persona.getMail() );
        personaDto.setNombreyApellido( persona.getNombreyApellido() );
        personaDto.setDescripcion( persona.getDescripcion() );

        return personaDto;
    }

    @Override
    public Persona updatePersonaFromDto(PersonaDto personaDto, Persona persona) {
        if ( personaDto == null ) {
            return persona;
        }

        persona.setImageBanner( personaDto.getImageBanner() );
        persona.setImageFotoPerfil( personaDto.getImageFotoPerfil() );
        persona.setImageGithub( personaDto.getImageGithub() );
        persona.setImageLinkedin( personaDto.getImageLinkedin() );
        persona.setUrlGithub( personaDto.getUrlGithub() );
        persona.setUrlLinkedin( personaDto.getUrlLinkedin() );
        persona.setMail( personaDto.getMail() );
        persona.setNombreyApellido( personaDto.getNombreyApellido() );
        persona.setDescripcion( personaDto.getDescripcion() );

        return persona;
    }

    @Override
    public List<PersonaDto> allPersonasToPersonasDto(List<Persona> personas) {
        if ( personas == null ) {
            return null;
        }

        List<PersonaDto> list = new ArrayList<PersonaDto>( personas.size() );
        for ( Persona persona : personas ) {
            list.add( personaToPersonaDto( persona ) );
        }

        return list;
    }
}
