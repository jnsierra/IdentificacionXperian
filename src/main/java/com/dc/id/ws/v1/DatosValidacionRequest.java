
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosValidacionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosValidacionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacion" type="{http://ws.id.dc.com/v1}identificacionRequest"/>
 *         &lt;element name="primerApellido">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nombres">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fechaExpedicion" type="{http://ws.id.dc.com/v1}fechaExpedicionRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosValidacionRequest", propOrder = {
    "identificacion",
    "primerApellido",
    "nombres",
    "fechaExpedicion"
})
public class DatosValidacionRequest {

    @XmlElement(required = true)
    protected IdentificacionRequest identificacion;
    @XmlElement(required = true)
    protected String primerApellido;
    @XmlElement(required = true)
    protected String nombres;
    @XmlElement(required = true)
    protected FechaExpedicionRequest fechaExpedicion;

    /**
     * Gets the value of the identificacion property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacionRequest }
     *     
     */
    public IdentificacionRequest getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacionRequest }
     *     
     */
    public void setIdentificacion(IdentificacionRequest value) {
        this.identificacion = value;
    }

    /**
     * Gets the value of the primerApellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Sets the value of the primerApellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Gets the value of the nombres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Sets the value of the nombres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Gets the value of the fechaExpedicion property.
     * 
     * @return
     *     possible object is
     *     {@link FechaExpedicionRequest }
     *     
     */
    public FechaExpedicionRequest getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Sets the value of the fechaExpedicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link FechaExpedicionRequest }
     *     
     */
    public void setFechaExpedicion(FechaExpedicionRequest value) {
        this.fechaExpedicion = value;
    }

}
