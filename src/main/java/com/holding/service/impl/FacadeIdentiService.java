/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.holding.service.impl;

import co.com.prueba.DatosValidacionRequest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.holding.dto.DatosValidacionRequestDto;
import com.holding.service.IFacadeIdentiService;
import com.holding.service.IIdentificacionService;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nicolas Sierra
 */
@Service
public class FacadeIdentiService implements IFacadeIdentiService {

    @Autowired
    IIdentificacionService identificacionService;
    @Autowired
    ModelMapper mapper;

    @Override
    public Optional<String> getValidateIdentity(DatosValidacionRequestDto datosValidacion) {
        String json = null;
        //Mapeamos el objeto necesario para llamar el web service y llamamos el mismo
        Optional<String> xmlResponse = identificacionService.getValidateIdentificacion(mapper.map(datosValidacion, DatosValidacionRequest.class));
        if (!xmlResponse.isPresent()) {
            return Optional.empty();
        }
        //Remplazamos los caracteres invalidos
        String xmlAux = replaceXml(xmlResponse.get());
        return Optional.of(xmlToJson(xmlAux));
    }

    /**
     * Metodo con el cual elimino caracteres incorrectos del xml
     *
     * @param xml
     * @return
     */
    public String replaceXml(String xml) {
        return xml.replaceAll("&lt;", "<");
    }

    /**
     * Metodo con el cual convierto un xml a un objeto Json
     *
     * @param xml
     * @return
     */
    public String xmlToJson(String xml) {
        String json = null;
        try {
            
            XmlMapper xmlMapper = new XmlMapper();

            JsonNode node = xmlMapper.readTree(xml.getBytes());
            ObjectMapper jsonMapper = new ObjectMapper();
            json = jsonMapper.writeValueAsString(node);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }
}
