
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respuesta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respuesta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPregunta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuesta", propOrder = {
    "idPregunta",
    "idRespuesta"
})
public class Respuesta {

    @XmlElement(required = true)
    protected String idPregunta;
    @XmlElement(required = true)
    protected String idRespuesta;

    /**
     * Gets the value of the idPregunta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPregunta() {
        return idPregunta;
    }

    /**
     * Sets the value of the idPregunta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPregunta(String value) {
        this.idPregunta = value;
    }

    /**
     * Gets the value of the idRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRespuesta() {
        return idRespuesta;
    }

    /**
     * Sets the value of the idRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRespuesta(String value) {
        this.idRespuesta = value;
    }

}
