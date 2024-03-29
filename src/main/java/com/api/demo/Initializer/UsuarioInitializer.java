///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.api.demo.Initializer;
//
//import com.api.demo.Model.Usuario;
//import com.api.demo.Repository.UsuarioRepository;
//import javax.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Component;
//
///**
// *
// * @author valdiviaricardo
// */
//@Component
//public class UsuarioInitializer {
//
//    @Autowired
//    UsuarioRepository userRepo;
//
//    @PostConstruct
//    public void init() {
//        Usuario usuario = new Usuario();
//        usuario.setNombre("Ricardo");
//        usuario.setEmail("ricardovaldivia2003@gmail.com");
//        usuario.setPassword(new BCryptPasswordEncoder().encode("argentina_programa2023"));
//        userRepo.save(usuario);
//    }
//}
