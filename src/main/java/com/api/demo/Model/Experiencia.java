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
public class Experiencia{
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombrePuesto;
    private String nombreLugar;
    private String descripcion;
    private String fechaInicio;
    private String fechaFinal;
    
//    Para pruebas en postman:
//    {
//    "puestoExpe":"puestoPrueba",
//    "periodoExpe":"periodoPrueba",
//    "organismoExpe":"organismoPrueba",
//    "descripcionExpe":"descripcionPrueba",
//    "urlLogoExpe":"urlPrueba"
//    }
}