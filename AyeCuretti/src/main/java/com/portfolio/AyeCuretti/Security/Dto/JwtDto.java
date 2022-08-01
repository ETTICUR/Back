package com.portfolio.AyeCuretti.Security.Dto;

import java.util.Collection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aye
 */
public class JwtDto {
    private String token;
    private String bearer = "Bearer";
    private String nombreUsuario;
    private Collection<? extends GranteAuthority> aauthorities;
    
    //Constructor

    public JwtDto(String token, String nombreUsuario, Collection<? extends Granteauthorities aauthorities) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.aauthorities = aauthorities;
    }
    
    //Getter and Steter

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GranteAuthority> getAauthorities() {
        return aauthorities;
    }

    public void setAauthorities(Collection<? extends GranteAuthority> aauthorities) {
        this.aauthorities = aauthorities;
    }
    
    
    
}
