/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.AyeCuretti.Repository;

import com.portfolio.AyeCuretti.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

/**
 *
 * @author Aye
 */
public interface IPersonaRepository  extends JpaRepository <Persona,Long> {
    
}
