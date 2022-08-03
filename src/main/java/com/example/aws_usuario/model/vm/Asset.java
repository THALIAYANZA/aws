/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aws_usuario.model.vm;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author THALY
 */

@Data
@AllArgsConstructor
public class Asset {
     private byte[] content;
    private String contentType;
    
}
