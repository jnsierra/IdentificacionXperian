
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preguntasRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="preguntasRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idUsuarioEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paramProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="canal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="solicitudCuestionario" type="{http://ws.id.dc.com/v1}solicitudCuestionarioRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preguntasRequest", propOrder = {
    "idUsuarioEntidad",
    "paramProducto",
    "producto",
    "canal",
    "solicitudCuestionario"
})
public class PreguntasRequest {

    protected String idUsuarioEntidad;
    @XmlElement(required = true)
    protected String paramProducto;
    @XmlElement(required = true)
    protected String producto;
    @XmlElement(required = true)
    protected String canal;
    @XmlElement(required = true)
    protected SolicitudCuestionarioRequest solicitudCuestionario;

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
     * Gets the value of the canal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Gets the value of the solicitudCuestionario property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudCuestionarioRequest }
     *     
     */
    public SolicitudCuestionarioRequest getSolicitudCuestionario() {
        return solicitudCuestionario;
    }

    /**
     * Sets the value of the solicitudCuestionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudCuestionarioRequest }
     *     
     */
    public void setSolicitudCuestionario(SolicitudCuestionarioRequest value) {
        this.solicitudCuestionario = value;
    }

}
