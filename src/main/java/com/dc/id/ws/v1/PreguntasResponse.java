
package com.dc.id.ws.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for preguntasResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="preguntasResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preguntasReturn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preguntasResponse", propOrder = {
    "preguntasReturn"
})
public class PreguntasResponse {

    @XmlElement(required = true)
    protected String preguntasReturn;

    /**
     * Gets the value of the preguntasReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreguntasReturn() {
        return preguntasReturn;
    }

    /**
     * Sets the value of the preguntasReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreguntasReturn(String value) {
        this.preguntasReturn = value;
    }

}
