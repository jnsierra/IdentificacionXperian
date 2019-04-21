
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarParametrizacionesCompletasResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarParametrizacionesCompletasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultarParametrizacionesCompletasReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarParametrizacionesCompletasResponse", propOrder = {
    "consultarParametrizacionesCompletasReturn"
})
public class ConsultarParametrizacionesCompletasResponse {

    @XmlElement(required = true)
    protected String consultarParametrizacionesCompletasReturn;

    /**
     * Gets the value of the consultarParametrizacionesCompletasReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultarParametrizacionesCompletasReturn() {
        return consultarParametrizacionesCompletasReturn;
    }

    /**
     * Sets the value of the consultarParametrizacionesCompletasReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultarParametrizacionesCompletasReturn(String value) {
        this.consultarParametrizacionesCompletasReturn = value;
    }

}
