/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.holding.dto;

import co.com.prueba.IdentificacionRequest;
import co.com.prueba.Respuesta;
import java.util.List;

/**
 *
 * @author Nicolas Sierra
 */
public class RespuestasRequestDto {

    private String idCuestionario;
    private String regCuestionario;
    private IdentificacionRequest identificacion;
    private List<RespuestaDto> respuesta;

    public String getIdCuestionario() {
        return idCuestionario;
    }

    public void setIdCuestionario(String idCuestionario) {
        this.idCuestionario = idCuestionario;
    }

    public String getRegCuestionario() {
        return regCuestionario;
    }

    public void setRegCuestionario(String regCuestionario) {
        this.regCuestionario = regCuestionario;
    }

    public IdentificacionRequest getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(IdentificacionRequest identificacion) {
        this.identificacion = identificacion;
    }

    public List<RespuestaDto> getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(List<RespuestaDto> respuesta) {
        this.respuesta = respuesta;
    }

}