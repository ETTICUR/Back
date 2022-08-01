/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.AyeCuretti.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
/**
 *
 * @author Aye
 */
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min=1,max=50, message= "no es posible registrar con esta longitud de caracteres")
  private String nombre;
    @NotNull
    @Size(min=1,max=50, message= "no es posible registrar con esta longitud de caracteres")
  private String apellido;
    @NotNull
    @Size(min=1,max=50, message= "no es posible registrar con esta longitud de caracteres")
  private String img;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setImg(String img) {
        this.img = img;
    }
    

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getImg() {
        return img;
    }
    
    
  }
