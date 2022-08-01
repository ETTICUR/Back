/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.AyeCuretti.Interface;

import com.portfolio.AyeCuretti.Entity.Persona;
import java.util.List;

/**
 *
 * @author Aye
 */
public interface IPersonaService {
    //Traer persona//
    public List <Persona> getPersona ();
    //Guardar una persona//
    public void savePersona (Persona persona);
    //Borrar persona por ID//
    public void deletPersona (Long id);
    //buscar persona por ID//
    public Persona findPersona (Long id);

    public Persona finPersona(Long id);
}
