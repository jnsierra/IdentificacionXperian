/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.holding.service;

import com.holding.dto.DatosValidacionRequestDto;
import java.util.Optional;

/**
 *
 * @author Nicolas Sierra
 */
public interface IFacadeIdentiService {
    /**
     * Metodo con el cual se valida la identidad de un cliente
     * @param datosValidacion
     * @return 
     */
    Optional<String> getValidateIdentity(DatosValidacionRequestDto datosValidacion);
    
}
