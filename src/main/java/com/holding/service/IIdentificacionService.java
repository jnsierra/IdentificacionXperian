/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.holding.service;

import co.com.prueba.DatosValidacionRequest;
import java.util.Optional;

/**
 *
 * @author Nicolas Sierra
 */
public interface IIdentificacionService {
    /**
     * Metodo con el cual se valida la identidad del usuario por medio de los service del usuario
     * @return 
     */
    Optional<String> getValidateIdentificacion(DatosValidacionRequest _validar_datosValidacion);
    
}
