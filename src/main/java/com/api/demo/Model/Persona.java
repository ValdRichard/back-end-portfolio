/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.demo.Model;

/**
 *
 * @author valdiviaricardo
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String imageBanner;
    private String imageFotoPerfil;
    private String imageGithub;
    private String imageLinkedin;
    private String urlGithub;
    private String urlLinkedin;
    private String mail;
    private String nombreyApellido;
    private String descripcion;
//    Para pruebas en postman: 
//    {
//        "nombre":"Ricardo",
//        "apellido":"Valdivia",
//    }
}
