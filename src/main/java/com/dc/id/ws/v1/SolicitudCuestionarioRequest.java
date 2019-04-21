
package com.dc.id.ws.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solicitudCuestionarioRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solicitudCuestionarioRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regValidacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minExclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudCuestionarioRequest", propOrder = {
    "tipoId",
    "identificacion",
    "regValidacion"
})
public class SolicitudCuestionarioRequest {

    @XmlElement(required = true)
    protected String tipoId;
    @XmlElement(required = true)
    protected String identificacion;
    @XmlElement(required = true)
    protected BigInteger regValidacion;

    /**
     * Gets the value of the tipoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoId() {
        return tipoId;
    }

    /**
     * Sets the value of the tipoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoId(String value) {
        this.tipoId = value;
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

    /**
     * Gets the value of the regValidacion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegValidacion() {
        return regValidacion;
    }

    /**
     * Sets the value of the regValidacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegValidacion(BigInteger value) {
        this.regValidacion = value;
    }

}
