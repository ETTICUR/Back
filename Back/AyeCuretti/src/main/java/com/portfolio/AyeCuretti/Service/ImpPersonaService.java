/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.AyeCuretti.Service;

import com.portfolio.AyeCuretti.Entity.Persona;
import com.portfolio.AyeCuretti.Interface.IPersonaService;
import com.portfolio.AyeCuretti.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aye
 */
@Service
/**
 *
 * @author Aye
 */
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
           List <Persona> persona = ipersonaRepository.findAll();
           return persona;
    }

    @Override
    public void savePersona(Persona persona){
       ipersonaRepository.save(persona);    
    }

    @Override
    public void deletPersona(Long id) {
       ipersonaRepository.deleteById(id);      
                
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }

    @Override
    public Persona finPersona(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

