/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aws_usuario.web.api;

import com.example.aws_usuario.model.Usuario;
import com.example.aws_usuario.model.repository.UsuarioRepository;
import com.example.aws_usuario.service.S3Service;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author THALY
 */
@RestController
@RequestMapping("/api/usuario")
public class CursoController {
    
     @Autowired
    private UsuarioRepository cursoRepository;
     @Autowired
     private S3Service s3Service;

    @GetMapping
    List<Usuario> getAll() {
        return cursoRepository.findAll().stream()
                .peek(Curso -> 
                        Curso.setFotoUrl(s3Service.getObjectUrl(Curso.getFotoUrl())))
                .collect(Collectors.toList());
    }

    @PostMapping
    Usuario create(@RequestBody Usuario curso) {
        cursoRepository.save(curso);
        curso.setFotoUrl(s3Service.getObjectUrl(curso.getFotopath()));
        curso.setCedulaUrl(s3Service.getObjectUrl(curso.getCedulaPath()));
        return curso;
    }
    
}
