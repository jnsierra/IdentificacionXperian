/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.holding.service;

import co.com.prueba.DatosValidacionRequest;
import co.com.prueba.RespuestasRequest;
import co.com.prueba.SolicitudCuestionarioRequest;
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
    /**
     * Metodo con el cual solicito las preguntas de validacion 
     * @param solicitudCuestionarioRequest
     * @return 
     */
    Optional< String > getQuestions(SolicitudCuestionarioRequest solicitudCuestionarioRequest);
    /**
     * Metodo con el cual se debe verificar la autenticidad de las preguntas respondidas
     * @param respuestas
     * @return 
     */
    Optional< String > getVerify(RespuestasRequest respuestas);
    
}
