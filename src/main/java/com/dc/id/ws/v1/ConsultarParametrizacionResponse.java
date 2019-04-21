
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarParametrizacionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarParametrizacionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultarParametrizacionReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarParametrizacionResponse", propOrder = {
    "consultarParametrizacionReturn"
})
public class ConsultarParametrizacionResponse {

    @XmlElement(required = true)
    protected String consultarParametrizacionReturn;

    /**
     * Gets the value of the consultarParametrizacionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsultarParametrizacionReturn() {
        return consultarParametrizacionReturn;
    }

    /**
     * Sets the value of the consultarParametrizacionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsultarParametrizacionReturn(String value) {
        this.consultarParametrizacionReturn = value;
    }

}
