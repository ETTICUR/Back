/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.AyeCuretti.Security.Controller;

import com.portfolio.AyeCuretti.Security.Repository.Service.RolService;
import com.portfolio.AyeCuretti.Security.Repository.Service.UsuarioService;
import com.portfolio.AyeCuretti.Security.jwt.JwtProvider;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aye
 */
@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    RolService rolService;
    @Autowired
    JwtProvider jwtProvider;
 
}

//@PostMapping ("/login")
        //{public ResponseEntity <JwtDTO> login @Valid @RequestBody LoginUsuario loginUsuario, BindingResult bindingResult){
//if(bindingResult.hasErrors())
//return new ResponseEntity(new message ("Campos erroneos"),HttpStatus.BAD_REQUEST);
        
  //   Authentication authentication = authenticationManager.authenticate(new UsernamePawwordAuthenticationToken(
//loginUsuario.getNombreUsuario(),loginUsuario.getPassword()));
  //   SecurityContextHolder.getContext().setAuthentication(authentication);
    // String jwtDto = new JwtDto(jwt, userDetails.getUsername(),userDetails.getAuthorities());
    // return new ResponseEntity(jwDto, HttpStatus.OK);
    

