/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.holding.rest;

import co.com.prueba.DatosValidacionRequest;
import com.holding.dto.DatosValidacionRequestDto;
import com.holding.service.IFacadeIdentiService;
import com.holding.service.IIdentificacionService;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nicolas Sierra
 */
@RestController
@RequestMapping("/v.1/identification")
public class IdentificacionController {
    @Autowired
    IFacadeIdentiService facadeIdentiService;
    
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<String> getValidarIdentidad(@RequestBody DatosValidacionRequestDto datosValidar){
        Optional<String> json = facadeIdentiService.getValidateIdentity(datosValidar);
        if(!json.isPresent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(json.get(),HttpStatus.OK);
    }
    
}