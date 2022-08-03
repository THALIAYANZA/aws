/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aws_usuario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author THALY
 */

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Usuario {
    
    @Id
    @GeneratedValue
    private Integer id;
    @NonNull
    private String name;
    
    private String clave;
    
    private String email;
    
    private String estado;
    
    private String fotopath;
    
    private String cedulaPath;
    
    @Transient
    private String fotoUrl;
    @Transient
    private String cedulaUrl;
    
    
    
}
