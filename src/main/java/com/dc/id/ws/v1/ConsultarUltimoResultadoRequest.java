
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarUltimoResultadoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarUltimoResultadoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUsuarioEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipo_identificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarUltimoResultadoRequest", propOrder = {
    "idUsuarioEntidad",
    "producto",
    "nit",
    "tipoIdentificacion",
    "identificacion"
})
public class ConsultarUltimoResultadoRequest {

    protected String idUsuarioEntidad;
    @XmlElement(required = true)
    protected String producto;
    @XmlElement(required = true)
    protected String nit;
    @XmlElement(name = "tipo_identificacion", required = true)
    protected String tipoIdentificacion;
    @XmlElement(required = true)
    protected String identificacion;

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
     * Gets the value of the nit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNit() {
        return nit;
    }

    /**
     * Sets the value of the nit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNit(String value) {
        this.nit = value;
    }

    /**
     * Gets the value of the tipoIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Sets the value of the tipoIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacion(String value) {
        this.tipoIdentificacion = value;
    }

    /**
     * Gets the value of the identificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacion(String value) {
        this.identificacion = value;
    }

}
