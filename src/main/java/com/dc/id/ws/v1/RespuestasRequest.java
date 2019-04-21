
package com.dc.id.ws.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respuestasRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respuestasRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCuestionario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regCuestionario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificacion" type="{http://ws.id.dc.com/v1}identificacionRequest"/>
 *         &lt;element name="respuesta" type="{http://ws.id.dc.com/v1}respuesta" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestasRequest", propOrder = {
    "idCuestionario",
    "regCuestionario",
    "identificacion",
    "respuesta"
})
public class RespuestasRequest {

    @XmlElement(required = true)
    protected String idCuestionario;
    @XmlElement(required = true)
    protected String regCuestionario;
    @XmlElement(required = true)
    protected IdentificacionRequest identificacion;
    @XmlElement(required = true)
    protected List<Respuesta> respuesta;

    /**
     * Gets the value of the idCuestionario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCuestionario() {
        return idCuestionario;
    }

    /**
     * Sets the value of the idCuestionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCuestionario(String value) {
        this.idCuestionario = value;
    }

    /**
     * Gets the value of the regCuestionario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegCuestionario() {
        return regCuestionario;
    }

    /**
     * Sets the value of the regCuestionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegCuestionario(String value) {
        this.regCuestionario = value;
    }

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
     * Gets the value of the respuesta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respuesta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespuesta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Respuesta }
     * 
     * 
     */
    public List<Respuesta> getRespuesta() {
        if (respuesta == null) {
            respuesta = new ArrayList<Respuesta>();
        }
        return this.respuesta;
    }

}
