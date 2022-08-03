/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.aws_usuario.model.repository;

import com.example.aws_usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author THALY
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
