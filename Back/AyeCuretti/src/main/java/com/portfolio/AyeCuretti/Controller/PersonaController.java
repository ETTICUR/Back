/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.AyeCuretti.Controller;

import com.portfolio.AyeCuretti.Entity.Persona;
import com.portfolio.AyeCuretti.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "https://localhost:4200")
/**
 *
 * @author Aye
 */
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List <Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/pesonas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "Se ha grabado la persona";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/persona/borrar/(id)")
    public String deletePersona(@PathVariable Long id){
        ipersonaService.deletPersona(id);
        return "Se ha borrado a la persona";
    }
    
    //URL:PUERTO/persona/editar/
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/(id)")
    public Persona editPersona (@PathVariable Long id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("apellido") String nuevoApellido,
                                @RequestParam("img") String nuevoImg){
            
        Persona persona= ipersonaService.finPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setNombre(nuevoNombre);
        persona.setNombre(nuevoNombre);
        
        ipersonaService.savePersona(persona);
        return persona;
    }
}
