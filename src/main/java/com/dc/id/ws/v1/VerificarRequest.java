
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verificarRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verificarRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUsuarioEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paramProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="respuestas" type="{http://ws.id.dc.com/v1}respuestasRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificarRequest", propOrder = {
    "idUsuarioEntidad",
    "producto",
    "paramProducto",
    "respuestas"
})
public class VerificarRequest {

    protected String idUsuarioEntidad;
    @XmlElement(required = true)
    protected String producto;
    @XmlElement(required = true)
    protected String paramProducto;
    @XmlElement(required = true)
    protected RespuestasRequest respuestas;

    /**
     * Gets the value of the idUsuarioEntidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuarioEntidad() {
        return idUsuarioEntidad;
    }

    /**
     * Sets the value of the idUsuarioEntidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuarioEntidad(String value) {
        this.idUsuarioEntidad = value;
    }

    /**
     * Gets the value of the producto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Sets the value of the producto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducto(String value) {
        this.producto = value;
    }

    /**
     * Gets the value of the paramProducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamProducto() {
        return paramProducto;
    }

    /**
     * Sets the value of the paramProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamProducto(String value) {
        this.paramProducto = value;
    }

    /**
     * Gets the value of the respuestas property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestasRequest }
     *     
     */
    public RespuestasRequest getRespuestas() {
        return respuestas;
    }

    /**
     * Sets the value of the respuestas property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestasRequest }
     *     
     */
    public void setRespuestas(RespuestasRequest value) {
        this.respuestas = value;
    }

}
